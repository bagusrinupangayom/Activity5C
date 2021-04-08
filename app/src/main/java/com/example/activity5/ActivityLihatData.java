package com.example.activity5;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNaKon);
        tvnomor = findViewById(R.id.tvNoTel);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama){
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08133224455");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08125533344");
                break;
            case "Fikri":
                tvnama.setText("Fikri P");
                tvnomor.setText("08122555344");
                break;
            case "Maul":
                tvnama.setText("Maul D");
                tvnomor.setText("08122969444");
                break;
            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("08122969444");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08125556344");
                break;
            case "Gita":
                tvnama.setText("Gita M");
                tvnomor.setText("08122969444");
                break;
            case "Vian":
                tvnama.setText("Vian V");
                tvnomor.setText("08122969444");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi r");
                tvnomor.setText("08122969444");
                break;

        }
    }
}
