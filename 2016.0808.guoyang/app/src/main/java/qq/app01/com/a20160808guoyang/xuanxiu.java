package qq.app01.com.a20160808guoyang;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import qq.app01.com.a20160808guoyang.beans.Student;

public class xuanxiu extends AppCompatActivity{
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xuanxiu);
        Button button = (Button) findViewById(R.id.tijiao);
        assert  button !=null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(xuanxiu.this,xuanxiu2.class);
                intent.putExtra("student",getStudent());
                startActivity(intent);
            }
        });
    }
    public Student getStudent(){

        //姓名
        EditText editText = (EditText) findViewById(R.id.name_edit);
        String studentname = editText.getText().toString();

        //性别
        int sex = 1;
        RadioButton boy_Button = (RadioButton) findViewById(R.id.boy);
        RadioButton gril_Button = (RadioButton) findViewById(R.id.gril);

        if (boy_Button.isChecked()){
             sex = 1;
        }else if (gril_Button.isChecked()){
            sex = 2;
        }
        //年龄
        int age = 0;
        EditText age_editText = (EditText) findViewById(R.id.age_edit);
        String agestr = age_editText.getText().toString();

        try {
            age = Integer.parseInt(agestr);
        }catch (NumberFormatException e){
            age = 0;
        }
        Student student = new Student(studentname,age,sex);
        return student;
    }
    //返回按钮
    public  void  finsh(View view){
       ImageView imageView = (ImageView) findViewById(R.id.imageview);
        finish();
    }
    //存放所有的Activity
    public static List<Activity> activityList = new ArrayList<Activity>();
}
