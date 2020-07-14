package com.example.aplicacao_teste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    EditText nome;
    EditText telefone;
    EditText endereco;
    Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.ed_nome);
        telefone = (EditText) findViewById(R.id.ed_telefone);
        endereco = (EditText) findViewById(R.id.ed_endereco);
        btnCadastrar = (Button) findViewById(R.id.btn_Cadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dados = new Intent (MainActivity.this, DadosCad.class);

                Bundle params = new Bundle();

                params.putString("nome", nome.getText().toString());
                params.putString("telefone", telefone.getText().toString());
                params.putString("endereco", endereco.getText().toString());

                dados.putExtras(params);

                startActivity(dados);

            }
        });
    }
}