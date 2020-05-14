package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        glass01.setOnClickListener{viewMonsterImage(R.drawable.white)}
        glass02.setOnClickListener{viewMonsterImage(R.drawable.red)}
        glass03.setOnClickListener{viewMonsterImage(R.drawable.pink)}
        glass04.setOnClickListener{viewMonsterImage(R.drawable.champaine)}
    }

    private fun viewMonsterImage(glassId: Int) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.action = Intent.ACTION_VIEW

        val uri = Uri.parse("http://com.example.myfirstapp/view?id=$glassId")
        intent.data = uri

        intent.putExtra("glassId", glassId)

        startActivity(intent)
    }

}
