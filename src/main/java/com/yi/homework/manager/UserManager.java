package com.yi.homework.manager;

import com.yi.homework.dao.StudentDAO;
import com.yi.homework.dao.TeacherDAO;
import com.yi.homework.model.bo.AuthInfoBO;
import com.yi.homework.model.constant.UserType;
import com.yi.homework.model.entity.Student;
import com.yi.homework.model.entity.Teacher;
import com.yi.homework.util.Md5Encrypt;
import org.springframework.stereotype.Component;

/**
 * Project Name: homework-management-system-back-end
 * File Name: UserManager
 * Package Name: com.yi.homework.manager
 *
 * @author yipple
 * @date 2020/6/17
 * @since 0.0.1
 */
@Component
public class UserManager extends BaseManager {

    private final StudentDAO studentDAO;

    private final TeacherDAO teacherDAO;

    private final Md5Encrypt md5Encrypt;

    public UserManager(StudentDAO studentDAO, TeacherDAO teacherDAO, Md5Encrypt md5Encrypt) {
        this.studentDAO = studentDAO;
        this.teacherDAO = teacherDAO;
        this.md5Encrypt = md5Encrypt;
    }

    public AuthInfoBO getAuthInfoByLoginId(String userId, Integer userType) {
        switch (userType) {
            case UserType.STUDENT:
                return AuthInfoBO.fromStudent(studentDAO.selectByStringId(userId));
            case UserType.TEACHER:
                return AuthInfoBO.fromTeacher(teacherDAO.selectByStringId(userId));
            default:
                return null;
        }
    }

    public Boolean checkIsUserIdValid(String userId, Integer userType) {
        switch (userType) {
            case UserType.STUDENT:
                return studentDAO.selectByStringId(userId) == null;
            case UserType.TEACHER:
                return teacherDAO.selectByStringId(userId) == null;
            default:
                return false;
        }
    }

    public Boolean register(String userId, String username, String password, Integer userType) {
        switch (userType) {
            case UserType.STUDENT:
                Student student = new Student();
                student.setStudentId(Long.valueOf(userId));
                student.setStudentName(username);
                student.setPassword(passwordMd5(password));
                return studentDAO.insert(student) > 0;
            case UserType.TEACHER:
                Teacher teacher = new Teacher();
                teacher.setTeacherId(Long.valueOf(userId));
                teacher.setTeacherName(username);
                teacher.setPassword(passwordMd5(password));
                return teacherDAO.insert(teacher) > 0;
            default:
                return false;
        }
    }

    public String passwordMd5(String password) {
        String reversedPassword = new StringBuffer(password).reverse().toString();
        return md5Encrypt.getHexString(password + reversedPassword);
    }

}
