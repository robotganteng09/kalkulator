package com.example.latihanbaru10pplg2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class kalkulator1 extends AppCompatActivity implements View.OnClickListener{

    EditText input1,input2;
    Button btnplus,btnmin,btnmul,btndiv,btnreset;
    TextView txthasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator1);

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        btnplus = (Button)findViewById(R.id.btnplus);
        btnmin = (Button)findViewById(R.id.btnminus);
        btnmul =(Button) findViewById(R.id.btnmultiple);
        btndiv = (Button)findViewById(R.id.btndivision);
        btnreset= (Button)findViewById(R.id.btnreset);
        txthasil =(TextView) findViewById(R.id.txthasil);

       btnplus.setOnClickListener(this);
       btnmin.setOnClickListener(this);
       btnmul.setOnClickListener(this);
       btndiv.setOnClickListener(this);
       btnreset.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        try {
            int num1 = Integer.parseInt(input1.getText().toString());
            int num2 = Integer.parseInt(input2.getText().toString());
            int hasil;

            if (view == btnplus) {
                hasil = num1 + num2;
                txthasil.setText(String.valueOf(hasil));
            } else if (view == btnmin) {
                hasil = num1 - num2;
                txthasil.setText(String.valueOf(hasil));
            } else if (view == btnmul) {
                hasil = num1 * num2;
                txthasil.setText(String.valueOf(hasil));
            } else if (view == btndiv) {
                if (num2 == 0) {
                    Toast.makeText(this, "Tidak bisa membagi dengan nol!", Toast.LENGTH_SHORT).show();
                } else {
                    hasil = num1 / num2;
                    txthasil.setText(String.valueOf(hasil));
                }
            } else if (view == btnreset) {
                input1.setText("");
                input2.setText("");
                txthasil.setText("");
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Masukkan angka yang valid!", Toast.LENGTH_SHORT).show();
        }
    }
    }

