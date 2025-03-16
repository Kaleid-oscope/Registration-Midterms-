package com.example.registration;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;


public class secondActtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.second_activity);
        Toast.makeText(this, "oofed", Toast.LENGTH_SHORT).show();

        Intent intent = getIntent();
        String fname = intent.getStringExtra(MainActivity.EXTRA_FIRST_NAME);
        String lname = intent.getStringExtra(MainActivity.EXTRA_LAST_NAME);

        TextView textView = findViewById(R.id.editthis);
        textView.setText(fname + " " + lname);

    }

}
