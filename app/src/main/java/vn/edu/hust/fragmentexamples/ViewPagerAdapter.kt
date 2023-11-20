package vn.edu.hust.fragmentexamples

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int  = 3

    override fun createFragment(position: Int): Fragment {
        if (position == 0)
            return BlankFragment()
        else if (position == 1)
            return RedFragment()
        else
            return BlueFragment()
    }
}