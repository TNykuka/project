package com.example.project.Alphabet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.project.R
import java.util.*

object AlphabetModelFactory{

    private val random = Random()

    private val titles =  arrayListOf( "Aviator", "Now you can See me", "God Father", "Mission Impossible", "3 idiots")

    private fun randomTitle() : String{
        val index = random.nextInt(titles.size)
        return titles[index]
    }

    private fun randomImage() : Int{
        return R.drawable.letter_a
    }

    fun getAlphabet(count : Int) : List<AlphabetViewModel>{
        val children = mutableListOf<AlphabetViewModel>()
        repeat(count){
            val child = AlphabetViewModel(randomImage(), randomTitle())
            children.add(child)
        }
        return children
    }


}