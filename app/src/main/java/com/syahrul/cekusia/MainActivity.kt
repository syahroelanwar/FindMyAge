package com.syahrul.cekusia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun  proses(view: View){

        // fire click button
        val userDOB:String=t_thn.text.toString()
        if (userDOB.toInt()==0){
            tv_tampil.text="Kesalahan Input"
            return
        }
        val year:Int= Calendar.getInstance().get(Calendar.YEAR)
        val myAge=year - userDOB.toInt()
        if (myAge >= 1) {
            tv_tampil.text = "Usia Anda adalah $myAge Tahun"
        }else if(userDOB.toInt() == year){
            Toast.makeText(this,"Tahun tidak boleh sama dengan tahun ini", Toast.LENGTH_SHORT).show()
            tv_tampil.text = "Usia Anda"
        }else{
            Toast.makeText(this,"Tahun tidak valid", Toast.LENGTH_SHORT).show()
            tv_tampil.text = "Usia Anda"
        }
    }
}
