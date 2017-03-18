package com.example.marvi.taller01;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Mensaje extends AppCompatActivity {

    private TextView mensaje;
    private Bundle b;
    private Intent i;

    String aux,nomb ="",segundoNom="",primerApe ="",segundoApe="",eda="",sex="";
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        mensaje = (TextView)findViewById(R.id.lblMensajeFinal);
        b = getIntent().getExtras();

        nomb = b.getString("Nombre");

        segundoNom = b.getString("Segundo Nombre");
        primerApe = b.getString("Primer Apellido");
        segundoApe = b.getString("Segundo Apellido");
        eda = b.getString("Edad");
        sex = b.getString("Sexo");

        res = this.getResources();

        aux = res.getString(R.string.hola)+""+ nomb + ""+ segundoNom +""+ primerApe+ ""+ segundoApe + ""+ res.getString(R.string.tu)+""+ eda + ""+ sex ;

        mensaje.setText(aux);

    }
}
