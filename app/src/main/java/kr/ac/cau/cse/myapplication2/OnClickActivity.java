package kr.ac.cau.cse.myapplication2;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OnClickActivity extends AppCompatActivity {
    public static OnClickActivity onClickActivity = null;
//    TextView m_textview;
    EditText editText;
    private static final String TAG = "OnClickActivity";
    @Override
    @TargetApi(24)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        View view = findViewById(R.id.my_textview);
//        final TextView textView = (TextView)view;
//        m_textview = (TextView)findViewById(R.id.my_textview);
        onClickActivity = this;
        editText = (EditText)findViewById(R.id.my_edit);

        final TextView textView = (TextView)findViewById(R.id.my_textview);
        findViewById(R.id.my_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button 1 clicked");
                textView.setText("A");
                textView.setBackgroundColor(Color.parseColor("#12CC12"));
                ComponentName cn = new ComponentName("kr.ac.cau.cse.myapplication","kr.ac.cau.cse.myapplication.MainActivity");
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(cn);
                intent.putExtra("name","me");
                startActivityForResult(intent,1);

//                출처: http://devbible.tistory.com/142 [devbible]
//                Intent intent = new Intent("com.oracle.auth.Lists");
//                startActivity(intent);

//                startActivity(new Intent(OnClickActivity.this,Main3Activity.class));


//                if (Build.VERSION.SDK_INT > 21) {
//                    textView.setBackgroundColor(OnClickActivity.this.getColor(R.color.black));
//                }else{
//
//                    textView.setBackgroundColor(Color.parseColor("#12CC12"));
//                }
            }
        });
        findViewById(R.id.my_button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"button 2 clicked");
                textView.setText("B");
                textView.setBackgroundColor(Color.parseColor("#232432"));
                String temp = editText.getText().toString();
                Toast.makeText(OnClickActivity.this, temp+"를 입력했습니다.",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(OnClickActivity.this,CountActivity.class);
                intent.putExtra("message",temp);

                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("activity result",""+data.getStringExtra("result"));

    }
}
