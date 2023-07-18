package com.kotlin.mengoss.ui.Contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kotlin.mengoss.databinding.FragmentAboutBinding

class ContactFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(ContactViewModel::class.java)

        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        val root: View = binding.root
binding.about.apply{
    loadUrl("https://mengoss.sc.ug/contact-us/")
    settings.allowContentAccess = true
    settings.javaScriptEnabled = true
    settings.domStorageEnabled = true
    settings.useWideViewPort = true
}

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}