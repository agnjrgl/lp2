package br.com.agnaldoelyaswagner.trablp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class FibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
    }

    Stack fibo = new Stack();

    public void calcula(View vi){
        EditText numero = (EditText)findViewById(R.id.inputNumero);
        String a = numero.getText().toString();
        if(a.compareTo("")!=0) {
            if(a.compareTo(".")!=0){
                double num = Double.parseDouble(a);
                if(num%1==0) {
                    if (num >= 1) {
                        if (num == 1) {
                            fibo.push(0);
                        } else if (num == 2) {
                            fibo.push(0);
                            fibo.push(1);
                        } else if (num > 2) {
                            fibo.push(0);
                            fibo.push(1);
                            for (int i = 0; i < (num - 2); i++) {
                                String c = fibo.pop().toString();
                                double num1 = Double.parseDouble(c);
                                String b = fibo.pop().toString();
                                double num2 = Double.parseDouble(b);
                                fibo.push(num2);
                                fibo.push(num1);
                                fibo.push(num1+num2);
                            }
                        }

                        TextView mostraNum = (TextView)findViewById(R.id.textMostraNum);
                        String d = fibo.pop().toString();
                        double numero2 = Double.parseDouble(d);
                        fibo.push(numero2);
                        mostraNum.setText(d);

                        TextView mostraSerie = (TextView)findViewById(R.id.textMostraSerie);
                        String k = fibo.toString();
                        mostraSerie.setText(k);

                        TextView mostraSoma = (TextView)findViewById(R.id.textMostraSoma);
                        int p = fibo.size();
                        int soma =0;
                        for(int i=0; i<p; i++){
                            String ta = fibo.pop().toString();
                            double tata = Double.parseDouble(ta);
                            soma+=tata;
                        }
                        fibo.push(soma);
                        String ssoma = fibo.pop().toString();
                        mostraSoma.setText(ssoma);
                    }
                }
            }
        }

        numero.setText("");
    }

    public void voltar(View vi){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
