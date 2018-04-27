package br.com.vinipaulino.carros.activity

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity

/**
 * Created by vinicius on 27/04/18.
 */
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {
    //Propriedade para acessar o contexto de qualquer lugar
    protected val context: Context get() = this

    //Metodos comuns para todas activities aqui
}