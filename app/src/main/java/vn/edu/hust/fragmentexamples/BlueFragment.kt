package vn.edu.hust.fragmentexamples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class BlueFragment : Fragment() {

    lateinit var textContent: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textContent = view.findViewById(R.id.text_content)
        val selectedItem = arguments?.getString("SELECTED_ITEM")
        if (selectedItem != null)
            textContent.text = selectedItem
    }

    fun UpdateContent(item: String) {
        textContent.text = item
    }
}