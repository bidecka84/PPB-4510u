package com.example.user.tugas1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openUrl(View v){
        Uri uri = Uri.parse("http://www.instagram.com/bidecka.b");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public  void callNumber(View view){
        Uri uri = Uri.parse("tel:089670134977");
        Intent it = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);
    }
    public void showMap(View view){
        Uri uri = Uri.parse("geo:0,0?q=-7.015063,110.372813");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}
