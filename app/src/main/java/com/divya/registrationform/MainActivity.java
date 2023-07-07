package com.divya.registrationform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.divya.registrationformfirstchallenge.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        TextView firstName = findViewById(R.id.firstName);
        TextView lastName = findViewById(R.id.lastName);
        TextView email = findViewById(R.id.email);

        EditText firstNameEnter = findViewById(R.id.firstNameEnter);
        EditText lastNameEnter = findViewById(R.id.lastNameEnter);
        EditText emailEnter = findViewById(R.id.emailEnter);

        firstName.setText("First Name: " + firstNameEnter.getText().toString());
        lastName.setText("Last Name: " + lastNameEnter.getText().toString());
        email.setText("Email: " + emailEnter.getText().toString());
    }
}