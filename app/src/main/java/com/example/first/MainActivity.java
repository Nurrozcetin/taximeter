package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView text_km, text_ucret;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekbar);
        text_km = findViewById(R.id.text_km);
        text_ucret = findViewById(R.id.text_ucret);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int deger = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                deger = progress;
                text_km.setText(""+deger+" KM ");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int km_ucret = 10;
                int tutar = km_ucret * deger;
                text_ucret.setText(""+tutar+" TL");

            }
        });
    }
}