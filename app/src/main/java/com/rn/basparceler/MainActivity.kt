package com.rn.basparceler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

    override fun onStart(){
        super.onStart()
        Log.i("NVGL", "Tela1::onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.i("NVGL", "Tela1::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("NVGL", "Tela1::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("NVGL", "Tela1::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("NVGL", "Tela1::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NVGL", "Tela1::onDestroy")
    }



}