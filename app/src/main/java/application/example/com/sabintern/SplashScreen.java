package application.example.com.sabintern;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Dell on 28-11-2017.
 */

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreen.this,SignUpActivity.class);
                startActivity(i);


            }
        };
        Timer t= new Timer();
        t.schedule(tt,6000);

    }
}
