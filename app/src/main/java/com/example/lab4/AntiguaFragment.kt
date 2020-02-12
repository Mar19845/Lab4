package com.example.lab4

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.AttributeSet
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class AntiguaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(container?.context).inflate(R.layout.fragment_antigua,container,false)
    }

    override fun onStart() {
        super.onStart()
        return
    }

    override fun onPause() {
        super.onPause()
        return
    }

    override fun onDestroy() {
        super.onDestroy()
        return
    }

    override fun onInflate(context: Context, attrs: AttributeSet, savedInstanceState: Bundle?) {
        super.onInflate(context, attrs, savedInstanceState)
        return
    }

    override fun onResume() {
        super.onResume()
        return
    }

}
