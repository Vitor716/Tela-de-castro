package com.example.aplicacao_teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE_NAME = "com.example.seguradora.MESSAGE";
    public final static String EXTRA_MESSAGE_RG = "com.example.seguradora.RG";
    public final static String EXTRA_MESSAGE_VALOR = "com.example.seguradora.VALUE";

    private Spinner spinner;
    String spinnerSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void Cadastrar(View v) {
        EditText txtNome = findViewById(R.id.editText);
        String nome = txtNome.getText().toString();
        EditText RG = findViewById(R.id.editNumber);
        String rg = RG.getText().toString();

}