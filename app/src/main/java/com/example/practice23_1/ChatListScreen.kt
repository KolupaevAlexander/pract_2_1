package com.example.practice23_1

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.practice23_1.databinding.ActivityChatListScreenBinding


private lateinit var binding: ActivityChatListScreenBinding
class ChatListScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityChatListScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val array = arrayOf("Lucifer", "The Witcher", "LOST", "The magicans", "Sea", "Skins")
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, R.layout.simple_list_item_1,array)
        binding.listView.adapter  = adapter
    }
}