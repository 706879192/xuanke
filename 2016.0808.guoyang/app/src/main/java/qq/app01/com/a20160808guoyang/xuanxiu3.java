package qq.app01.com.a20160808guoyang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

public class xuanxiu3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuanxiu3);

        Button button = (Button) findViewById(R.id.add_succse);
        assert  button !=null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    //返回按钮
    public  void  finsh(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        finish();
    }


}
