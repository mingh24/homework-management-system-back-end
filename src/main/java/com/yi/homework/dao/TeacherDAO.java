package com.yi.homework.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yi.homework.dao.mapper.TeacherMapper;
import com.yi.homework.model.entity.Teacher;
import org.springframework.stereotype.Repository;

/**
 * Project Name: homework-management-system-back-end
 * File Name: TeacherDAO
 * Package Name: com.yi.homework.dao
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Repository
public class TeacherDAO extends BaseDAO {

    public static final int PAGE_SIZE = 7;

    private final TeacherMapper teacherMapper;

    public TeacherDAO(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    public int insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    public int deleteById(Long teacherId) {
        return teacherMapper.deleteById(teacherId);
    }

    public int updateById(Teacher teacher) {
        return teacherMapper.updateById(teacher);
    }

    public Teacher selectById(Long teacherId) {
        return teacherMapper.selectById(teacherId);
    }

    public Teacher selectByStringId(String teacherId) {
        LambdaQueryWrapper<Teacher> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Teacher::getTeacherId, teacherId);
        return teacherMapper.selectOne(wrapper);
    }

}
