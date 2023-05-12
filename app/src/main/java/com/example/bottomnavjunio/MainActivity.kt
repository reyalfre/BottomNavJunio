package com.example.bottomnavjunio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bottomnavjunio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        mBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.action_page1->{
                    val fragmentTransaction = supportFragmentManager.beginTransaction()
                    fragmentTransaction.add(R.id.hostFragment, PrimerFragment())
                    fragmentTransaction.commit()

                    Toast.makeText(this, "estoy page 1", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_page2->{
                    val fragmentTransaction = supportFragmentManager.beginTransaction()
                    fragmentTransaction.add(R.id.hostFragment, SegundoFragment())
                    fragmentTransaction.commit()

                    Toast.makeText(this, "estoy page 2", Toast.LENGTH_SHORT).show()
                    true
                }
                else-> false
            }
        }

    }
}