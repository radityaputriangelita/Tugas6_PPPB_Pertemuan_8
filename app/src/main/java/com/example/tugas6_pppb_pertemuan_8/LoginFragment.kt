package com.example.tugas6_pppb_pertemuan_8

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.tugas6_pppb_pertemuan_8.databinding.FragmentLoginBinding
import kotlin.math.log

// TODO: Rename parameter arguments, choose names that match
/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    private lateinit var usernameEditText : EditText
    private lateinit var passworEditText: EditText
    private lateinit var loginButton : Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        usernameEditText = binding.usernameInputLogin
        passworEditText = binding.passwordInputEdittextLogin
        loginButton = binding.btnLogin

        loginButton.setOnClickListener{
            val username = usernameEditText.text.toString()
            val password = passworEditText.text.toString()

            val fixUsername = "Angel"
            val fixPassword = "123456"

            if (username == fixUsername && password == fixPassword){
                val intent = Intent(context, SecondActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
            } else {
                Toast.makeText(context, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
}