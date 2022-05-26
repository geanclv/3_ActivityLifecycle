package com.geancarloleiva.a3_activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    var type = ""
    var detail = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        type = intent.getStringExtra(EXTRA_TYPE).toString()
        println("El valor es: $type")
    }

    fun onOpcASelected(view: View){
        detail = "A"
        Toast.makeText(this, detail, Toast.LENGTH_SHORT).show()
    }

    fun onOpcBSelected(view: View){
        detail = "B"
        Toast.makeText(this, detail, Toast.LENGTH_SHORT).show()
    }

    fun callNewIntent(view: View){
        if(detail != ""){
            val confirmIntent = Intent(this, ConfirmActivity::class.java)
            confirmIntent.putExtra(EXTRA_DETAIL, "The type is $type and the detail is $detail")
            startActivity(confirmIntent)
        } else {
            Toast.makeText(this, "Select an option", Toast.LENGTH_SHORT).show()
        }
    }
}