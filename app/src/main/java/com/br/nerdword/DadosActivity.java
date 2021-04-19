package com.br.nerdword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DadosActivity extends AppCompatActivity {

    private ImageView volta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        volta = findViewById(R.id.imgVolta);
        volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), HomeActivity.class));
            }
        });
    }

    public void dadoUm(View view){
        TextView texto = findViewById(R.id.textResultado);

        int num = new Random().nextInt(7);

        texto.setText("O número é: " + num);
    }

    public void dadoDois(View view){
        TextView texto = findViewById(R.id.textResultado);

        int num = new Random().nextInt(13);

        texto.setText("O número é: " + num);
    }

    public void dadoTres(View view){
        TextView texto = findViewById(R.id.textResultado);

        int num = new Random().nextInt(21);

        texto.setText("O número é: " + num);
    }

    public void dadoQuatro(View view){
        TextView texto = findViewById(R.id.textResultado);

        int num = new Random().nextInt(101);

        texto.setText("O número é: " + num);
    }
}