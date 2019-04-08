package com.example.opet.tds_firestore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends Activity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart(){
        super.onStart();
        FirebaseUser user = firebaseAuth.getCurrentUser();
        if (user != null){
            Toast.makeText(this, "Logado!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Usuário Não Logado.", Toast.LENGTH_SHORT).show();
        }
    }

    public void registrarProduto(View view){
        callRegistrar();
    }

    public void consultarProduto(View view){
        callConsultar();
    }

    public void signOut(View view) {
        firebaseAuth.signOut();
        Intent telaPrincipal = new Intent(MainActivity.this, SignInActivity.class);
        startActivity(telaPrincipal);
    }

    public void callRegistrar(){
        Intent intent = new Intent(MainActivity.this, RegistrarProdutoActivity.class);
        startActivity(intent);
    }

    public void callConsultar(){
        Intent intent = new Intent(MainActivity.this, ConsultarProdutoActivity.class);
        startActivity(intent);
    }
}
