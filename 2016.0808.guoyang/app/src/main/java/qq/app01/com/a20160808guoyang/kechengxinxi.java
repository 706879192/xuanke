package qq.app01.com.a20160808guoyang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import qq.app01.com.a20160808guoyang.beans.CourseModel;
import qq.app01.com.a20160808guoyang.beans.Student;

public class kechengxinxi extends AppCompatActivity {

    private Student mStudent;
    private  CourseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kechengxinxi);

        ListView listView = (ListView) findViewById(R.id.listview);
        adapter = new CourseAdapter(this);
        listView.setAdapter(adapter);

        CourseList application = (CourseList)getApplication();
        adapter.setList(application.courseModels);
        }
    //返回按钮
    public  void  finsh(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        finish();
    }
}
