package com.iamageo.bank_card_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iamageo.bank_card_view.databinding.ActivityMainBinding
import com.iamageo.bank_card_view_android.FlipBankCardViewAnimation
import com.iamageo.bank_card_view_android.startAnimation

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val animation: FlipBankCardViewAnimation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.myBankCardView.bankCardName = "Jhon Doe"
        binding.myBankCardView.bankCardNumber = "0001 0002 0003 0004"
        binding.myBankCardView.bankCardValidate = "02/27"

        binding.myBankCardView.setOnClickListener {
            startAnimation(animation, binding.myBankCardView, binding.myBankCardView, 180)
        }
    }
}