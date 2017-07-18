package kr.ac.cau.cse.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {
    TextView textView;
    private static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        count++;
        textView = (TextView)findViewById(R.id.tv_count2);
        textView.setText(""+count);
        findViewById(R.id.bt_count_reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                textView.setText(""+count);
            }
        });
        findViewById(R.id.bt_count_exit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);

                finish();
                if(OnClickActivity.onClickActivity!=null)
                OnClickActivity.onClickActivity.finish();
                android.os.Process.killProcess(android.os.Process.myPid());

            }
        });
    }
}
