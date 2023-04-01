/*1. Componha uma atividade com dois campos de texto (nome e sobrenome) e um
botão (exibir). Ao clicar no botão, exiba uma mensagem de diálogo com título
“Bem-vindo” e a mensagem “Olá, nome + sobrenome!”.*/

package com.example.aula03exerciciosdeandroid

import android.annotation.SuppressLint
import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Exer01 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exer01)

        val nomeEditText = findViewById<EditText>(R.id.textNome)
        val sobrenomeEditText = findViewById<EditText>(R.id.textSobrenome)

        val btnExibit = findViewById<Button>(R.id.btnExibir)

        btnExibit.setOnClickListener {

            val nome = nomeEditText.text.toString()
            val sobrenome = sobrenomeEditText.text.toString()

            val mensagem = "Olá $nome $sobrenome!"

            exibirMensagem(mensagem)
        }
    }

    fun exibirMensagem(msg: String){

        val dialog = AlertDialog.Builder(this)
            .setTitle("Bem-vindo(a)!")
            .setMessage(msg)
            .setPositiveButton("OK"){ dialog, _ ->
                dialog.dismiss()
            }
            .create()
        dialog.show()
    }
}