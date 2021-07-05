package com.onovughe.week_five_task

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onovughe.week_five_task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    private lateinit var myNameAdapter: NameAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val names: List<NameModel> = listOf(
            NameModel(
                "Kenneth","Oghweniale"
            ),
            NameModel(
                "Onos","Adakare"
            ),
            NameModel(
                "Ejiro","Atori"
            ),
            NameModel(
                "Onorode","Ojarikre")
            ,
            NameModel(
                "Akpesiri","Oghweniale"
            ),
            NameModel(
                "Ojiromu","Oghweniale"
            ),
            NameModel(
                "Omamu","Oghweniale"
            ),
            NameModel(
                "Luke","Oghweniale"
            ),
            NameModel(
                "Raymond","Oghweniale"
            ),
            NameModel(
                "Helen","Oghweniale"
            ),
            NameModel(
                "Roseline","Oghweniale"
            ),
            NameModel(
                "Ese","Oghweniale"
            ),
            NameModel(
                "Favour","Mone"
            ),
            NameModel(
                "Gift","Edo"
            ),
            NameModel(
                "Cynthia","Simpa"
            ),
            NameModel(
                "Jenifer","Ameachi"
            ),
            NameModel(
                "Sharon","Achi"
            ),
            NameModel(
                "Joy","Oweazim"
            ),
            NameModel(
                "Ese","Adakre"
            ),
            NameModel(
                "Gameh","Dirisu"
            )

        )
        myNameAdapter = NameAdapter(names)
        binding.recyclerView.adapter = myNameAdapter

    }

}