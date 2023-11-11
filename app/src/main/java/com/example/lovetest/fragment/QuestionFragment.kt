package com.example.lovetest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import com.example.lovetest.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController

    private var _binding: FragmentQuestionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        binding.btnNext.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.btn_next -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}