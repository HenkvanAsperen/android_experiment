package nl.experiment.voorbeeldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configuregotomappage();
    }

        private void configuregotomappage(){
            Button gotomappage = findViewById(R.id.gotomappage);
            gotomappage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   startActivity (new Intent(MainActivity.this,Mappage.class));
                }
            });


        }


}
