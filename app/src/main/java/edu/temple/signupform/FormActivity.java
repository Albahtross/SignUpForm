package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText PersonName = (EditText)findViewById(R.id.PersonName);
        EditText EmailAddress=(EditText)findViewById(R.id.EmailAddress);
        EditText Password=(EditText)findViewById(R.id.Password);
        EditText PasswordAuth=(EditText)findViewById(R.id.PasswordAuth);
        Button SignUpButton= findViewById(R.id.SignUp);

        SignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                saveUserData();
            }
        });
    }

    void saveUserData(){
        
    }

}