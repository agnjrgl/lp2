package com.example.alunos.adr;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.alunos.adr.adapter.PessoaAdapter;
import com.example.alunos.adr.model.Pessoa;

import java.util.ArrayList;

public class mostraListaDinamica extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent it = getIntent();
        ArrayList<Pessoa> receb = it.getParcelableArrayListExtra("lista");

        setListAdapter(new PessoaAdapter(this, receb));
    }
}