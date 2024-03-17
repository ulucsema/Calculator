package com.semauluc.fourtransactionskotlin

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.android.synthetic.main.activity_main.editText
import kotlinx.android.synthetic.main.activity_main.editText2
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {
    var sayi1: Int? = null
    var sayi2 : Int? =null
    var sonuc : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyUp(keyCode, event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        return true

    }

    override fun dispatchKeyEvent(event: KeyEvent): Boolean {
        return if (event.action == KeyEvent.KEYCODE_0) {
            // keydown logic
            println("keypress")

            true
        } else false
    }

    override fun onDestroy() {
        super.onDestroy()
    }


    fun topla(view : View) {

        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = "Geçerli bir sayı girin!"
        } else {
            sonuc = sayi1!! + sayi2!!
            textView.text = "Sonuç : ${sonuc}"
        }
    }
    fun cikar(view : View){
        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = "Geçerli bir sayı girin!"
        } else {
            sonuc = sayi1!! - sayi2!!
            textView.text = "Sonuç : ${sonuc}"
        }
    }
    fun bol(view : View) {
        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = "Geçerli bir sayı girin!"
        } else {
            sonuc = sayi1!! / sayi2!!
            textView.text = "Sonuç : ${sonuc}"
        }
    }
    fun carp(view : View){
        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = "Geçerli bir sayı girin!"
        } else {
            sonuc = sayi1!! * sayi2!!
            textView.text = "Sonuç : ${sonuc}"
        }
    }

}