package test.app.kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter() : RecyclerView.Adapter<MyViewHolder>() {


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.mtitle.text = dataText()[position]
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mInfalter = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recycler_container, parent, false)
        return MyViewHolder(mInfalter)

    }


    companion object
    fun dataText(): MutableList<String> {
        val mutlist = mutableListOf<String>()
        for (i in 0..9){
            mutlist.add("$i")
        }
        return mutlist
    }
}


class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val mtitle:TextView = itemView.findViewById(R.id.text_container)
}

class abudam(labut :String){
    val a :String = labut
}


