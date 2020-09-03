package br.com.molezinif.imccalculator

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val peso = intent.getStringExtra("PESO")!!.toFloat()
        val altura = intent.getStringExtra("ALTURA")!!.toFloat()
        val IMC = (peso / altura / altura)

        txvPeso.text = "Peso: $peso KG"
        txvAltura.text = "Altura : $altura Metros "
        txvIMCC.text = "IMC : $IMC"
        if (IMC <= 18.5) {
            txvResult.text = ("Abaixo do peso")
        } else if (IMC <= 24.9) {
            txvResult.text = ("Peso ideal")
        } else if (IMC <= 29.9) {
            txvResult.text = ("Levemente acima do peso")

        } else if (IMC <= 34.9) {
            txvResult.text = ("Obesidade grau I")
        } else if (IMC <= 39.9) {
            txvResult.text =("Obesidade grau II")
        } else if (IMC > 40) {
            txvResult.text =("Obesidade grau III")
        }

        button3.setOnClickListener {
            AlertDialog.Builder(this,)
                .setTitle("Atenção!")
                .setMessage("Deseja calcular outro IMC?")
                .setPositiveButton("Sim, calcular") { _, _ ->
                    val mIntent = Intent(this, CalculatorActivity::class.java)
                    startActivity(mIntent)
                    finishAffinity()
                }
                .setNeutralButton("Cancelar") { _, _ -> }
                .setCancelable(false)
                .create()
                .show()
        }
        btnEmagrecer.setOnClickListener {
            val mIntent = Intent(this, webActivity1::class.java)
            startActivity(mIntent)
        }
        btnEngordar.setOnClickListener {
            val mIntent = Intent(this, webActivity2::class.java)
            startActivity(mIntent)
        }

    }
}