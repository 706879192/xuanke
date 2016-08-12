package qq.app01.com.a20160808guoyang.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 赵文杰 on 2016/8/9.
 */
public class CourseModel {
    private String classNo;
    private String className;
    private  Teacher teacher;
    private List<Student> students = new ArrayList<Student>();

    public CourseModel(String classNo, String className, Teacher teacher, List<Student> students) {
        this.classNo = classNo;
        this.className = className;
        this.teacher = teacher;
        this.students = students;
    }
    /*
    * 学生选课
    *（1）补课重复添加
    * （2）最多的可选人数20
    */
    public  boolean  addStudent(Student mStudent){
            if (mStudent == null){
                return false;
            }
        String name = mStudent.getStudentName();

        for (Student s:students) {
              if (name.equals(s.getStudentName())){
                return  false;
              }
        }
        if (students.size()>=20){
                return  false;
        }
        students.add(mStudent);

        return true;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
