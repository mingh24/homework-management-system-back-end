package com.yi.homework.manager;

/**
 * Project Name: homework-management-system-back-end
 * File Name: BaseManager
 * Package Name: com.yi.homework.manager
 *
 * @author yipple
 * @date 2020/6/16
 * @since 0.0.1
 */
public class BaseManager {

    protected int calculatePageNum(int recordNum, int pageSize) {
        return recordNum % pageSize == 0 ? recordNum / pageSize : recordNum / pageSize + 1;
    }

}
