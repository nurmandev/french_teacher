package com.nurmandev.french_teacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

Button blackBtn, yellowBtn, redBtn, purpleBtn, greenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        blackBtn = findViewById(R.id.blackButton);
        yellowBtn = findViewById(R.id.yelloButton);
        redBtn = findViewById(R.id.redButton);
        purpleBtn = findViewById(R.id.purpleButton);
        greenBtn = findViewById(R.id.greenButton);


        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int clickedBtnId = v.getId();

        if (clickedBtnId == R.id.redButton) {
            PlaySound(R.raw.red);
        } else if (clickedBtnId == R.id.blackButton) {
            PlaySound(R.raw.black);
        } else if (clickedBtnId == R.id.yelloButton) {
            PlaySound(R.raw.yellow);
        } else if (clickedBtnId == R.id.purpleButton) {
            PlaySound(R.raw.purple);
        } else if (clickedBtnId == R.id.greenButton) {
            PlaySound(R.raw.green);
        }
    }

    public void PlaySound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}