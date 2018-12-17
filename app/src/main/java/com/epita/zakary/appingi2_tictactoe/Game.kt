package com.epita.zakary.appingi2_tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.game.*


class Game : AppCompatActivity(){

    var playerName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        val originIntent = intent
        val name = originIntent.getStringExtra("NAME")
        playerName = name
        player_name.text = "O (" + name + ")"
    }
}
