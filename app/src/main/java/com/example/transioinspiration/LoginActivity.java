package com.example.transioinspiration;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    Button callSignUp;

    /*
    cadastrar;
    ImageView logo;
    TextView textInspi, slogan;
    TextInputLayout username, password;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_login);


        callSignUp = findViewById(R.id.cadastrar);
                /*
        textInspi = findViewById(R.id.textInspi);
        slogan = findViewById(R.id.slogan);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        cadastrar = findViewById(R.id.cadastrar);

         */


        callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,CadastroActivity.class);
                startActivity(intent);

       /*         Pair[] pairs = new Pair[6];

                pairs[0] = new Pair<View,String>(textInspi,"textInspi");
                pairs[0] = new Pair<View,String>(slogan,"slogan");
                pairs[0] = new Pair<View,String>(username,"username");
                pairs[0] = new Pair<View,String>(password,"password");
                pairs[0] = new Pair<View,String>(cadastrar ,"cadastrar ");
                pairs[0] = new Pair<View,String>(callSignUp,"callSignUp");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this,pairs);
                    startActivity(intent, options.toBundle());
                }

        */
            }
        });

    }
}
