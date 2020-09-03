package br.com.molezinif.imccalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculator.*


class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        btnCalcular.setOnClickListener {
            val pesoC = edtPesoCalculadora.text.toString()
            val alturaC = edtAlturaCalculadora.text.toString()
            if (pesoC.isEmpty()) {
                edtPesoCalculadora.error = "Campo obrigatório!"
                edtPesoCalculadora.requestFocus()
            } else {
                edtPesoCalculadora.text.toString()
            }
            if (alturaC.isEmpty()) {
                edtAlturaCalculadora.error = "Campo obrigatório!"
                edtAlturaCalculadora.requestFocus()
            } else {
                edtAlturaCalculadora.text.toString()

                val mIntent = Intent(this, resultActivity::class.java)
                mIntent.putExtra(
                    "PESO",
                    edtPesoCalculadora.text.toString()
                )

                mIntent.putExtra(
                    "ALTURA",
                    edtAlturaCalculadora.text.toString()
                )
                startActivity(mIntent)
            }
        }
    }
}







