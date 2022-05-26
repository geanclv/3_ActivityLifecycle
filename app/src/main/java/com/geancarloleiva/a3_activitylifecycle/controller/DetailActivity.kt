package com.geancarloleiva.a3_activitylifecycle.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.geancarloleiva.a3_activitylifecycle.R
import com.geancarloleiva.a3_activitylifecycle.model.PartyMarty
import com.geancarloleiva.a3_activitylifecycle.utils.EXTRA_PARTYMARTY

class DetailActivity : AppCompatActivity() {

    //Optimizando con Parcelable
    lateinit var partyMarty: PartyMarty
    /*var type = ""
    var detail = ""*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //Optimizando con Parcelable
        partyMarty = intent.getParcelableExtra(EXTRA_PARTYMARTY)!!
        /*type = intent.getStringExtra(EXTRA_TYPE).toString()
        println("El valor es: $type")*/
    }

    fun onOpcASelected(view: View){
        partyMarty.detail = "A"
        Toast.makeText(this, partyMarty.detail, Toast.LENGTH_SHORT).show()
    }

    fun onOpcBSelected(view: View){
        partyMarty.detail = "B"
        Toast.makeText(this, partyMarty.detail, Toast.LENGTH_SHORT).show()
    }

    fun callNewIntent(view: View){
        if(partyMarty.detail != ""){
            val confirmIntent = Intent(this, ConfirmActivity::class.java)
            confirmIntent.putExtra(EXTRA_PARTYMARTY, partyMarty)
            startActivity(confirmIntent)
        } else {
            Toast.makeText(this, "Select an option", Toast.LENGTH_SHORT).show()
        }
    }
}