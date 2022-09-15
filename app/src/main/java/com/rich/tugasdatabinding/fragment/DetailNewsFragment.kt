package com.rich.tugasdatabinding.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.rich.tugasdatabinding.R
import com.rich.tugasdatabinding.databinding.FragmentDetailNewsBinding

class DetailNewsFragment : Fragment() {
    private lateinit var binding : FragmentDetailNewsBinding
    private val args by navArgs<DetailNewsFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()

        binding.toolbarDetail.btnHome.setOnClickListener {
            binding.toolbarDetail.btnHome.setImageResource(R.drawable.ic_filled_home)
            findNavController().navigate(R.id.action_detailNewsFragment_to_listNewsFragment)
        }
    }

    fun getData(){
        val newsData = args.newsDetail
        binding.tvNewsDetailTitle.text = newsData.title
        binding.tvNewsDetailWriter.text = newsData.jurnalis
        binding.tvNewsDetailDate.text = newsData.date
        binding.imgNewsDetailPhoto.setImageResource(newsData.image)
        binding.tvNewsDetailDesc.text = newsData.description
    }
}