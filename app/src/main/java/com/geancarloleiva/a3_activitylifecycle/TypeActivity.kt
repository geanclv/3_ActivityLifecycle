package com.geancarloleiva.a3_activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class TypeActivity : BasicActivity() {

    var selectedOption = "";

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
        if(selectedOption != ""){
            val detailIntent = Intent(this, DetailActivity::class.java)
            detailIntent.putExtra(EXTRA_TYPE, selectedOption)
            startActivity(detailIntent)
        } else {
            Toast.makeText(this, "Debe seleccionar una opción", Toast.LENGTH_SHORT).show()
        }
    }

    fun onSelectedType(type: String){
        selectedOption = type;
        Toast.makeText(this, selectedOption, Toast.LENGTH_SHORT).show()
    }
}