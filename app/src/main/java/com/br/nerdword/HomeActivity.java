package com.br.nerdword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sorteio, dados, frasesN, frasesM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sorteio = findViewById(R.id.btnSorteio);
        sorteio.setOnClickListener(this);

        dados = findViewById(R.id.btnDados);
        dados.setOnClickListener(this);

        frasesN = findViewById(R.id.btnFNerd);
        frasesN.setOnClickListener(this);

        frasesM = findViewById(R.id.btnFMot);
        frasesM.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSorteio:
                startActivity(new Intent(this, SorteioActivity.class));
                break;
            case R.id.btnDados:
                startActivity(new Intent(this, DadosActivity.class));
                break;
            case R.id.btnFNerd:
                startActivity(new Intent(this, FrasesNActivity.class));
                break;
            case R.id.btnFMot:
                startActivity(new Intent(this, FrasesMActivity.class));
                break;
        }
    }
}