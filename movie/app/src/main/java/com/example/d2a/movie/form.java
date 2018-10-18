package com.example.d2a.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent it = new Intent(v.getContext(), MainActivity.class);
                        startActivity(it);
                    }
                }
        );
    }

    public void tampil(View view) {
        EditText judul1 = (EditText) findViewById(R.id.input_judul);
        judul1.getText().toString();
        EditText rating1 = (EditText) findViewById(R.id.input_rating);
        rating1.getText().toString();

        Intent it = new Intent(this, MainActivity.class);
        it.putExtra("Judul",judul1.getText().toString());
        it.putExtra("Rating",rating1.getText().toString());
        startActivity(it);
    }
}
