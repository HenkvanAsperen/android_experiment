package nl.experiment.voorbeeldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Mappage extends AppCompatActivity {

ImageButton  gotosettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mappage);

        gotosettings = findViewById(R.id.gotosettings);
        gotosettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Mappage.this, Settingspage.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
