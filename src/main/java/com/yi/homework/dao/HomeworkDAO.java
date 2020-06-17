package com.yi.homework.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yi.homework.dao.mapper.HomeworkMapper;
import com.yi.homework.model.entity.Homework;
import com.yi.homework.model.vo.table.HomeworkItemVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project Name: homework-management-system-back-end
 * File Name: HomeworkDAO
 * Package Name: com.yi.homework.dao.mapper
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Repository
public class HomeworkDAO extends BaseDAO {

    public static final int PAGE_SIZE = 20;

    private final HomeworkMapper homeworkMapper;

    public HomeworkDAO(HomeworkMapper homeworkMapper) {
        this.homeworkMapper = homeworkMapper;
    }

    public int insert(Homework homework) {
        return homeworkMapper.insert(homework);
    }

    public int deleteById(Long homeworkId) {
        return homeworkMapper.deleteById(homeworkId);
    }

    public int updateById(Homework homework) {
        return homeworkMapper.updateById(homework);
    }

    public Homework selectById(Long homeworkId) {
        return homeworkMapper.selectById(homeworkId);
    }

    public int count(Long homeworkId, String homeworkTitle) {
        return homeworkMapper.count(homeworkId, homeworkTitle);
    }

    public List<HomeworkItemVO> getPage(Integer index, Long homeworkId, String homeworkTitle) {
        Page<HomeworkItemVO> page = new Page<>(index, PAGE_SIZE);
        return homeworkMapper.getPage(page, homeworkId, homeworkTitle).getRecords();
    }

}
