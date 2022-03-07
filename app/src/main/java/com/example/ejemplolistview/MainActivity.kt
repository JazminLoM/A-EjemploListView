package com.example.ejemplolistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas:ArrayList<fruta> = ArrayList()
        frutas.add(fruta("Manzana", R.drawable.manzana ))
        frutas.add(fruta("Durazno", R.drawable.durazno))
        frutas.add(fruta("Platano", R.drawable.platano))
        frutas.add(fruta("Sandia", R.drawable.sandia))

        val lista = findViewById<ListView>(R.id.lista)

        val adapatador = AdaptadorCustom(this, frutas)
        lista.adapter  =adapatador

        lista.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, frutas.get(i).nombre, Toast.LENGTH_LONG).show()
        }




    }
}