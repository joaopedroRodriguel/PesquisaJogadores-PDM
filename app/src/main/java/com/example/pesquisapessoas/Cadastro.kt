package com.example.pesquisapessoas

class Cadastro {
    private var lista: ArrayList<Jogador>

    init {
        this.lista = ArrayList()
    }

    fun add(j: Jogador){
        this.lista.add(j)
    }

    fun get(): ArrayList<Jogador>{
        return this.lista
    }

    fun get(index: Int): Jogador{
        return this.lista[index]
    }
}