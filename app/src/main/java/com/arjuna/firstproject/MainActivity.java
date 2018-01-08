package com.arjuna.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //tipe data

    String namaFirst = "   ";
    String namaLast = "   ";

    //deklarasi widget

    TextView txthallo;
    EditText etkelas, etnama;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Full name : " + namaFirst + namaLast);

        //memanggil id dari textview
        txthallo = (TextView) findViewById(R.id.txthallo);
        etnama = (EditText) findViewById(R.id.etnama);
        etkelas = (EditText) findViewById(R.id.etkelas);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);

        //menambahkan aksi kettika btnsubmit di klik
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mengambil String dari etnama dan etkelas
                String nNama = etnama.getText().toString();
                String nKelas = etkelas.getText().toString();
                //menampilkan hasil ke textview
                txthallo.setText("Hello, " + nNama  + nKelas );
            }
        });

        //menampilkan hasil teks ke widget textView
//        txtWelcome.setText("Hy, " + namaFirst + "  "+ namaLast);
    }
}
