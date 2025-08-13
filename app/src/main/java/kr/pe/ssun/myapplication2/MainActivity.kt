package kr.pe.ssun.myapplication2

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import kr.pe.ssun.myapplication2.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fm = supportFragmentManager
        fm.beginTransaction()
            .add(R.id.flContent, HomeFragment())
            .commit()
    }
}