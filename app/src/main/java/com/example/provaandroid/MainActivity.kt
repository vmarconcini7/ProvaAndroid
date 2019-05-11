package com.example.provaandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        findViewById<RadioGroup>(R.id.candidato).clearCheck()
    }

    fun prosseguir(view : View) {
        val i = Intent(this, Activity2::class.java)
        i.putExtra("candidato", findViewById<RadioGroup>(R.id.candidato).checkedRadioButtonId)
        startActivity(i)
    }
}
