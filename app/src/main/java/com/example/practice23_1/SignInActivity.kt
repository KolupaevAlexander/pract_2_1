package com.example.practice23_1


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.practice23_1.databinding.ActivityMainBinding
import com.example.practice23_1.databinding.ActivitySignInBinding

private lateinit var binding: ActivitySignInBinding
class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun signIn(view: View)
    {
        var email = binding.emailEditText.text
        var password = binding.passwordEditText.text
        if (email.isNotEmpty() && password.isNotEmpty()) {
            var intent = Intent (this, ResultActivity::class.java)
            startActivity(intent)
        }
        else {
            var toast = Toast.makeText(this, R.string.emptyFields, Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}