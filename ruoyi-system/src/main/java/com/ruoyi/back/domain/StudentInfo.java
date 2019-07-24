package com.ruoyi.back.domain;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生信息 sys_user
 *
 * @author sun
 */
public class StudentInfo extends BaseEntity
{
    /* 学生ID */
    private Long userId;

    /* 学生姓名 */
    private String userName;

    /* Email */
    private String email;

    /* 手机号码 */
    private String phonenumber;

    /* 性别 */
    private int sex;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long UserId) {
        this.userId = UserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String UserName) {
        this.userName = UserName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String Phonenumber) {
        this.phonenumber = phonenumber;
    }

    //0=男 1=女
    public String getSex() {
        return (this.sex == 0 ? "男" : "女");
    }

    public void setSex(String Sex) {
        this.sex = (Sex == "男" ? 0 : 1);
    }

    //重载 输出json
    @Override
    public String toString() {
        return "StudentInfo{" +
                "userId=" + userId +
                ", userName=\"" + userName + "\"" +
                ", Email=\"" + email + "\"" +
                ", Phonenumber=\"" + phonenumber + "\"" +
                ", Sex=\"" + getSex() + "\"" +
                "}";
    }
}
