package com.example.livroandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

    }
    public void salvar(View v){
        Toast.makeText(this, "Cadastro Efetuado!", Toast.LENGTH_LONG).show();
    }
    public void excluir(View v){
        Toast.makeText(this, "Cadastro Excluido!", Toast.LENGTH_LONG).show();
    }
}