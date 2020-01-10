package com.blogspot.geekpwn.tecsociety;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_clases:
                Intent intent0 = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent0);
                return true;
            case R.id.nav_avisos:
                Intent intent1 = new Intent(getApplicationContext(), Main4Activity.class);
                startActivity(intent1);
                return true;
            case R.id.nav_eventos:
                Intent intent2 = new Intent(getApplicationContext(), Main5Activity.class);
                startActivity(intent2);
                return true;
            case R.id.nav_salir:
                AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
                dialogo.setTitle("Salir");
                dialogo.setMessage("¿Desea cerrar sesión?");
                dialogo.setCancelable(false);
                dialogo.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
                dialogo.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialogo.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        Intent d = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(d);
        super.onBackPressed();
    }

}
