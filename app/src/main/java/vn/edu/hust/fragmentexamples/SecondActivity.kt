package vn.edu.hust.fragmentexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity(), ItemClickListener {

    val redFragment = RedFragment()
    val blueFragment = BlueFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportFragmentManager.beginTransaction()
            .add(R.id.layout_red, redFragment)
            .add(R.id.layout_blue, blueFragment)
            .commit()
    }

    override fun ItemClicked(item: String) {
        blueFragment.UpdateContent(item)
    }
}