package com.geektech.hm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.geektech.hm.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    lateinit var binding:FragmentFirstBinding
    private val list = arrayListOf<Photo>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = PhotoAdapter(list, this::onClick)
        binding.apply {
            recyclerview.layoutManager = GridLayoutManager(context, 3)
            recyclerview.adapter = adapter
        }
    }

private fun onClick(position: Int){}

    private fun loadData() {
        list.add(Photo("https://i.pinimg.com/236x/ee/bb/53/eebb536f90b2f028609d7e6b34c8e482.jpg"))
        list.add(Photo("https://i.pinimg.com/236x/ee/bb/53/eebb536f90b2f028609d7e6b34c8e482.jpg"))
        list.add(Photo("https://i.pinimg.com/236x/ee/bb/53/eebb536f90b2f028609d7e6b34c8e482.jpg"))
    }
}