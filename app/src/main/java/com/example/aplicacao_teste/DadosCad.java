package com.example.aplicacao_teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DadosCad extends AppCompatActivity {

    TextView nome;
    TextView telefone;
    TextView endereco;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dados_cad);

        nome = (TextView) findViewById(R.id.txtNome);
        telefone = (TextView) findViewById(R.id.txtTelefone);
        endereco = (TextView) findViewById(R.id.txtEndereco);

        Intent it = getIntent();

        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){
                String strNome = params.getString(("nome"));
                String strTelefone = params.getString(("telefone"));
                String strEndereco = params.getString(("endereco"));

                nome.setText(strNome.toString());
                telefone.setText(strTelefone.toString());
                endereco.setText(strEndereco.toString());
            }
        }

        btnVoltar = (Button) findViewById(R.id.btnVoltarTela);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}