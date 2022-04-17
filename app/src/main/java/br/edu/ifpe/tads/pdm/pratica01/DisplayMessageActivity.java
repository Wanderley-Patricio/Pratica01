package br.edu.ifpe.tads.pdm.pratica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent(); //obtenha o Intent que ativou a Atividade
        //A variável estática EXTRA_MESSAGE tem que ser declarada pública na classe MainActivity.java
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE); // Obtendo a mensagem associada ao Intent
        TextView textView = (TextView)findViewById(R.id.message_view); //obtenho o objeto TextView

        //Configurando os atributos de tamanho do texto e mensagem
        textView.setTextSize(40);
        textView.setText(message);
    }
}