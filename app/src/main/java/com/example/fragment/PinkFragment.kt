package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class PinkFragment : Fragment() {
    lateinit var nameText : TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pink, container, false)
        nameText = view.findViewById(R.id.textView)

        return view
    }
    fun setText (text: String) {
        nameText.text = text
    }
}