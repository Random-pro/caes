package com.ruoyi.back.service.impl;

import com.ruoyi.back.domain.StudentInfo;
import com.ruoyi.back.mapper.StudentInfoMapper;
import com.ruoyi.back.service.IStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 学生信息 服务层实现
 *
 * @author sun
 * @date 2019-07-16
 */
@Service
public class StudentInfoServiceImpl implements IStudentInfoService
{
    @Autowired
    private StudentInfoMapper StudentInfoMapper;

    @Override
    public StudentInfo SelectStudentInfoById(Long userId) {
        return StudentInfoMapper.SelectStudentInfoById(userId);
    }
}
