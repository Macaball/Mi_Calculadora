package com.example.mi_calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var tvRes:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvRes=findViewById(R.id.tvRes)
    }
    fun calcular(view:View){
        var boton= view as Button
        var textoBoton=boton.text.toString()
        var concatenar=tvRes?.text.toString()+textoBoton
        val sb=StringBuffer(str)
        sb.replace(start:0,i,str:"")


    }
    fun quitarcerosizquierda(str: String):String{
        var i=0
        while(i<str.length && str[i]=="0")i++
    }
}