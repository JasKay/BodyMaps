package com.example.bodymaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explorePageTwo extends AppCompatActivity {

    private Button gotoExplorePageThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_page_two);

        gotoExplorePageThree = (Button) findViewById(R.id.gotoExplorePageThree);
        gotoExplorePageThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExplorePageThree();
            }
        });
    }

            private void openExplorePageThree() {
                Intent intent = new Intent(this, explorePageThree.class);
                startActivity(intent);
            }
        }