package com.example.fitnesbag.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.fitnesbag.App
import com.example.fitnesbag.R
import com.example.fitnesbag.data.dao.TrainProgramDao
import com.example.fitnesbag.view.adapters.AdapterHomeFragment
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject
import kotlin.math.abs

class HomeFragment : Fragment() {

    @Inject lateinit var trainProgramDao: TrainProgramDao
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        App.instance.appComponent.inject(this)
        val test = trainProgramDao.getAll()
        
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val adapter = AdapterHomeFragment(childFragmentManager)
        val viewPager = view?.findViewById<ViewPager>(R.id.view_pager)
        val tabLayout = view?.findViewById<TabLayout>(R.id.tabLayout)
        tabLayout?.addTab(tabLayout.newTab().setText("Trains"));
        tabLayout?.addTab(tabLayout.newTab().setText("Programs"));
        tabLayout?.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout?.setupWithViewPager(viewPager)
        viewPager?.adapter = adapter
        viewPager?.currentItem = 0
        viewPager?.setPageTransformer(false) {
                page, position ->
            val opacity: Float = abs(abs(position) -1)
            page.alpha = opacity
        }
        viewPager?.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }
            override fun onPageSelected(position: Int) {
                viewPager.currentItem = position
            }

        })
        return view


    }
}
