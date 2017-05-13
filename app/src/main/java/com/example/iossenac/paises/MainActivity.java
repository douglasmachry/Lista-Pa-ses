package com.example.iossenac.paises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    //List<String> paises;


    private List<String> paises = new ArrayList<String>();
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paises.add("Brasil");
        paises.add("Argentina");
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,paises);
        ListView listaPaises = (ListView) findViewById(R.id.listaPaises);
        listaPaises.setAdapter(adaptador);

    }



    public void cadastrarPais(View view){
        EditText novopais = (EditText) findViewById(R.id.textopais);
        paises.add(novopais.getText().toString());
        novopais.setText("");
        adaptador.notifyDataSetChanged();
    }
}
