package com.example.practice23_1

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.practice23_1.databinding.ActivityMovieScreenBinding
import com.squareup.picasso.Picasso
import org.json.JSONObject

private lateinit var binding: ActivityMovieScreenBinding
class MovieScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMovieScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        intoInsert("Witcher", binding.rectangleImageView1, binding.text1)
        intoInsert("Skins", binding.rectangleImageView2, binding.text2)
        intoInsert("Sea", binding.rectangleImageView3, binding.text3)
    }

    fun intoInsert(movie_name: String, imgView: ImageView, txtView: TextView)
    {
        var url =
            "https://www.omdbapi.com/?apikey=36de77d8&t="+movie_name
        val queue = Volley.newRequestQueue(this)
        val stringR = StringRequest(
            Request.Method.GET,
            url,
            { response ->
                val obj = JSONObject(response)

                var info_title = obj.getString("Title").toString()


                var info_image = obj.getString("Poster").toString()
                Picasso.get().load(info_image).into(imgView)
                txtView.text = info_title

                Log.d("MyLog", "Response:$response")

            },
            {
                Log.d("MyLog", "Volley error:$it")
            })
        queue.add(stringR)
    }
}