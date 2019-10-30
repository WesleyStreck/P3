package com.example.livroandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void telaEstados(View view){

        Intent intent = new Intent(this, cliente.class);
        startActivity(intent);
    }

    public void telaMensagem(View view){

        Intent intent = new Intent(this, mensagem.class);
        startActivity(intent);
    }

    public void telaFormulario(View view){
        Intent intent = new Intent(this, formulario.class);
        startActivity(intent);
    }

    public void telaEstadosExtenso(View view){
        Intent intent = new Intent(this, telaEstado.class);
        startActivity(intent);
    }

    public void telaBuscaCidade(View view){
        Intent intent = new Intent(this, listView.class);
        startActivity(intent);
    }

}
