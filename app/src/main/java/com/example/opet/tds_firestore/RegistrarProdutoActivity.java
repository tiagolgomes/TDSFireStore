package com.example.opet.tds_firestore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrarProdutoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_produto);
    }


    public void voltar(View view){
        callMain();
    }

    public void callMain(){
        Intent intent = new Intent(RegistrarProdutoActivity.this, DashActivity.class);
        startActivity(intent);
    }
}
