package com.reihanalavi.cobaprojecthackathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MenuActivity : AppCompatActivity() {

    public var luas: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        luas = 13

        Toast.makeText(this, hitungPersegi(luas), Toast.LENGTH_SHORT).show()

    }

    private fun hitungPersegi(sisi: Int): Int {
        //toast fungsi nichhhhhh
        //ogheh
        var luasFinal: Int?
        luasFinal = sisi * sisi
        return luasFinal - 2
    }
}
