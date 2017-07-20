package kr.ac.cau.cse.myapplication2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SplashActivity extends AppCompatActivity {
//    Handler handler;
    TextView textView;
    private  static final int LOGIN=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#135232")));
//        getActionBar().setBackgroundDrawable(new ColorDrawable(Color.RED));
//        textView = (TextView)findViewById(R.id.textView3);
//        handler = new Handler();
//
//        ArrayList<String> stringArrayList;
//        new TempThread().start();
//        Pair<String,Integer> stringint= new Pair<>("abc",2);
//        String string = stringint.getLeft();
//        Pair<String,String> stringstring;
        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
//                        startActivity(new Intent(SplashActivity.this,OnClickActivity.class));

//                        startActivity(new Intent("kr.ac.cau.cse.aaaa.LOGIN"));
                        startActivityForResult(new Intent("kr.ac.cau.cse.aaaa.LOGIN"),LOGIN);
//                        finish();
                    }
                },3000
        );
//        AsyncTask<Integer,String,String> task = new AsyncTask<Integer, String, String>() {
//            @Override
//            protected void onPreExecute() {
//                super.onPreExecute();
//                //main thread
//            }
//
//            @Override
//            protected String doInBackground(Integer... params) {
//                try {
//                    Thread.sleep(3000);
//                }catch (Exception e){
//
//                }
//                    return null;
//                //new thread
//            }
//
//            @Override
//            protected void onPostExecute(String s) {
//                super.onPostExecute(s);
//                startActivity(new Intent(SplashActivity.this,OnClickActivity.class));
//                finish();
//                //main thread
//            }
//        };
//        task.execute(1,2);
    }
//    private  class TempThread extends Thread{
//        @Override
//        public synchronized void start() {
//            super.start();
//            final String temp = "aaa";
////            textView.setText(temp);
//
//            handler.post(new Runnable() {
//                @Override
//                public void run() {
//                        textView.setText(temp);
//
//                }
//            });
//        }
//    }
//    private class Pair<T1,T2> {
//        T1 t1;
//        T2 t2;
//        Pair(T1 t1, T2 t2){
//            this.t1 = t1;
//            this.t2 = t2;
//        }
//        T1 getLeft(){
//            return t1;
//        }
//        T2 getRight(){
//            return t2;
//        }
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==LOGIN){
            if(resultCode==3){
                Toast.makeText(SplashActivity.this,"splash 에서"+data.getStringExtra("resultString"),Toast.LENGTH_SHORT).show();
            }else{

            }
        }
    }
}
