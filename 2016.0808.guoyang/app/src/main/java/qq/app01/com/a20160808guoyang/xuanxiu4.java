package qq.app01.com.a20160808guoyang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class xuanxiu4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuanxiu4);

        Button button = (Button) findViewById(R.id.add_flase);
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
