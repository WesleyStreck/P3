package com.example.livroandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class mensagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

    }

    public void exibirMensagem(View v){
        Toast.makeText(this, "Mensagem Exibida", Toast.LENGTH_LONG).show();
    }

}
