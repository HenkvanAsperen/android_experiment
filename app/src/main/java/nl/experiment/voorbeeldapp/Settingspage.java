package nl.experiment.voorbeeldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Settingspage extends AppCompatActivity {

    ImageButton backtomap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingspage);


            backtomap = (ImageButton) findViewById(R.id.backtomap);
            backtomap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentLoadNewActivity = new Intent(Settingspage.this, Mappage.class);
                    startActivity(intentLoadNewActivity);
                }
            });
    }
}
