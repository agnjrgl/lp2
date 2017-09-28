package com.example.alunos.tokin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

class MainActivity​ extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showList(View v) {
        Intent it = new Intent(this, mostraListaDinamica.class);
        startActivity(it);
    }
}
