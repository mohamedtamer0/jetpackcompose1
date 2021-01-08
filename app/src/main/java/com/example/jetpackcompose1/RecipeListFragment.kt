package com.example.jetpackcompose1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

class RecipeListFragment : Fragment () {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Text(text = "Recipe List Fragment")
            }
        }
    }












//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = ComposeView(requireContext())
//        view.apply {
//            setContent {
//                Text(text = "Hey Look aComposable")
//            }
//        }
//        return view
//    }


}