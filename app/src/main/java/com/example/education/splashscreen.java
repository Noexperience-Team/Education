package com.example.education;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
public class splashscreen extends Activity {
 Handler handler;
 @Override
 protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);
     setContentView(R.layout.splashscreen);
     handler=new Handler();
     handler.postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent in=new Intent(splashscreen.this,MainActivity.class);
startActivity(in);
finish();
         }
     },3000);
 }
}
