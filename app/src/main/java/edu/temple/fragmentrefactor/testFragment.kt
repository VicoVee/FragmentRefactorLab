package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class testFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_test, container, false)

        layout.findViewById<Button>(R.id.changeButton).apply {
            val displayTextView = layout.findViewById<TextView>(R.id.displayTextView)
            val nameEdit = layout.findViewById<TextView>(R.id.nameEditText)
            setOnClickListener {
                var name = nameEdit.text
                displayTextView.text = if (name.isNotBlank()) {
                    "Hello, $name!"
                } else {
                    "Please enter your name"
                }
            }
        }

        return layout
    }


}