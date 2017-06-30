package hr.unipu.android.hortusortus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ZacinskoBiljeDetaljActivity extends AppCompatActivity {

    int broj_biljke2;
    Biljka odabrana_biljka2;

    // SharedPreferences sharedPref;
    // boolean uVrtu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zacinsko_bilje_detalj);
        setTitle("Detalji biljke");

        List<Biljka> popis_biljaka2 = Podaci.dajPodatke2();

        broj_biljke2 = getIntent().getIntExtra("broj_biljke", 0);

        odabrana_biljka2 = popis_biljaka2.get(broj_biljke2);

        TextView ime_tekst2 = (TextView) findViewById(R.id.ime_biljke);
        ime_tekst2.setText(odabrana_biljka2.getIme());

        TextView opis_tekst2 = (TextView) findViewById(R.id.opis_biljke);
        opis_tekst2.setText(odabrana_biljka2.getOpis());

        TextView sjetva_tekst2 = (TextView) findViewById(R.id.mjesec_sjetve);
        sjetva_tekst2.append(String.valueOf(odabrana_biljka2.getMjeseci_sadnje()));


        TextView berba_tekst2 = (TextView) findViewById(R.id.mjesec_berbe);
        berba_tekst2.append(String.valueOf(odabrana_biljka2.getMjeseci_berbe()));


        ImageView slikaBiljke2 = (ImageView) findViewById(R.id.slika_biljke);
        slikaBiljke2.setImageResource(getResources().getIdentifier(odabrana_biljka2.getSlika(),"drawable",getPackageName()));

     /*
        Button button = (Button) findViewById(R.id.dodaj_biljku);
        assert button != null;
        sharedPref = getSharedPreferences("vrt", Context.MODE_PRIVATE);
        uVrtu = sharedPref.getBoolean(odabrana_biljka.getIme(), false);
        if(uVrtu) {
            button.setText("Ukloni biljku iz mog vrta");
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final SharedPreferences.Editor editor = sharedPref.edit();
                if(!uVrtu) {
                    //biljka nije u vrtu, treba je dodati
                    AlertDialog.Builder builder = new AlertDialog.Builder(BiljkaDetaljActivity.this);
                    builder.setTitle("Unesite vrijeme klijanja:");

                    final EditText input = new EditText(BiljkaDetaljActivity.this);
                    input.setInputType(InputType.TYPE_CLASS_TEXT);
                    builder.setView(input);

                    builder.setPositiveButton("Dodaj biljku", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            String dana = input.getText().toString();
                            int brojDana = Integer.parseInt(dana);
                            //sprema ime biljke kao true, znači da je ta biljka sad u vrtu
                            editor.putBoolean(odabrana_biljka.getIme(), true);
                            //trenutno vrijeme se sprema kao početni datum
                            editor.putLong(odabrana_biljka.getIme()+"_danSadnje", Calendar.getInstance().getTimeInMillis());
                            //ciljno vrijeme se sprema kao krajnji datum, računa se dodavanjem broja dana pomnoženih s milisekundama u danu na početni datum
                            editor.putLong(odabrana_biljka.getIme()+"_danBerbe", Calendar.getInstance().getTimeInMillis()+(brojDana * (1000*60*60*24)));
                            editor.apply();
                            //prikaži poruku o uspješnosti
                            Toast.makeText(BiljkaDetaljActivity.this, "Biljka dodana u moj vrt", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder.setNegativeButton("Odustani", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

                    builder.show();


                    //osvježi aktivnost
                    recreate();
                }
                if(uVrtu) {
                    //biljka već je u vrtu, treba je ukloniti
                    editor.remove(odabrana_biljka.getIme());
                    editor.apply();
                    Toast.makeText(BiljkaDetaljActivity.this, "Biljka uklonjena iz mog vrta", Toast.LENGTH_SHORT).show();
                    recreate();
                }

            }
        });
*/
    }
}
