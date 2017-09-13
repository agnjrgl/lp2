package com.example.alunos.tokin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.alunos.tokin.adapter.PessoaAdapter;
import com.example.alunos.tokin.model.Pessoa;

import java.util.ArrayList;



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

    public void salvar_lista(View v){
        EditText nome_s = (EditText)findViewById(R.id.inputNome);
        String nome = nome_s.getText().toString();

        EditText telefone_s = (EditText)findViewById(R.id.inputTelefone);
        String telefone = telefone_s.getText().toString();

        EditText idade_s = (EditText)findViewById(R.id.inputIdade);
        int idade = Integer.parseInt(idade_s.getText().toString());

        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(new Pessoa(nome, telefone, idade));


        Intent it = new Intent(this, mostraListaDinamica.class);
        startActivity(it);

    }


}


