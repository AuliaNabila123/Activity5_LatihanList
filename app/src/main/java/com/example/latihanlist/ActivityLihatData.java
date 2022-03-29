package com.example.latihanlist;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lihatdata_activity);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Aulia":
                tvnama.setText("Aulia Realisti");
                tvnomor.setText("083739934769");
                break;
            case "Nabila":
                tvnama.setText("Nabila Sari");
                tvnomor.setText("085342572114");
                break;
            case "Syafii":
                tvnama.setText("Syafii Arif");
                tvnomor.setText("085791084320");
                break;
            case "Rezka":
                tvnama.setText("Rezka Mulya");
                tvnomor.setText("081035802013");
                break;
            case "Dheva":
                tvnama.setText("Dheva Nendra");
                tvnomor.setText("081012457431");
                break;
        }
    }
}

