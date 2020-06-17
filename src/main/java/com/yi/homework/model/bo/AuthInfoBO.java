package com.yi.homework.model.bo;

import com.yi.homework.model.constant.UserType;
import com.yi.homework.model.entity.Student;
import com.yi.homework.model.entity.Teacher;
import lombok.Data;

/**
 * Project Name: homework-management-system-back-end
 * File Name: AuthInfoBO
 * Package Name: com.yi.homework.model.bo
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Data
public class AuthInfoBO {

    private Long id;

    private String name;

    private String password;

    private Integer userType;

    private AuthInfoBO(Long id, String name, String password, Integer userType) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.userType = userType;
    }

    public static AuthInfoBO fromStudent(Student student) {
        if (student == null) {
            return null;
        }

        return new AuthInfoBO(student.getStudentId(), student.getStudentName(), student.getPassword(), UserType.STUDENT);
    }

    public static AuthInfoBO fromTeacher(Teacher teacher) {
        if (teacher == null) {
            return null;
        }

        return new AuthInfoBO(teacher.getTeacherId(), teacher.getTeacherName(), teacher.getPassword(), UserType.TEACHER);
    }

}
