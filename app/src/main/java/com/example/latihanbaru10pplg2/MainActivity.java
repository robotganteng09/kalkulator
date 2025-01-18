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

public class MainActivity extends AppCompatActivity {
  private Button button2;

   EditText edUser;
   EditText edPassword;
   Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pageSatu = new Intent(getApplicationContext(), Register.class);
                startActivity(pageSatu);
            }
        });

        //sambungkan ke xml
        edUser=(EditText) findViewById((R.id.edUser));
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnLogin = (Button)  findViewById((R.id.btnlogin));

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // kodingnya
                if(edUser.getText().toString().equals("Arsya")
                        && edPassword.getText().toString().equals("garling123")){
                    Toast.makeText(MainActivity.this, "anda login", Toast.LENGTH_SHORT).show();
                    Intent page1 = new Intent(getApplicationContext(), kalkulator1.class);
                    startActivity(page1);
                } else {
                    Toast.makeText(MainActivity.this, "pitik", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
