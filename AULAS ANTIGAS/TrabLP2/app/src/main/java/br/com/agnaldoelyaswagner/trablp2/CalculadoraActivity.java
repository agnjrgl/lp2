package br.com.agnaldoelyaswagner.trablp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    Stack pilha = new Stack();

    public void empilhar(View i){
        EditText numero = (EditText)findViewById(R.id.inputNumero);
        String a = numero.getText().toString();
        if(a.compareTo("")!=0) {
            if(a.compareTo(".")!=0){
                double num = Double.parseDouble(a);
                pilha.push(num);
            }
        }
        mostrar();
        numero.setText("");
    }
    public void desempilhar(View i){
        if(pilha.size()>=1) {
            pilha.pop();
        }
        mostrar();
    }
    public void limpar(View i){
        while(pilha.size()>0){
            pilha.pop();
        }
        mostrar();
    }
    public void adicao(View i){
        if(pilha.size()>=2) {
            String a = pilha.pop().toString();
            double num1 = Double.parseDouble(a);
            String b = pilha.pop().toString();
            double num2 = Double.parseDouble(b);
            pilha.push(num1 + num2);
            mostrar();
        }
    }
    public void subtracao(View i){
        if(pilha.size()>=2) {
            String a = pilha.pop().toString();
            double num1 = Double.parseDouble(a);
            String b = pilha.pop().toString();
            double num2 = Double.parseDouble(b);
            pilha.push(num1 - num2);
            mostrar();
        }
    }
    public void multiplicacao(View i){
        if(pilha.size()>=2) {
            String a = pilha.pop().toString();
            double num1 = Double.parseDouble(a);
            String b = pilha.pop().toString();
            double num2 = Double.parseDouble(b);
            pilha.push(num1 * num2);
            mostrar();
        }
    }
    public void divisao(View i){
        if(pilha.size()>=2) {
            String a = pilha.pop().toString();
            double num1 = Double.parseDouble(a);
            String b = pilha.pop().toString();
            double num2 = Double.parseDouble(b);
            if(num2!=0)
                pilha.push(num1 / num2);
            else {
                pilha.push(num2);
                pilha.push(num1);
            }
            mostrar();
        }
    }
    public void mostrar(){
        TextView mostra = (TextView)findViewById(R.id.textStack);
        String k = pilha.toString();
        mostra.setText(k);
    }

    public void voltar(View vi){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}