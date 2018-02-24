package com.example.user.binarbinariahya_1202152323_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class Splash extends AppCompatActivity {
    //mengatur waktu splash selama 3 detik
    private static int splashInterval = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//command ini digunakan untuk membuat layar aplikasi menjadi full screen//
        setContentView(R.layout.activity_splash);

        //waktu pengeksekusian dan lama penundaan hingga runnable di eksekusi
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(Splash.this, Login.class); //pindah screen
                startActivity(a);
                Toast.makeText(Splash.this, "Selamat Datang", Toast.LENGTH_LONG).show(); //menampilkan toast
                this.finish();//untuk menampilkan pop up tulisan yang kita inginkan//
            }

            private void finish() {

            }
        }, splashInterval);
    }
}
