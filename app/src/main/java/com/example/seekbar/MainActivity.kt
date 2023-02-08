package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.core.view.KeyEventDispatcher.Component

class MainActivity : AppCompatActivity() {
    private lateinit var seekbar: SeekBar
    private lateinit var landscape:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekbar = findViewById(R.id.seekBar)
        landscape= findViewById(R.id.landscape)

        val initialProgreoss = seekbar.progress
        updateLandscape(initialProgreoss)
        seekbar.setOnSeekBarChangeListener(object:seekbar.OnSeekBaeChangeListener{
            override fun onProgerssChanged(seekBarComponent: SeekBar?, progress: Int, fromUser: Boolean){
                updateLandscape(progress)
            }

        })
        override fun onstartTrackingtouch(P0: SeekBar?) {}
        override fun onStopTrackingtouch(P0: SeekBar?) {}

    }
    private fun updateLandscape(progress:Int){
        updateLandscape. text + getString(R.string.landscape,progress)
    }
}