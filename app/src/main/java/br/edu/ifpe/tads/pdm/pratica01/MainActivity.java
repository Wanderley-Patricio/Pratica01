package br.edu.ifpe.tads.pdm.pratica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //-------------------
    public static final String EXTRA_MESSAGE = "Pratica01.MESSAGE";
    //Declarando EXTRA_MESSAGE como a variável estática na classe MainActivity
    //    private static final String EXTRA_MESSAGE = "Pratica01.MESSAGE";

    //-------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //-------------------
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

    //-------------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    //-------------------
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSettings() {
        Toast.makeText(this, "Não implementada.", Toast.LENGTH_SHORT).show();
    }

    private void openSearch() {
        Toast.makeText(this, "Não implementada.", Toast.LENGTH_SHORT).show();
    }
}