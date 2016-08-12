package qq.app01.com.a20160808guoyang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import qq.app01.com.a20160808guoyang.beans.CourseModel;
import qq.app01.com.a20160808guoyang.beans.Student;
import qq.app01.com.a20160808guoyang.beans.Teacher;

public class xuanxiu2 extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private Student mStudent;
    private  CourseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuanxiu2);

        Intent intent = getIntent();
        mStudent = (Student) intent.getSerializableExtra("student");
//        Toast.makeText(this,mStudent.getStudentName(),Toast.LENGTH_SHORT).show();
        ListView listView = (ListView) findViewById(R.id.listview);
        adapter = new CourseAdapter(this);
        listView.setAdapter(adapter);

        CourseList application = (CourseList)getApplication();
        adapter.setList(application.courseModels);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(this,"点击了"+position,Toast.LENGTH_SHORT).show();
         //将学生添加到课程的已选的课程的学生的集合中
        CourseList courseList =(CourseList) getApplication();
        CourseModel courseModel = courseList.courseModels.get(position);
        boolean isSuccse = courseModel.addStudent(mStudent);
        if (isSuccse){
//            Toast.makeText(this,"选课成功！",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(xuanxiu2.this,xuanxiu3.class);
            startActivity(intent);
            //通知适配器，重新加载
            adapter.notifyDataSetChanged();
        }else {
//            Toast.makeText(this,"选课失败！",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(xuanxiu2.this,xuanxiu4.class);
            startActivity(intent);
        }


    }
    public  void  finsh(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageview);//返回按钮
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }
}
