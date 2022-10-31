package com.example.pesquisapessoas

import java.io.Serializable

class Jogador (var nome: String, var idade: Int): Serializable {
    override fun toString(): String {
        return "${nome} - ${idade}"
    }
}