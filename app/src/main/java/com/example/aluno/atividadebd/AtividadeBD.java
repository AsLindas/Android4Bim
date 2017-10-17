package com.example.aluno.atividadebd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AtividadeBD extends AppCompatActivity {

    private Button Cadastro;
    private Button Sobre;
    private Button Entrar;
    private EditText Usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_bd);

        Cadastro = (Button)findViewById(R.id.btnCadastrar);
        Cadastro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AtividadeBD.this, Cadastrar.class));
            }
        });

        Sobre = (Button)findViewById(R.id.btnSobre);
        Sobre.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AtividadeBD.this, Sobre.class));
            }
        });
    }
}
