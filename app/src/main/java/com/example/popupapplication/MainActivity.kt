package com.example.popupapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.popupapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val background = findViewById<ConstraintLayout>(R.id.relativeLayout) as ConstraintLayout

        binding.button.setOnClickListener {
            val popup = PopupMenu(this, button)
            popup.menuInflater.inflate(R.menu.pop_up_menu, popup.menu)

            popup.setOnMenuItemClickListener { myItem ->
                val item = myItem!!.itemId
                when (item) {
                    R.id.add -> {
                        background.setBackgroundColor(Color.GRAY)
                    }

                    R.id.update -> {
                        background.setBackgroundColor(Color.BLUE)
                    }

                    R.id.delete -> {
                        background.setBackgroundColor(Color.GREEN)
                    }

                }
                true

            }
            popup.show()

        }
    }
}