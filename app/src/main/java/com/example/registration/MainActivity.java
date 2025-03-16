package com.example.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_FIRST_NAME = "FIRST_NAME";
    public static final String EXTRA_LAST_NAME = "LAST_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText firstName = findViewById(R.id.fname);
        EditText lastName = findViewById(R.id.lname);
        Button Create = findViewById(R.id.create);

    }
    public void Register(View view) {
        Intent intent = new Intent(this, secondActtivity.class);
        EditText firstName = findViewById(R.id.fname);
        EditText lastName = findViewById(R.id.lname);
        String fname = firstName.getText().toString();
        String lname = lastName.getText().toString();
        intent.putExtra(EXTRA_FIRST_NAME, fname);
        intent.putExtra(EXTRA_LAST_NAME, lname);
        startActivity(intent);
    }

}