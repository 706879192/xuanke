package qq.app01.com.a20160808guoyang;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //退出系统
        PublicWay.activityList.add(this);
        TextView textView = (TextView) findViewById(R.id.t6);
        assert textView !=null;
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 遍历Activity集合，关闭所有集合内的Activity
                for(int i=0;i<PublicWay.activityList.size();i++){

                    if (null != PublicWay.activityList.get(i)) {
                        PublicWay.activityList.get(i).finish();
                    }
                }
            }

        });

        RelativeLayout xuanxiu = (RelativeLayout) findViewById(R.id.R1);
        xuanxiu.setOnClickListener(MainActivity.this);

        RelativeLayout kechengxinxi = (RelativeLayout) findViewById(R.id.R2);
        kechengxinxi.setOnClickListener(MainActivity.this);

        RelativeLayout chaxun = (RelativeLayout) findViewById(R.id.R3);
        chaxun.setOnClickListener(MainActivity.this);

        RelativeLayout kechen = (RelativeLayout) findViewById(R.id.R4);
        kechen.setOnClickListener(MainActivity.this);

        RelativeLayout tuichuxitong = (RelativeLayout) findViewById(R.id.R5);
        tuichuxitong.setOnClickListener(MainActivity.this);


    }
    public  void  onClick(View v){

        int id = v.getId();
        if (id == R.id.t1){
             Intent intent = new Intent(this,xuanxiu.class);
              startActivity(intent);

        }else if(id == R.id.t2){
            Intent intent = new Intent(this,kechengxinxi.class);
            startActivity(intent);
        }
        else if(id == R.id.t3){
            Intent intent = new Intent(this,chaxunxueshengxinxi.class);
            startActivity(intent);
        }
        else if(id == R.id.t4){
            Intent intent = new Intent(this,kechenxiangxi.class);
            startActivity(intent);
        }
    }




}
