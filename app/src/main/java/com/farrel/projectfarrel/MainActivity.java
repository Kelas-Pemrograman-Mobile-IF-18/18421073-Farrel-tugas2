package com.farrel.projectfarrel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtAlamat, edtJenisKelamin, edtInstansi, edtHobby;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtTampil);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtJenisKelamin = (EditText) findViewById(R.id.edtJenisKelamin);
        edtInstansi = (EditText) findViewById(R.id.edtInstansi);
        edtHobby = (EditText) findViewById(R.id.edtHobby);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strJenisKelamin = edtJenisKelamin.getText().toString();
                String strInstansi = edtInstansi.getText().toString();
                String strHobby = edtHobby.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strAlamat + "\n" + strJenisKelamin + "\n" + strInstansi + "\n" + strHobby);
            }
        });
    }
}