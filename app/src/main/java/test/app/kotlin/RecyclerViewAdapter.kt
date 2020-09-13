package test.app.kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import test.app.kotlin.bdroom.Word

class RecyclerViewAdapter() : RecyclerView.Adapter<MyViewHolder>() {

    private var words = emptyList<Word>() // Cached copy of words


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       // val current = words[position]
        holder.mtitle.text = "k;kl"
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

    internal fun setWords(words: List<Word>) {
        this.words = words
        notifyDataSetChanged()
    }

}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val mtitle:TextView = itemView.findViewById(R.id.text_container)
}


