package com.example.alunos.adr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alunos.adr.model.Pessoa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public void showList(View v) {
        Intent it = new Intent(this, mostraListaDinamica.class);
        it.putParcelableArrayListExtra("lista", lista);
        startActivity(it);
    }

    public void salvar_lista(View v){
        TextView aviso = (TextView)findViewById(R.id.aviso);

        EditText nome_s = (EditText)findViewById(R.id.inputNome);
        String nome = nome_s.getText().toString();

        EditText telefone_s = (EditText)findViewById(R.id.inputTelefone);
        String telefone = telefone_s.getText().toString();

        EditText idade_s = (EditText)findViewById(R.id.inputIdade);
        String idade_string  = idade_s.getText().toString();

        boolean flag = false;
        if(nome.compareTo("")!=0){
            if(telefone.compareTo("")!=0){
                if(idade_string.compareTo("")!=0){
                    int idade = Integer.parseInt(idade_s.getText().toString());
                    lista.add(new Pessoa(nome, telefone, idade));

                    nome_s.setText("");
                    telefone_s.setText("");
                    idade_s.setText("");
                    flag=true;
                    aviso.setText("");

                }
            }
        }
        if(!flag) aviso.setText("Termine de preencher os campos!");


    }
}





