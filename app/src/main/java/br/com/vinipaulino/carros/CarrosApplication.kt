package br.com.vinipaulino.carros

import android.app.Application
import android.util.Log

/**
 * Created by Vinícius on 27/04/18.
 */
class CarrosApplication : Application(){
    private val TAG = "CarrosApplication"
    //Chamado quando o Android criar o processo

    override fun onCreate() {
        super.onCreate()
        //Salva a instância para termos acesso como Singleton
        appInstance = this
    }

    companion object {
        //Singleton da classe Application
        private var appInstance: CarrosApplication? = null
        fun getInstance(): CarrosApplication{
            if (appInstance == null){
                throw IllegalStateException("Configure a classe de Application no AndroidManifest.xml")
            }
            return appInstance!!
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG, "CarrosApplication.onTerminate()")
    }
}