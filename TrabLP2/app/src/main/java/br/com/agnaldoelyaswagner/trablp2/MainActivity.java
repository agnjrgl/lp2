package br.com.agnaldoelyaswagner.trablp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calc(View vi){
        Intent it = new Intent(this, CalculadoraActivity.class);
        startActivity(it);
    }

    public void fibonacci(View vi){
        Intent it = new Intent(this, FibonacciActivity.class);
        startActivity(it);
    }
    public void fatorial(View vi){
        Intent it = new Intent(this, FatorialActivity.class);
        startActivity(it);
    }
}
