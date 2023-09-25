package com.rn.basparceler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rn.basparceler.databinding.ActivityMainBinding
import org.parceler.Parcels

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnJogador.setOnClickListener{
            val jogador = Jogador(22, "Atacante")
            val intent = Intent(this, ParcelerActivity::class.java)
            intent.putExtra("jogador", Parcels.wrap(jogador))

            startActivity(intent)
        }


    }



}