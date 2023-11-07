package com.ahmadov.okeyscoreapp

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View

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
    var shP1Result : Int? = null
    var shP1Score1 :Int?= null
    var shPlayer1 :String?=null
    var shP2Result : Int? = null
    var shP2Score1 :Int?= null
    var shPlayer2 :String?=null
    var shP3Result : Int? = null
    var shP4Result : Int? = null
    var shPlayer4 :String?=null
    var shPlayer3 :String?=null
    var shP4Score1 :Int?= null
    var shP3Score1 :Int?= null



    private lateinit var binding : ActivityMainBinding
    private lateinit var sharedPreferences : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        sharedPreferences=this.getSharedPreferences("com.ahmadov.okeyscoreapp", Context.MODE_PRIVATE)


        shP1Score1=sharedPreferences.getInt("p1Score1",-1)
        shPlayer1=sharedPreferences.getString("player1","")
        shP1Result=sharedPreferences.getInt("p1Result",-1)


        shP2Score1=sharedPreferences.getInt("p2Score1",-1)
        shPlayer2=sharedPreferences.getString("player2","")
        shP2Result=sharedPreferences.getInt("p2Result",-1)

        shP3Score1=sharedPreferences.getInt("p3Score1",-1)
        shPlayer3=sharedPreferences.getString("player3","")
        shP3Result=sharedPreferences.getInt("p3Result",-1)

        shP4Score1=sharedPreferences.getInt("p4Score1",-1)
        shPlayer4=sharedPreferences.getString("player4","")
        shP4Result=sharedPreferences.getInt("p4Result",-1)





        //player1

        if(shP1Result != -1 ){
            binding.P1Netice.text=shP1Result.toString()
            binding.P1Score1.text= Editable.Factory.getInstance().newEditable(shP1Score1.toString())
            binding.Player1.text=Editable.Factory.getInstance().newEditable(shPlayer1)
        }
        else {
            binding.P1Netice.text=""
            binding.P1Score1.text=Editable.Factory.getInstance().newEditable("")
            binding.Player1.text=Editable.Factory.getInstance().newEditable("")
        }

        //Player 2

        if(shP2Result != -1 ){
            binding.P2Netice.text=shP2Result.toString()
            binding.P2Score1.text= Editable.Factory.getInstance().newEditable(shP2Score1.toString())
            binding.Player2.text=Editable.Factory.getInstance().newEditable(shPlayer2)
        }
        else {
            binding.P2Netice.text=""
            binding.P2Score1.text=Editable.Factory.getInstance().newEditable("")
            binding.Player2.text=Editable.Factory.getInstance().newEditable("")
        }

        //player3
        if(shP2Result != -1 ){
            binding.P3Netice.text=shP3Result.toString()
            binding.P3Score1.text= Editable.Factory.getInstance().newEditable(shP3Score1.toString())
            binding.Player3.text=Editable.Factory.getInstance().newEditable(shPlayer3)
        }
        else {
            binding.P3Netice.text=""
            binding.P3Score1.text=Editable.Factory.getInstance().newEditable("")
            binding.Player3.text=Editable.Factory.getInstance().newEditable("")
        }
        if(shP2Result != -1 ){
            binding.P4Netice.text=shP4Result.toString()
            binding.P4Score1.text= Editable.Factory.getInstance().newEditable(shP4Score1.toString())
            binding.Player4.text=Editable.Factory.getInstance().newEditable(shPlayer4)
        }
        else {
            binding.P4Netice.text=""
            binding.P4Score1.text=Editable.Factory.getInstance().newEditable("")
            binding.Player4.text=Editable.Factory.getInstance().newEditable("")
        }




    }
    fun button1(view: View){
        p1Score2=binding.P1Score2.text.toString().toIntOrNull()
        p1Score1=binding.P1Score1.text.toString().toIntOrNull()
        player1=binding.Player1.text?.toString()
        if(p1Score1!= null && p1Score2 !=null && player1 != null ){
            p1Result=p1Score1!! + p1Score2!!
            sharedPreferences.edit().putInt("p1Score1",p1Result!!).apply()
            sharedPreferences.edit().putString("player1",player1).apply()
            sharedPreferences.edit().putInt("p1Result",p1Result!!).apply()
            binding.P1Netice.text="$p1Result"
            binding.P1Score1.text=Editable.Factory.getInstance().newEditable("$p1Score2")
            binding.P1Score2.text=Editable.Factory.getInstance().newEditable("")




        }
        else{
            Toast.makeText(this@MainActivity, "Please check the values are correct", Toast.LENGTH_SHORT).show()
        }
    }
    fun button2(view: View){
        p2Score2=binding.P2Score2.text.toString().toIntOrNull()
        p2Score1=binding.P2Score1.text.toString().toIntOrNull()
        player2=binding.Player2.text?.toString()
        if(p2Score1!= null && p2Score2 !=null && player1 != null ){
            p2Result=p2Score1!! + p2Score2!!
            sharedPreferences.edit().putInt("p2Score1",p2Result!!).apply()
            sharedPreferences.edit().putString("player2",player2).apply()
            sharedPreferences.edit().putInt("p2Result",p2Result!!).apply()
            binding.P2Netice.text="$p2Result"
            binding.P2Score1.text=Editable.Factory.getInstance().newEditable("$p2Score2")
            binding.P2Score2.text=Editable.Factory.getInstance().newEditable("")
        }
        else{
            Toast.makeText(this@MainActivity, "Please check the values are correct", Toast.LENGTH_SHORT).show()
        }
    }
    fun button3(view: View){
        p3Score2=binding.P3Score2.text.toString().toIntOrNull()
        p3Score1=binding.P3Score1.text.toString().toIntOrNull()
        player3=binding.Player3.text?.toString()
        if(p3Score1!= null && p3Score2 !=null  && player3 != null ){
            p3Result=p3Score1!! + p3Score2!!
            sharedPreferences.edit().putInt("p3Score1",p3Result!!).apply()
            sharedPreferences.edit().putString("player3",player3).apply()
            sharedPreferences.edit().putInt("p3Result",p3Result!!).apply()
            binding.P3Netice.text="$p3Result"
            binding.P3Score1.text=Editable.Factory.getInstance().newEditable("$p3Score2")
            binding.P3Score2.text=Editable.Factory.getInstance().newEditable("")
        }
        else{
            Toast.makeText(this@MainActivity, "Please check the values are correct", Toast.LENGTH_SHORT).show()
        }
    }
    fun button4(view: View){
        p4Score2=binding.P4Score2.text.toString().toIntOrNull()
        p4Score1=binding.P4Score1.text.toString().toIntOrNull()
        player4=binding.Player4.text?.toString()
        if(p4Score1!= null && p4Score2 !=null && player4 != null ){
            p4Result=p4Score1!! + p4Score2!!
            sharedPreferences.edit().putInt("p4Score1",p4Result!!).apply()
            sharedPreferences.edit().putString("player4",player4).apply()
            sharedPreferences.edit().putInt("p4Result",p4Result!!).apply()
            binding.P4Netice.text="$p4Result"
            binding.P4Score1.text=Editable.Factory.getInstance().newEditable("$p4Score2")
            binding.P4Score2.text=Editable.Factory.getInstance().newEditable("")
        }
        else{
            Toast.makeText(this@MainActivity, "Please check the values are correct", Toast.LENGTH_SHORT).show()
        }
    }

    fun delete(view:View){
        shP1Result=sharedPreferences.getInt("p1Result",-1)
        shP1Score1=sharedPreferences.getInt("p1Score1",-1)
        shPlayer1=sharedPreferences.getString("player1","")

        if( shP1Result!=-1  ){
            //player1
            sharedPreferences.edit().remove("p1Result").apply()
            sharedPreferences.edit().remove("p1Score1").apply()
            sharedPreferences.edit().remove("player1").apply()

            binding.P1Score1.text=Editable.Factory.getInstance().newEditable("")
            binding.P1Score2.text=Editable.Factory.getInstance().newEditable("")
            binding.Player1.text=Editable.Factory.getInstance().newEditable("")
            binding.P1Netice.text=""

            //player2
            sharedPreferences.edit().remove("p2Result").apply()
            sharedPreferences.edit().remove("p2Score1").apply()
            sharedPreferences.edit().remove("player2").apply()

            binding.P2Score1.text=Editable.Factory.getInstance().newEditable("")
            binding.P2Score2.text=Editable.Factory.getInstance().newEditable("")
            binding.Player2.text=Editable.Factory.getInstance().newEditable("")
            binding.P2Netice.text=""

            //player3
            sharedPreferences.edit().remove("p3Result").apply()
            sharedPreferences.edit().remove("p3Score1").apply()
            sharedPreferences.edit().remove("player3").apply()

            binding.P3Score1.text=Editable.Factory.getInstance().newEditable("")
            binding.P3Score2.text=Editable.Factory.getInstance().newEditable("")
            binding.Player3.text=Editable.Factory.getInstance().newEditable("")
            binding.P3Netice.text=""

            //player4
            sharedPreferences.edit().remove("p4Result").apply()
            sharedPreferences.edit().remove("p4Score1").apply()
            sharedPreferences.edit().remove("player4").apply()

            binding.P4Score1.text=Editable.Factory.getInstance().newEditable("")
            binding.P4Score2.text=Editable.Factory.getInstance().newEditable("")
            binding.Player4.text=Editable.Factory.getInstance().newEditable("")
            binding.P4Netice.text=""


        }




    }



}