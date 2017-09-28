package com.example.alunos.tokin;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alunos.tokin.adapter.PessoaAdapter;
import com.example.alunos.tokin.model.Pessoa;

import java.util.ArrayList;

public class mostraListaDinamica extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(new Pessoa("Pedro", "3690-1234", 12));
        lista.add(new Pessoa("Joao", "3690-4321", 18));
        setListAdapter(new PessoaAdapter(this, lista));
    }
}
