package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val mainPinkFragment = PinkFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addPinkFragment(view: View) {
        val pinkFragment = PinkFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, pinkFragment, "pinkFragment")
        transaction.commit()
    }

    fun addYellowFragment(view: View) {
        val yellowFragment = YellowFragment.newInstance("Hej", "Elin")
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, yellowFragment, "yellowFragment")
        transaction.commit()
    }

    fun removePinkFragment(view: View) {
        val pinkFragment = supportFragmentManager.findFragmentByTag("pinkFragment")
        if (pinkFragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.remove(pinkFragment)
            transaction.commit()
        } else {
            Toast.makeText(this, "PinkFragment not found", Toast.LENGTH_SHORT).show()
        }
    }

    fun removeYellowFragment(view: View) {
        val yellowFragment = supportFragmentManager.findFragmentByTag("yellowFragment")
        if (yellowFragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.remove(yellowFragment)
            transaction.commit()
        } else {
            Toast.makeText(this, "YellowFragment not found", Toast.LENGTH_SHORT).show()
        }
    }

    fun replaceWithPinkFragment (view: View) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, mainPinkFragment, "pinkFragment")
        transaction.commit()
    }

    fun changeText (view: View) {
        val fragment = supportFragmentManager.findFragmentByTag("pinkFragment") as? PinkFragment

            fragment?.setText("Elin")

    }

    fun changeYellowText (view: View) {
        val fragment = supportFragmentManager.findFragmentByTag("yellowFragment") as? YellowFragment

        fragment?.setText()
    }
}