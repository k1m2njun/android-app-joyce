package com.example.lovetest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import com.example.lovetest.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private lateinit var navController: NavController

    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!

    var option = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        option = arguments?.getInt("index")?: -1
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        setResult(option)

        binding.home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    fun setResult(option : Int) {
        when(option) {
            1 -> {
                binding.titleText.text = "You are a Quitter !"
                binding.mainText.text = "You can let the person easily."
            }
            2 -> {
                binding.titleText.text = "You should focus on yourself"
                binding.mainText.text = "You become really clingy to your ex."
            }
            3 -> {
                binding.titleText.text = "You should take it easy !"
                binding.mainText.text = "You can do crazy things no matter what it takes."
            }
            4 -> {
                binding.titleText.text = "You are pretty mature."
                binding.mainText.text = "You can easily accept the break-up."
            }

        }
    }


}