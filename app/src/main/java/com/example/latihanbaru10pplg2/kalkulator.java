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

public class kalkulator extends AppCompatActivity implements View.OnClickListener {
   EditText input1,input2;
   Button btnplus,btnmin,btnmul,btndiv,btnreset;
   TextView txthasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        btnplus = findViewById(R.id.btnplus);
        btnmin = findViewById(R.id.btnminus);
        btnmul = findViewById(R.id.btnmultiple);
        btndiv = findViewById(R.id.btndivision);
        btnreset = findViewById(R.id.btnreset);
        txthasil = findViewById(R.id.txthasil);

        btnplus.setOnClickListener(this);
        btnmin.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
    }

    public int getIntFromEditText(EditText editText){
        if (input1.getText().toString().equals("")){
            Toast.makeText(this, "ketik angka", Toast.LENGTH_SHORT).show();
            return 0;
        }
        return Integer.parseInt(input1.getText().toString());
    }
    @Override
    public void onClick(View view) {

    btnplus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1 = getIntFromEditText(input1);
            int num2 = getIntFromEditText(input2);

            int hasil = num1+num2;
            txthasil.setText(hasil);
        }
    });

    btnmin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1 = getIntFromEditText(input1);
            int num2 = getIntFromEditText(input2);

            int hasil = num1-num2;
            txthasil.setText(hasil);
        }
    });


btnmul.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int num1 = getIntFromEditText(input1);
        int num2 = getIntFromEditText(input2);

        int hasil = num1*num2;
        txthasil.setText(hasil);
    }
});

                          btndiv.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View view) {
                                  int num1 = getIntFromEditText(input1);
                                  int num2 = getIntFromEditText(input2);

                                  int hasil = num1/num2;
                                  txthasil.setText(hasil + "");



                              }
                          });
                          btnreset.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View view) {
                                  txthasil.setText("");


         }


     });
    }
}