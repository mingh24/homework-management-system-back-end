package com.yi.homework.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yi.homework.dao.mapper.StudentMapper;
import com.yi.homework.model.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentDAO
 * Package Name: com.yi.homework.dao
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Repository
public class StudentDAO extends BaseDAO {

    public static final int PAGE_SIZE = 20;

    private final StudentMapper studentMapper;

    public StudentDAO(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    public int deleteById(Long studentId) {
        return studentMapper.deleteById(studentId);
    }

    public int updateById(Student student) {
        return studentMapper.updateById(student);
    }

    public Student selectById(Long studentId) {
        return studentMapper.selectById(studentId);
    }

    public Student selectByStringId(String studentId) {
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Student::getStudentId, studentId);
        return studentMapper.selectOne(wrapper);
    }

}
