package fr.einfolearning.deuxiemeprojet;

import android.app.Activity;

import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_main);

        Log.i("information", "Farida va vous affiche une information générale");
        Log.d("information", "Farida va vous affiche une information pour le débbogage");
        Log.w("information", "Farida va vous affiche une information de warning");
        Log.e("information", "Farida va vous affiche une erreur");
    }
}