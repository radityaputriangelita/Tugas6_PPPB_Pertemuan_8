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
import com.example.tugas6_pppb_pertemuan_8.databinding.FragmentRegisterBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentRegisterBinding

    private lateinit var usernameEditText : EditText
    private lateinit var RegisterButton : Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root

        usernameEditText = binding.usernameInput
        RegisterButton = binding.btnRegis

        RegisterButton.setOnClickListener{
            val username = usernameEditText.text.toString()
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)

        }
        return view
    }
}