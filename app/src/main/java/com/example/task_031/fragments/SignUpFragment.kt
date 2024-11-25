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
 * Use the [SignUpFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userNameSignUpET = view.findViewById<EditText>(R.id.userNameSignUpET)
        val passwordSignUpET = view.findViewById<EditText>(R.id.passwordSignUpET)
        val loginSignUpBTN = view.findViewById<Button>(R.id.loginSignUpBTN)

        loginSignUpBTN.setOnClickListener{
            val userNameSignUP = userNameSignUpET.text.toString()
            val passwordSignUP = passwordSignUpET.text.toString()
            if (passwordSignUP.isEmpty() || userNameSignUP.isEmpty()) {
                Toast.makeText(context, "Данные не введены", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val bundle = Bundle()
            val signInFragment = SignInFragment()
            bundle.putString("name", userNameSignUP)
            bundle.putString("password", passwordSignUP)
            signInFragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.containerID, signInFragment)?.commit()
            Toast.makeText(context, "Вы успешно зарегистрированы", Toast.LENGTH_LONG).show()
        }
    }
}