package com.alberto.aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText altura,peso;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.boton);
        peso = findViewById(R.id.peso);
        altura = findViewById(R.id.altura);
        res = findViewById(R.id.res);
        Intent e = getIntent();

        String i = e.getStringExtra("correo");
        Toast.makeText(this,i,Toast.LENGTH_SHORT).show();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float p,a;
                p = Float.parseFloat(peso.getText().toString());
                a = Float.parseFloat(altura.getText().toString());
                float imc = (float) (p/Math.pow(a,2));
                res.setText(""+imc);
            }
        });
    }
}