package qq.app01.com.a20160808guoyang.beans;

import java.io.Serializable;

/**
 * Created by 赵文杰 on 2016/8/9.
 */
public class Student implements Serializable{
    private String studentName;
    private  int sex;
    private  int age;

    public Student(String studentName, int sex, int age) {
        this.studentName = studentName;
        this.sex = sex;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
