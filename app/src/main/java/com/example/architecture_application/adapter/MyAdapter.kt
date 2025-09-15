package com.example.architecture_application.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.architecture_application.R
import com.example.architecture_application.activities.DetailActivity
import com.example.architecture_application.models.EntityDetails

class MyAdapter(private val entityList: List<EntityDetails>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_title)
        val tvArchitect: TextView = itemView.findViewById(R.id.tv_artist)   // architect/artist
        val tvYear: TextView = itemView.findViewById(R.id.tv_year)
        val tvLocation: TextView = itemView.findViewById(R.id.tv_location)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.each_entity, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val entity = entityList.getOrNull(position)

        holder.tvName.text = entity?.name ?: "Unknown Name"
        holder.tvArchitect.text = "Architect: ${entity?.architect ?: "N/A"}"
        holder.tvYear.text = "Year: ${entity?.yearCompleted ?: "N/A"}"
        holder.tvLocation.text = "Location: ${entity?.location ?: "N/A"}"

        // Handle click → open DetailActivity
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)

            entity?.let {
                intent.putExtra("name", it.name)
                intent.putExtra("architect", it.architect)
                intent.putExtra("location", it.location)
                intent.putExtra("yearCompleted", it.yearCompleted)
                intent.putExtra("style", it.style)
                intent.putExtra("height", it.height)
                intent.putExtra("description", it.description)
            }

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = entityList.size
}
