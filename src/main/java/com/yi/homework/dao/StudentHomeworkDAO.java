package com.yi.homework.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yi.homework.dao.mapper.StudentHomeworkMapper;
import com.yi.homework.model.entity.StudentHomework;
import com.yi.homework.model.vo.table.StudentHomeworkItemVO;
import org.springframework.stereotype.Repository;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentHomework
 * Package Name: com.yi.homework.dao
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Repository
public class StudentHomeworkDAO extends BaseDAO {

    public static final int PAGE_SIZE = 20;

    private final StudentHomeworkMapper studentHomeworkMapper;

    public StudentHomeworkDAO(StudentHomeworkMapper studentHomeworkMapper) {
        this.studentHomeworkMapper = studentHomeworkMapper;
    }

    public int insert(StudentHomework studentHomework) {
        return studentHomeworkMapper.insert(studentHomework);
    }

    public int deleteById(Long studentHomeworkId) {
        return studentHomeworkMapper.deleteById(studentHomeworkId);
    }

    public int updateById(StudentHomework studentHomework) {
        return studentHomeworkMapper.updateById(studentHomework);
    }

    public StudentHomework selectById(Long studentHomeworkId) {
        return studentHomeworkMapper.selectById(studentHomeworkId);
    }

    public int count(Long studentId, String studentName) {
        return studentHomeworkMapper.count(studentId, studentName);
    }

    IPage<StudentHomeworkItemVO> getPage(Integer index, Long studentId, String studentName) {
        Page<StudentHomeworkItemVO> page = new Page<>();
        return studentHomeworkMapper.getPage(page, studentId, studentName);
    }

}
