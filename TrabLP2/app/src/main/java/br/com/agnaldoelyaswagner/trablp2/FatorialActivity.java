package br.com.agnaldoelyaswagner.trablp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class FatorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);
    }

    public void calcula(View vi){
        EditText numero = (EditText)findViewById(R.id.inputNumero);
        String a = numero.getText().toString();
        int fatorial=1;
        if(a.compareTo("")!=0) {
            if(a.compareTo(".")!=0){
                double num = Double.parseDouble(a);
                if(num>=0){
                    if(num%1==0){
                        if(num>0){
                            for(int i=1; i<=num; i++){
                                fatorial*=i;
                            }
                        }

                        TextView fat = (TextView)findViewById(R.id.textFator);
                        Stack k = new Stack();
                        k.push(fatorial);
                        String kk = k.pop().toString();
                        fat.setText(kk);
                        TextView mostrar = (TextView)findViewById(R.id.textMostra);
                        mostrar.setText("Fatorial: "+a+"! = ");
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
