package com.br.nerdword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class FrasesMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases_m);
    }

    // Funão responsável por gerar a frase
    public void gerarNovaFrase(View view){

        //armazenando as frases que podem ser geradas
        String[] frases = {
                "Só seu que nada sei",
                "Que és tu na fila do pão?",
                "Viva o hoje porque o amanha não existe!",
                "Continue;",
                "Adote um gato!"
        };

        //VAR responsável por gerar os valores aleatórios
        // que serão utilizados para indicar a posição no vetor
        int numero = new Random().nextInt(5);

        //Mostrando a frase com base na posição soteada
        TextView frase = findViewById(R.id.textFraseGerada);
        frase.setText(frases[numero]);
    }
}