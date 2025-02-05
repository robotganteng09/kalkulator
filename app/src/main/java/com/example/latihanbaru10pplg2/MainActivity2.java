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

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    Button button1;
    EditText etberat,ettinggi;
    TextView txthasil;
    Button btnhasil;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        etberat = (EditText) findViewById(R.id.etberat);
        ettinggi = (EditText) findViewById(R.id.ettinggi);
        btnhasil = (Button) findViewById(R.id.btnhitung);
        txthasil = (TextView) findViewById(R.id.text4);
         btnReset = (Button) findViewById(R.id.button4);


         btnReset.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
               reset();
             }
         });



          btnhasil.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                 hitungBmi();
              }
          });
    }

    private void hitungBmi(){
        String ukuranTinggi = ettinggi.getText().toString();
        String ukuranBerat = etberat.getText().toString();

        if (ukuranTinggi.isEmpty() || ukuranTinggi.isEmpty()) {
            Toast.makeText(MainActivity2.this,"masukkan angka",Toast.LENGTH_SHORT).show();
            return;
        }

        Float tinggi = Float.parseFloat(ukuranTinggi)/100;
        Float berat = Float.parseFloat(ukuranBerat);
        Float Bmi = berat/(tinggi*tinggi);

        Float[] bmiLimit = {18.5f,24.9f,29.9f,Float.MAX_VALUE};
        String[] bmiCategories = {"Underweight", "Normal weight", "Overweight", "Obese"};

        int index = 0;
        while (Bmi> bmiLimit[index]) index++;

        txthasil.setText(String.format("Bmi:%.2f\ncategory:%s",Bmi,bmiCategories[index]));
    }

    private void reset(){
        ettinggi.setText("");
        etberat.setText("");
        txthasil.setText("");
    }
}