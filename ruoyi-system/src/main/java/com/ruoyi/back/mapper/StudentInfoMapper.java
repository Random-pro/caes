package com.ruoyi.back.mapper;
import com.ruoyi.back.domain.StudentInfo;

/**
 * 学生信息 数据层
 *
 * @author sun
 */
public interface StudentInfoMapper {
    /**
     * 查询学生基本信息
     *
     * @param userId 学生/用户ID
     * @return 学生信息
     */
    public StudentInfo SelectStudentInfoById(Long userId);
}