package com.ahmadov.okeyscoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import com.ahmadov.okeyscoreapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var player1 : String?=null
    var p1Score1 : Int?=null
    var p1Score2 : Int?=null
    var p1Result : Int?=null

    var player2 : String?=null
    var p2Score1 : Int?=null
    var p2Score2 : Int?=null
    var p2Result : Int?=null

    var player3 : String?=null
    var p3Score1 : Int?=null
    var p3Score2 : Int?=null
    var p3Result : Int?=null

    var player4 : String?=null
    var p4Score1 : Int?=null
    var p4Score2 : Int?=null
    var p4Result : Int?=null




    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)


        binding.Button1.setOnClickListener{
            var p1Score2=binding.P1Score2.toString().toIntOrNull()
            var p1Score1=binding.P1Score1.toString().toIntOrNull()
            Toast.makeText(this@MainActivity, "Please check the values are correct", Toast.LENGTH_SHORT).show()
            if(p1Score1!= null && p1Score2 !=null ){
                p1Result=p1Score1!! + p1Score2!!
                binding.P1Netice.text="$p1Result"
            }
            else{
                Toast.makeText(this@MainActivity, "Please check the values are correct", Toast.LENGTH_SHORT).show()
            }

        }


    }



}