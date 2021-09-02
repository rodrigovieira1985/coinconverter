package com.example.coinconverter.data.model

import java.util.*

enum class Coin(val locale: Locale) {
    USD(Locale.US),
    CAD(Locale.CANADA),
    BRL(Locale("pt", "BR")),
    ARS(Locale("es", "AR")),
    BTC(Locale("pt", "BR")),
    ETH(Locale("pt", "BR")),
    LTC(Locale("pt", "BR"))
    ;


    companion object {
        fun getByName(name: String) = values().find { it.name == name } ?: BRL
    }

}