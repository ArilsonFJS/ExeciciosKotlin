/*Monte uma atividade com os campos de texto “valor1”, “valor2” e “resultado”
e os botões “somar”, “subtrair”, “multiplicar” e “dividir”. Implemente as
operações de cada um dos botões efetuando a operação respectiva com os
valores em “valor1” e “valor2” e exiba o resultado na caixa “resultado”.*/

package com.example.aula03exerciciosdeandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Exer03 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exer03)

        var editResultado = findViewById<EditText>(R.id.editResult)
        var editValor1 = findViewById<EditText>(R.id.editValor1)
        var editValor2 = findViewById<EditText>(R.id.editValor2)

        val btnSomar = findViewById<Button>(R.id.btnSomar)
        val btnSub = findViewById<Button>(R.id.btnSubtrair)
        val btnDiv = findViewById<Button>(R.id.btnDividir)
        val btnMult = findViewById<Button>(R.id.btnMultiplicar)

        btnSomar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            var resultado = valor1 + valor2

            editResultado.setText(resultado.toString())
        }

        btnSub.setOnClickListener {
            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            var resultado = valor1 - valor2

            editResultado.setText(resultado.toString())
        }

        btnDiv.setOnClickListener {
            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            var resultado = valor1 / valor2

            editResultado.setText(resultado.toString())
        }

        btnMult.setOnClickListener {
            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            var resultado = valor1 * valor2

            editResultado.setText(resultado.toString())
        }
    }
}