package com.example.lovetest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import com.example.lovetest.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var navController: NavController

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        binding.btnNextMain.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_questionFragment) // 버튼 클릭 시 동작
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}