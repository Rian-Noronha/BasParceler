package com.rn.basparceler
import org.parceler.Parcel
import org.parceler.ParcelConstructor

@Parcel
class Jogador(var idade:Int, var posicao:String) {

    @ParcelConstructor
    constructor():this(0,"")
}