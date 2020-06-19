package com.yi.homework.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yi.homework.model.entity.StudentHomework;
import com.yi.homework.model.vo.response.table.StudentHomeworkItemVO;
import org.springframework.stereotype.Repository;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentHomeworkMapper
 * Package Name: com.yi.homework.dao.mapper
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Repository
public interface StudentHomeworkMapper extends BaseMapper<StudentHomework> {

    Integer count(Long teacherId, Long homeworkId, String homeworkTitle, Long studentId, String studentName);

    IPage<StudentHomeworkItemVO> getPage(IPage<StudentHomeworkItemVO> page, Long teacherId, Long homeworkId, String homeworkTitle, Long studentId, String studentName);

    Integer countWithTeacherComment(Long homeworkId, String homeworkTitle, Long studentId, String studentName);

    IPage<StudentHomeworkItemVO> getPageWithTeacherComment(IPage<com.yi.homework.model.vo.response.table.StudentHomeworkItemVO> page, Long homeworkId, String homeworkTitle, Long studentId, String studentName);

    Integer countWithoutTeacherComment(Long homeworkId, String homeworkTitle, Long studentId, String studentName);

    IPage<StudentHomeworkItemVO> getPageWithoutTeacherComment(IPage<com.yi.homework.model.vo.response.table.StudentHomeworkItemVO> page, Long homeworkId, String homeworkTitle, Long studentId, String studentName);

    StudentHomeworkItemVO getStudentHomework(Long studentId, Long homeworkId);

}
