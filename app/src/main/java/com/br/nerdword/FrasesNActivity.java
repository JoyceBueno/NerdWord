package com.br.nerdword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class FrasesNActivity extends AppCompatActivity {

    private Button imagen;
    private ImageView imgTrocar, volta;

    private int[] imgs = {
            R.drawable.naruto,
            R.drawable.star,
            R.drawable.tanjirou,
            R.drawable.attack,
            R.drawable.harry
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases_n);

        imgTrocar = findViewById(R.id.imgTroca);
        imagen = findViewById(R.id.btnFrases);

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int imgsAleatorios = new Random().nextInt(imgs.length);
                imgTrocar.setImageResource(imgs[imgsAleatorios]);


                //armazenando as frases que podem ser geradas
                String[] frases = {
                        "Vida longa e próspera(Sr. Spock - StarTrek)",
                        "Eu sou o Homem de Ferro!(Tony Stark)",
                        "Que a Força esteja com você!(StarWars)",
                        "Você não passará!(Gandalf)",
                        "Esse é meu jeito ninja de ser!(Naruto)",
                        "Tem uma cobra na minha bota(Woody)",
                        "Tio Sam, Socorro!(Pica-Pau)",
                        "Pouso de super-herói(Deadpool)",
                        "Eu sou o Batman!(Batman)"
                };

                //VAR responsável por gerar os valores aleatórios
                // que serão utilizados para indicar a posição no vetor
                int numero = new Random().nextInt(9);

                //Mostrando a frase com base na posição soteada
                TextView frase = findViewById(R.id.textFraseGerada);
                frase.setText(frases[numero]);
            }
        });

        volta = findViewById(R.id.imgVolta);
        volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), HomeActivity.class));
            }
        });

    }
}