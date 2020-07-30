package com.example.bodymaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registerPage extends AppCompatActivity {

    private Button gotoNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        gotoNewUser = (Button) findViewById(R.id.gotoNewUser);
        gotoNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewUser();
            }
        });
    }

    public void openNewUser() {
        Intent intent = new Intent(this, newUserPage.class);
        startActivity(intent);

    }

}
