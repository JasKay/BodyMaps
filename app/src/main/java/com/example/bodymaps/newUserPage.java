package com.example.bodymaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newUserPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_page);

        Button gotoHome = (Button) findViewById(R.id.gotoHome);
        Button gotoImport = (Button) findViewById(R.id.gotoImport);
        Button gotoExplore = (Button) findViewById(R.id.gotoExplore);
        Button gotoCamera = (Button) findViewById(R.id.gotoCamera);
        Button gotoProgram = (Button) findViewById(R.id.gotoProgram);


        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHome = new Intent(newUserPage.this, explorePageOne.class);
                startActivity(intentHome);
            }
        });

        gotoImport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImport = new Intent(newUserPage.this, explorePageOne.class);
                startActivity(intentImport);
            }
        });

        gotoExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentExplore = new Intent(newUserPage.this, explorePageOne.class);
                startActivity(intentExplore);
            }
        });

        gotoCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCamera = new Intent(newUserPage.this, explorePageOne.class);
                startActivity(intentCamera);
            }
        });

        gotoProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProgram = new Intent(newUserPage.this, explorePageOne.class);
                startActivity(intentProgram);
            }
        });
    }

}
