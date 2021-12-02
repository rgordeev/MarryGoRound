package ru.rgordeev.marrygoround;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static String[] cats = new String[]{"cat1","cat2","cat3","cat4"};
    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer catIndex = getIntent().getExtras().getInt("cat_number");

        int resourceId = getApplicationContext()
                .getResources()
                .getIdentifier(
                        cats[catIndex],
                        "drawable",
                        getApplicationContext().getPackageName()
                );
        ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(resourceId);
    }

    public void onClick(View view) {
        String imageName = cats[index];
        int resourceId = getApplicationContext()
                .getResources()
                .getIdentifier(
                        imageName,
                        "drawable",
                        getApplicationContext().getPackageName()
                );
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(resourceId);

        index = (index + 1) % 4;
    }
}