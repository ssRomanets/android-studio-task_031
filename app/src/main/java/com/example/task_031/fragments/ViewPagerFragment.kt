package com.example.task_031.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.task_031.models.OnBoardingFragmentViewPagerModel
import com.example.task_031.R
import com.example.task_031.StartActivity
import kotlin.jvm.java

/**
 * A simple [Fragment] subclass.
 * Use the [ViewPagerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ViewPagerFragment : Fragment() {
    private var check = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val generalInfoTV: TextView = view.findViewById(R.id.generalInfoTV)
        val invitationTV: TextView = view.findViewById(R.id.invitationTV)
        val viewPagerIV: ImageView = view.findViewById(R.id.viewPagerIV)
        val startBTN: Button = view.findViewById(R.id.startBTN)

        val viewPagerItem = arguments?.getSerializable("vp") as OnBoardingFragmentViewPagerModel
        check = viewPagerItem.checkButton!!
        generalInfoTV.text = viewPagerItem.generalInfo
        invitationTV.text = viewPagerItem.invitation
        viewPagerIV.setImageResource(viewPagerItem.imageView!!)
        if (!check) {
            startBTN.visibility = View.VISIBLE
            startBTN.setOnClickListener{
                startActivity(Intent(activity, StartActivity::class.java))
            }
        }
    }

}


