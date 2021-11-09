package com.example.movieapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv.view.*

class MyAdapter(val arrayList : ArrayList<Model>, val context: Context):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(model: Model){
            itemView.tv_title.text = model.title
            itemView.tv_desc.text = model.desc
            itemView.img_view.setImageResource(model.img)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
        holder.itemView.setOnClickListener{
            val model = arrayList.get(position)

            var gTitle : String = model.title
            var gDesc : String = model.desc
            var gImg : Int = model.img

            val intent = Intent(context, IntentActivity::class.java)

            intent.putExtra("iTitle",gTitle)
            intent.putExtra("iDesc",gDesc)
            intent.putExtra("iImg",gImg)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}