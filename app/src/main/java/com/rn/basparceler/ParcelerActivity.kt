package com.rn.basparceler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
}