package br.com.molezinif.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web2.*

class webActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web2)

        wbv2.settings.javaScriptEnabled = true

        wbv2.loadUrl("https://pt.wikihow.com/Engordar")

        wbv2.webViewClient = WebViewClient()
    }
}