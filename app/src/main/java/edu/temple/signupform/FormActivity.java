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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText PersonName = (EditText)findViewById(R.id.PersonName);
        final EditText EmailAddress=(EditText)findViewById(R.id.EmailAddress);
        final EditText Password=(EditText)findViewById(R.id.Password);
        final EditText PasswordAuth=(EditText)findViewById(R.id.PasswordAuth);
        Button SignUpButton= findViewById(R.id.SignUp);


        SignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                saveUserData(PersonName, EmailAddress, Password, PasswordAuth);
            }
        });
    }

    void saveUserData(EditText PersonName, EditText EmailAddress, EditText Password, EditText PasswordAuth){
        // Check if all fields are filled in
        if(TextUtils.isEmpty(PersonName.getText()) || TextUtils.isEmpty(EmailAddress.getText())||
                TextUtils.isEmpty(Password.getText()) || TextUtils.isEmpty(PasswordAuth.getText())){
            Toast.makeText(this, "Not all fields have been filled out.", Toast.LENGTH_SHORT).show();
        }
        // Check if passwords match
        else if (!(Password.getText().toString().equals(PasswordAuth.getText().toString()))){
            Toast.makeText(this, "Passwords do not match.", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Welcome to the SignUp Form," + PersonName.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }

}