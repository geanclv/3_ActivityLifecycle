package com.geancarloleiva.a3_activitylifecycle.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.geancarloleiva.a3_activitylifecycle.R
import com.geancarloleiva.a3_activitylifecycle.model.PartyMarty
import com.geancarloleiva.a3_activitylifecycle.utils.EXTRA_PARTYMARTY

class TypeActivity : BasicActivity() {

    //refactorizando la variable con una clase Parcelable: partyMarty
    //var selectedOption = "";
    var partyMarty = PartyMarty("", "")

    //Inicio Evitando perder datos al girar la pantalla
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PARTYMARTY, partyMarty)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            partyMarty = savedInstanceState.getParcelable<PartyMarty>(EXTRA_PARTYMARTY)!!
        }
    }
    //Fin Evitando perder datos al girar la pantalla

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type)

        //forma 1 de accionar un botón clicado
        /*val btnContinue: Button = findViewById(R.id.btnNext)
        btnContinue.setOnClickListener {
            val detailIntent = Intent(this, DetailActivity::class.java)
            startActivity(detailIntent)
        }*/

        //forma 3 de accionar un botón: llamando un método
        val btnRestaurant: Button = findViewById(R.id.btnRestaurant)
        btnRestaurant.setOnClickListener{onSelectedType("Restaurant")}
        val btnCinema: Button = findViewById(R.id.btnCinema)
        btnCinema.setOnClickListener{onSelectedType("Cinema")}
        val btnParty: Button = findViewById(R.id.btnParty)
        btnParty.setOnClickListener{onSelectedType("Party")}
    }

    //forma 2 de accionar un botón clicado
    fun btnNextClicked(view: View){
        if(partyMarty.type != ""){
            val detailIntent = Intent(this, DetailActivity::class.java)
            detailIntent.putExtra(EXTRA_PARTYMARTY, partyMarty)
            startActivity(detailIntent)
        } else {
            Toast.makeText(this, "Debe seleccionar una opción", Toast.LENGTH_SHORT).show()
        }
    }

    fun onSelectedType(type: String){
        partyMarty.type = type;
        Toast.makeText(this, partyMarty.type, Toast.LENGTH_SHORT).show()
    }
}