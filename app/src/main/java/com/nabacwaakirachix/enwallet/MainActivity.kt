package com.nabacwaakirachix.enwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nabacwaakirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        displayIncomes()
    }

    fun displayIncomes(){
        val income1 = Wallet("Salary",false,"12/3/2045","","2000")
        val income2 = Wallet("Rent",true,"12/3/2045","","2000")
        val income3 = Wallet("Dividends",false,"12/3/2045","","2000")
        val income4 = Wallet("Electricity",true,"12/3/2045","","2000")
        val income5 = Wallet("Internet",true,"12/3/2045","","2000")
        val income6 = Wallet("Shopping",true,"12/3/2045","","2000")
        val income7 = Wallet("Busfare",true,"12/3/2045","","2000")
        val income8 = Wallet("Waterbill",true,"12/3/2045","","2000")
        val income9 = Wallet("Loans",false,"12/3/2045","","2000")
        val income10 = Wallet("Hospital",true,"12/3/2045","","2000")

        val incomeList = listOf(income1,income2,income3,income4,income5,income6,income7,income8,income9,income10)
        val incomeAdapter = WalletAdapter(incomeList)
        binding.rvWallet.adapter = incomeAdapter
    }
}