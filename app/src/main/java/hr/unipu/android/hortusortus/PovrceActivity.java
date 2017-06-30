package hr.unipu.android.hortusortus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class PovrceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povrce);
        setTitle("Povrće");

        List<Biljka> popis_biljaka= Podaci.dajPodatke();


        ListView listView = (ListView) findViewById(R.id.biljke_listView);
        listView.setAdapter((ListAdapter) new Biljka_Adapter(this,0,popis_biljaka));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(PovrceActivity.this, PovrceDetaljActivity.class);
                i.putExtra("broj_biljke", position);
                startActivity(i);
            }
        });
    }
}
