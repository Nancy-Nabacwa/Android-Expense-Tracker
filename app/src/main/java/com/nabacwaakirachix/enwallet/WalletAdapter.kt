package com.nabacwaakirachix.enwallet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nabacwaakirachix.enwallet.databinding.WalletItemListBinding
import com.squareup.picasso.Picasso

class WalletAdapter(private val incomeList: List<Wallet>) : RecyclerView.Adapter<WalletAdapter.WalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val binding = WalletItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WalletViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return incomeList.size
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = incomeList[position]
        holder.binding.tvItemAmount.text = wallet.incomeAmount
        holder.binding.tvItemDate.text = wallet.incomeDate
        holder.binding.tvItemTitle.text = wallet.incomeTitle

        if (wallet.incomeStatus) {
            Picasso.get()
                .load(R.drawable.expense_trx)
                .placeholder(R.drawable.expense_trx)
                .into(holder.binding.ivItemIcon)
        } else {
            Picasso.get()
                .load(R.drawable.income_trx)
                .placeholder(R.drawable.income_trx)
                .into(holder.binding.ivItemIcon)
        }
    }

    class WalletViewHolder(var binding: WalletItemListBinding) : RecyclerView.ViewHolder(binding.root)
}