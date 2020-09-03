package br.com.molezinif.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web1.*

class webActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web1)

        wbv1.settings.javaScriptEnabled = true

        wbv1.loadUrl("https://pt.wikihow.com/Emagrecer-Rápido")

        wbv1.webViewClient = WebViewClient()
    }
}