package com.example.fitnesbag.view.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fitnesbag.view.fragments.TrainProgramFragment
import com.example.fitnesbag.view.fragments.TrainsFragment

class AdapterHomeFragment(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> TrainProgramFragment()
            1 -> TrainsFragment()
            else -> TrainProgramFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "Trains"
        } else if (position == 1) {
            title = "Programs"
        }
        return title
    }
    override fun getCount(): Int {
        return 2
    }
}
