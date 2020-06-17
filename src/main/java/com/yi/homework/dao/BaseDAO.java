package com.yi.homework.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
 * Project Name: homework-management-system-back-end
 * File Name: BaseDAO
 * Package Name: com.yi.homework.dao
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
public class BaseDAO {

    <T> List<T> selectPage(BaseMapper<T> mapper, LambdaQueryWrapper<T> wrapper, int index, int size) {
        Page<T> page = new Page<>(index, size);
        return mapper.selectPage(page, wrapper).getRecords();
    }

}
