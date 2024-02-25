package com.example.practice23_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.practice23_1.databinding.ActivityResultBinding

private lateinit var binding: ActivityResultBinding
class ResultActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
    fun clickImage(view: View)
    {
        var intent = Intent (this, ChatListScreen::class.java)
        startActivity(intent)
    }
    fun clickImage2(view: View)
    {
        var intent = Intent (this, MovieScreen::class.java)
        startActivity(intent)
    }
}