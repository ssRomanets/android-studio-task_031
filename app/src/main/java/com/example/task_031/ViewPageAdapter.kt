package com.example.task_031

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.task_031.fragments.ViewPagerFragment
import com.example.task_031.models.OnBoardingFragmentViewPagerModel


class ViewPagerAdapter (
    fragment: FragmentActivity,
    private val viewPagerList: MutableList<OnBoardingFragmentViewPagerModel>
) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return viewPagerList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("vp" to viewPagerList[position])
        return fragment
    }
}