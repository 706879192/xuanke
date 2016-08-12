package qq.app01.com.a20160808guoyang;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import qq.app01.com.a20160808guoyang.beans.CourseModel;
import qq.app01.com.a20160808guoyang.beans.Student;
import qq.app01.com.a20160808guoyang.beans.Teacher;

/**
 * Created by 赵文杰 on 2016/8/10.
 */
public class CourseList extends Application {

    public List<AppCompatActivity> activities = new ArrayList<AppCompatActivity>();

    public List<CourseModel> courseModels = new ArrayList<CourseModel>();
    public void onCreate(){
        super.onCreate();
//        Toast.makeText(getApplicationContext(),"application",Toast.LENGTH_SHORT).show();
        courseModels.add(new CourseModel("1","JAVA",new Teacher("王老师"),new ArrayList<Student>()));
        courseModels.add(new CourseModel("2","Script",new Teacher("刘老师"),new ArrayList<Student>()));
        courseModels.add(new CourseModel("3","MySql",new Teacher("唐老师"),new ArrayList<Student>()));
        courseModels.add(new CourseModel("4","CSS",new Teacher("杨老师"),new ArrayList<Student>()));
        courseModels.add(new CourseModel("5","C++",new Teacher("孙老师"),new ArrayList<Student>()));


    }
}
