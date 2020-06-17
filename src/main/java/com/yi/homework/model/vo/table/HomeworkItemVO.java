package com.yi.homework.model.vo.table;

import lombok.Data;

/**
 * Project Name: homework-management-system-back-end
 * File Name: HomeworkItemVO
 * Package Name: com.yi.homework.model.vo.table
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Data
public class HomeworkItemVO {

    private Long homeworkId;

    private Long teacherId;

    private String homeworkTitle;

    private String homeworkContent;

}
