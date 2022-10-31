package com.example.pesquisapessoas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val search = findViewById<SearchView>(R.id.serachView)
        val listView = findViewById<ListView>(R.id.listView)
        val pessoas = arrayOf("Weverton", "Allyson", "Gabriel Jesus", "Alex Telles", "Fabinho",
            "Neymar", "Antony", "Rafinha", "Roberto Firmino", "Thiago Silva", "Casemiro",
            "Eder Militão", "Pedro", "Gabriel Barbosa", "Everton Ribeiro", "Danilo", "Matheus Cunha",
            "Bruno Guimarães", "Rodrigo", "Ibañez", "Bremer", "Marquinhos", "Igor", "Rafinha", "Victor Bueno",
            "Diego Costa", "Rodinei", "Reinaldo", "Diegos Costa", "Jandrey", "Felipe Alves", "Miranda", "Igor vinicius"
            )

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1
            ,pessoas
        )
        listView.adapter = adapter
        search.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
               search.clearFocus()
               if(pessoas.contains(p0))
               {
                   adapter.filter.filter(p0)
               }else{
                   Toast.makeText(applicationContext,"Pessoa Não encontrada",Toast.LENGTH_LONG).show()
               }
               return false
            }
            override fun onQueryTextChange(p0: String?): Boolean {
                adapter.filter.filter(p0)
                return false
            }
        }
        )
    }
}