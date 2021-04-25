package com.tikola.kaboom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonLiakozzz, buttonXristou, buttonNikolas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLiakozzz = (Button) findViewById(R.id.buttonLiakozzz);
        buttonXristou = (Button) findViewById(R.id.buttonXristou);
        buttonNikolas = (Button) findViewById(R.id.buttonNikolas);
    }

    public void gotoLiakozzzSoundBoard(View view) {
        Intent intent = new Intent(MainActivity.this, LiakozzzSoundBoard.class);
        startActivity(intent);
    }

    public void gotoXristouSoundBoard(View view) {
        Intent intent = new Intent(MainActivity.this, XristouSoundBoard.class);
        startActivity(intent);
    }

    public void gotoNikolasSoundBoard(View view) {
        Intent intent = new Intent(MainActivity.this, NikolasSoundBoard.class);
        startActivity(intent);
    }
}