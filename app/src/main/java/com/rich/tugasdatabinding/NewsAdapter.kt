package com.rich.tugasdatabinding

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.rich.tugasdatabinding.databinding.NewsItemBinding
import com.rich.tugasdatabinding.fragment.ListNewsFragmentDirections
import com.rich.tugasdatabinding.model.News

class NewsAdapter(var listNews : ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.viewHolder>() {
    var onClick : ((News) -> Unit)? = null

    class viewHolder(var binding : NewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(data : News){
            binding.newsData = data
//            binding.cvNews.setOnClickListener(object : View.OnClickListener{
//                override fun onClick(v: View?) {
//                    Log.e("TAG", "onClick: ${data.title}" )
//                    val action = HomeFragmentDirections.actionHomeFragmentToNewsDetailFragment(data)
//                    Navigation.findNavController(itemView).navigate(action)
//                }
//            })
            binding.cvnewsData.setOnClickListener{
                val action = ListNewsFragmentDirections.actionListNewsFragmentToDetailNewsFragment(data)
                Navigation.findNavController(it).navigate(action)
            }
//            binding.clickHandler = EventsHandler(binding.root.context)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
//        val v = NewsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val vBinding = DataBindingUtil.inflate<NewsItemBinding>(LayoutInflater.from(parent.context),R.layout.news_item,parent,false)
        return viewHolder(vBinding)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.bindData(listNews[position])
//        holder.binding.cvNewsData.setOnClickListener {
//            Toast.makeText(holder.binding.root.context, "Clicked", Toast.LENGTH_SHORT).show()
//            Navigation.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToNewsDetailFragment(listNews[position]))
        }

    override fun getItemCount(): Int = listNews.size
}