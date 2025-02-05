package com.example.latihanbaru10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class ConstraintActiviy extends  AppCompatActivity {
       EditText edUser;
       EditText edPassword;
       Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_constraint_activiy);

       edUser = (EditText) findViewById(R.id.et_user);
       edPassword = (EditText) findViewById(R.id.et_password);
       btnlogin = (Button) findViewById((R.id.btn_login));

       btnlogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (edUser.getText().toString().equals("Arsya") && edPassword.getText()
                       .toString().equals("Agans23")){
                   Toast.makeText(ConstraintActiviy.this, "anda login",Toast.LENGTH_SHORT).show();
                   Intent page1 = new Intent(getApplicationContext(), MainActivity2.class);
                   startActivity(page1);

               } else {
                   Toast.makeText(ConstraintActiviy.this,"anda gagal login",Toast.LENGTH_SHORT).show();
               }
           }
       });
    }
}