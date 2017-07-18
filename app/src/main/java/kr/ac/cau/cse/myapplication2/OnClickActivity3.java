package kr.ac.cau.cse.myapplication2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class OnClickActivity3 extends AppCompatActivity {

    private static final String TAG = "OnClickActivity3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListener myListener= new MyListener();
        findViewById(R.id.my_button).setOnClickListener(myListener);
    }
    private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.my_button:
                    Log.d(TAG,"button 1 clicked");
                    break;
                case R.id.my_button2:
                    Log.d(TAG,"button 2 clicked");
                    break;
            }
        }
    }
}
