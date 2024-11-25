package com.example.task_031.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.task_031.R

/**
 * A simple [Fragment] subclass.
 * Use the [SignInFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = arguments?.getString("name")
        val password = arguments?.getString("password")

        val userNameSignInET = view.findViewById<EditText>(R.id.userNameSignInET)
        val passwordSignInET = view.findViewById<EditText>(R.id.passwordSignInET)
        val loginSignInBTN = view.findViewById<Button>(R.id.loginSignInBTN)
        loginSignInBTN.setOnClickListener{
            if (name != userNameSignInET.text.toString() ||
                password != passwordSignInET.text.toString()) {
                Toast.makeText(context, "Введены неверно логин или пароль", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            } else {
                fragmentManager?.beginTransaction()?.replace(R.id.containerID, ViewPagerFragment())?.commit()
            }
        }
    }
}