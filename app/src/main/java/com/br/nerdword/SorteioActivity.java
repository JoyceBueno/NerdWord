package com.br.nerdword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class SorteioActivity extends AppCompatActivity {

    private ImageView volta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteio);

        volta = findViewById(R.id.imgVolta);
        volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), HomeActivity.class));
            }
        });
    }

    public void sortearDez(View view){
        TextView texto = findViewById(R.id.textResultado);

        int num = new Random().nextInt(11);

        texto.setText("O número sorteado foi: " + num);
    }

    public void sortearcem(View view){
        TextView texto = findViewById(R.id.textResultado);

        int num = new Random().nextInt(101);

        texto.setText("O número sorteado foi: " + num);
    }

    public void sortearMil(View view){
        TextView texto = findViewById(R.id.textResultado);

        int num = new Random().nextInt(1001);

        texto.setText("O número sorteado foi: " + num);
    }

    public void sortearDezMil(View view){
        TextView texto = findViewById(R.id.textResultado);

        int num = new Random().nextInt(10001);

        texto.setText("O número sorteado foi: " + num);
    }
}