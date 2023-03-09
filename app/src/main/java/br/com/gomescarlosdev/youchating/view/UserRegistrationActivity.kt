package br.com.gomescarlosdev.youchating.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.gomescarlosdev.youchating.databinding.ActivityUserRegistrationBinding

class UserRegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserRegistrationBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}