package br.com.vinipaulino.carros.activity

import android.os.Bundle
import br.com.vinipaulino.carros.R
import br.com.vinipaulino.carros.extensions.setupToolbar

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar(R.id.toolbar)
    }
}
