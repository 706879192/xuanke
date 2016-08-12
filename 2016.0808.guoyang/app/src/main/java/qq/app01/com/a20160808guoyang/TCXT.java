package qq.app01.com.a20160808guoyang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TCXT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcxt);



    }
    //返回按钮
    public  void  finsh(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        finish();
    }
}
