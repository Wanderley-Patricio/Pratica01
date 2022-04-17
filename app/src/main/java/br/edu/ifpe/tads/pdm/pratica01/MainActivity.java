package br.edu.ifpe.tads.pdm.pratica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    //Declarando EXTRA_MESSAGE como a variável estática na classe MainActivity
    private static final String EXTRA_MESSAGE = "Pratica01.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.edit_message);
        String message = editText.getText().toString(); //Colocando o texto da caixa de entrada em uma variável do tipo String (e.g., message);
        intent.putExtra(EXTRA_MESSAGE, message); //Colocando a mensagem no Intent

        startActivity(intent); //Ativando o Intent.

//        Compartilhando Informações entre Activities
//        Nesta prática a mensagem que foi digitada pelo usuário é comunicada à nova activity por
//        meio de um campo “Extra” no Intent. Existem formas mais convenientes para trocar
//        informações entre Activities de uma mesma App, por exemplo, por meio do padrão de
//        projetos Singleton. Nesse caso, é criado um Singleton que armazena informações que
//        podem ser acessadas por qualquer atividade da aplicação, por exemplo, dados sobre o
//        usuário atual.
    }
}