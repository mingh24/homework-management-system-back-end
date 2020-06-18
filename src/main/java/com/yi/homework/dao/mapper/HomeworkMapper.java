package com.yi.homework.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yi.homework.model.entity.Homework;
import com.yi.homework.model.vo.response.table.HomeworkItemVO;
import org.springframework.stereotype.Repository;

/**
 * Project Name: homework-management-system-back-end
 * File Name: HomeworkMapper
 * Package Name: com.yi.homework.dao.mapper
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Repository
public interface HomeworkMapper extends BaseMapper<Homework> {

    Integer count(Long homeworkId, String homeworkTitle);

    IPage<HomeworkItemVO> getPage(IPage<HomeworkItemVO> page, Long homeworkId, String homeworkTitle);

}
