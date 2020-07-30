package com.example.bodymaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explorePageOne extends AppCompatActivity {

    private Button gotoExplorePageTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_page_one);

        gotoExplorePageTwo = (Button)findViewById(R.id.gotoExplorePageTwo);
        gotoExplorePageTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExplorePageTwo();
            }
        });
    }
            private void openExplorePageTwo() {
                Intent intent = new Intent(this, explorePageTwo.class);
                startActivity(intent);
            }
}