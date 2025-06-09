package br.edu.ifsuldeminas.mch.constraintlayouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.constrictlayout.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonBlogPost;
    private Button buttonSeries;
    private Button buttonText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBlogPost = findViewById(R.id.buttonCL1);
        buttonBlogPost.setOnClickListener(v -> {
            Intent intentBlogPost = new Intent(getApplicationContext(),
                    BlogPostActivity.class);

            startActivity(intentBlogPost);
        });
        buttonSeries = findViewById(R.id.buttonCL2);
        buttonSeries.setOnClickListener(v -> {
            Intent intentSeries = new Intent(getApplicationContext(),
                    SeriesActivity.class);

            startActivity(intentSeries);
        });
        buttonText = findViewById(R.id.buttonCL3);
        buttonText.setOnClickListener(v -> {
            Intent intentText = new Intent(getApplicationContext(),
                    TextActivity.class);

            startActivity(intentText);
        });
    }
}