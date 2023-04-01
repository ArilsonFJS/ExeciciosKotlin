/*Elabore uma atividade que permita ao usuário informar um número e clicar
num botão. Quando o botão for clicado, a atividade deverá dizer ao usuário se
o número é par, ímpar ou zero através de um diálogo.*/

package com.example.aula03exerciciosdeandroid

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Exer02 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exer02)

        var editNum = findViewById<EditText>(R.id.editNum)
        val btn = findViewById<Button>(R.id.btnPressione)

        btn.setOnClickListener {
            val num = editNum.text.toString().toIntOrNull()

            val msg = when {
                num == null -> "Por favor, insiro um número"
                num == 0 -> "O número é 0"
                num % 2 == 0 -> "O número $num é par"
                else -> {"O número $num é ímpar"}
            }
            dialogo(msg)
        }
    }

        @SuppressLint("SuspiciousIndentation")
        fun dialogo(msg: String){
            val dialogo = AlertDialog.Builder(this)
                .setTitle("Resultado")
                .setMessage(msg)
                .setPositiveButton("OK") { dialog, _ -> dialog.dismiss()}
                .create()
                dialogo.show()
        }
}