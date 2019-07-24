package com.ruoyi.back.service;
import com.ruoyi.back.domain.StudentInfo;

/**
 * 学生信息 服务层
 *
 * @author sun
 */
public interface IStudentInfoService {
    /**
    * 查询学生基本信息
    *
    * @param userId 学生/用户ID
    * @return 学生信息
    */
    public StudentInfo SelectStudentInfoById(Long userId);
}