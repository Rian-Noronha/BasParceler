package com.rn.basparceler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rn.basparceler.databinding.ActivityParcelerBinding
import org.parceler.Parcels

class ParcelerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityParcelerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jogador = Parcels.unwrap<Jogador?>(intent.getParcelableExtra("jogador"))

        binding.txtResultados.text = if(jogador != null){
            getString(R.string.texto_tela2, jogador.posicao, jogador.idade)
        }else{
            getString(R.string.texto_tela2, "nof", -1)
        }.toString()

    }

    override fun onStart(){
        super.onStart()
        Log.i("NVGL", "Tela2::onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.i("NVGL", "Tela2::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("NVGL", "Tela2::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("NVGL", "Tela2::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("NVGL", "Tela2::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NVGL", "Tela2::onDestroy")
    }
}
