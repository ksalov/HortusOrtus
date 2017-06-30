package hr.unipu.android.hortusortus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popis_biljaka2(View view) {
        Intent i = new Intent(MainActivity.this, ZacinskoBiljeActivity.class);
        startActivity(i);
    }

    public void popis_biljaka(View view) {
        Intent i = new Intent(MainActivity.this, PovrceActivity.class);
        startActivity(i);
    }

    public void kalendar(View view) {
        Intent i = new Intent(MainActivity.this, KalendarActivity.class);
        startActivity(i);
    }
}
