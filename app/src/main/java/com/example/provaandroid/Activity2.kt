package com.example.provaandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Activity2 : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dois)
    }

    fun finalizar(view : View) {

        val i = intent
        val nomeCandidato = "";

        if (i != null) {
            nomeCandidato.plus(i.extras.getString("candidato"))
        }

        Toast.makeText(this, "Obrigado por participar da entrevista. Seu voto foi no candidato $nomeCandidato", Toast.LENGTH_SHORT).show()
    }

    fun send(view : View) {

        val i = intent
        val nomeCandidato = "";

        if (i != null) {
            nomeCandidato.plus(i.extras.getString("candidato"))
        }

        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_EMAIL, "intensaovotos@teste.com.br");
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Candidato votado $nomeCandidato")
        sendIntent.type = "text/plain"
        startActivity(sendIntent)

        Toast.makeText(this, "Enviado", Toast.LENGTH_SHORT).show()
    }

    fun voltar(view : View) {
        finish()
    }
}