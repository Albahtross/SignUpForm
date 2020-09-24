package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    EditText PersonName = (EditText)findViewById(R.id.PersonName);
    EditText EmailAddress=(EditText)findViewById(R.id.EmailAddress);
    EditText Password=(EditText)findViewById(R.id.Password);
    EditText PasswordAuth=(EditText)findViewById(R.id.PasswordAuth);
    Button SignUpButton= findViewById(R.id.SignUp);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                saveUserData();
            }
        });
    }

    void saveUserData(){
        if(TextUtils.isEmpty(PersonName.getText()) || TextUtils.isEmpty(EmailAddress.getText())||
                TextUtils.isEmpty(Password.getText()) || TextUtils.isEmpty(PasswordAuth.getText())){
            Toast.makeText(this, "Not all fields have been filled out.", Toast.LENGTH_SHORT).show();
        }
    }

}