package vn.edu.hust.fragmentexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), ItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun UpdateBlueContent(item: String) {
//        val fragment = supportFragmentManager.findFragmentById(R.id.blue_fragment)
//        (fragment as BlueFragment).UpdateContent(item)
//    }

    override fun ItemClicked(item: String) {
        val fragment = supportFragmentManager.findFragmentById(R.id.blue_fragment)
        (fragment as BlueFragment).UpdateContent(item)
    }
}