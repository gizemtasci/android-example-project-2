package com.example.student.app_21022018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText corbaAdet;
    EditText yemekTabakAdet;
    EditText tatliServisAdet;

    TextView yemek;
    TextView bahsis;
    TextView hesap;

    TextView corbaToplam;
    TextView yemekToplam;
    TextView tatliToplam;

    Button butonHesapla;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corbaAdet=(EditText)findViewById(R.id.txtCorbaAdet);
        yemekTabakAdet=(EditText)findViewById(R.id.txtYemekAdet);
        tatliServisAdet=(EditText)findViewById(R.id.txtTatlıAdet);


        corbaToplam=(TextView)findViewById(R.id.txtCorbaToplam);
        yemekToplam=(TextView)findViewById(R.id.txtYemekToplam);
        tatliToplam=(TextView)findViewById(R.id.txtTatliToplam);

        yemek = (TextView) findViewById(R.id.txtToplamYemek);
        bahsis = (TextView) findViewById(R.id.txtToplamBahsis);
        hesap = (TextView) findViewById(R.id.txtToplamHesap);



        butonHesapla= (Button) findViewById(R.id.btnBahsisHesapla);

        butonHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Double cAdet = Double.valueOf(corbaAdet.getText().toString());
                Double yAdet = Double.valueOf(yemekTabakAdet.getText().toString());
                Double tAdet = Double.valueOf(tatliServisAdet.getText().toString());

                Double corbaBirim = cAdet*4.5;
                corbaToplam.setText("Toplam Fiyat "+corbaBirim.toString());
                Double yemekBirim = yAdet*7.4;
                yemekToplam.setText("Toplam Fiyat "+yemekBirim.toString());
                Double tatliBirim = tAdet*5.3;
                tatliToplam.setText("Toplam Fiyat "+tatliBirim.toString());


                Double toplamHesap = cAdet*4.5+yAdet*7.4+tAdet*5.3;


                yemek.setText("Toplam Yemek: "+toplamHesap.toString());

                Double bahsisToplam = toplamHesap*5/100;
                bahsis.setText("Toplam Bahşiş(%5): "+bahsisToplam.toString());

                Double sonHesap = toplamHesap+bahsisToplam;
                hesap.setText("Toplam Hesap: "+sonHesap.toString());
            }
        });



    }
}
