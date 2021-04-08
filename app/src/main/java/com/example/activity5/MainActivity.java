package com.example.activity5;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText email, passwords;

    String nama, password;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

//    @Override
//    public boolean onOptionsItemSelected( MenuItem item) {
//
//        if (item.getItemId() == R.id.mnDaftar){
//            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
//            startActivity(i);
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);

        email = findViewById(R.id.edEmail);

        passwords = findViewById(R.id.edPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = email.getText().toString();

                password = passwords.getText().toString();

                String email = "admin@mail.com";
                String pass  = "123";

                if (nama.equals(email) && password.equals(pass)){
                    //membuat variabel toast dan menampilkan pesan "Login Sukses"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    t.show();

                    //Membuat objek bundle
                    Bundle b = new Bundle();

                    //memasukan value dari variabel nama dengan kunci "a"
                    //dan dimasukan kedalam bundle
                    b.putString("a", nama.trim());

                    //memasukan value dari variabel password dengan kunci "b"
                    //dan dimasukan kedalam bundle
                    b.putString("b", password.trim());

                    //membuat objek intent berpindah activty dari mainactivity ke Home_Activity
                    Intent i = new Intent(getApplicationContext(), Home_Activity.class);

                    //memasukan bundle kedalam intent untuk dikirim ke ActivityHasil
                    i.putExtras(b);

                    //method. berpindah dari activity ke ActivityHasil
                    startActivity(i);
                }else{
                    //membuat variabel toast dan membuat toast dan menampilkan pesan ""Login Gagal!"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Gagal!", Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                }
            }
        });
    }}