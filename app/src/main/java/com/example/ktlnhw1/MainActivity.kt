package com.example.ktlnhw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import android.widget.*
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val btn : Button = findViewById(R.id.clcltbtn)
val resTV : TextView = findViewById(R.id.restv)
val typespinner : Spinner = findViewById(R.id.typesp)
val hoursspinner: Spinner = findViewById(R.id.hoursp)
var typeflg:String="husky"
var hoursflg:Int=1
var typearr = arrayOf("husky","rott","german")
var hoursarr = arrayOf(1,2,3,4,5)
typespinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,typearr )
hoursspinner.adapter = ArrayAdapter<Int>(this,android.R.layout.simple_list_item_1,hoursarr )

btn.setOnClickListener{ view ->
    //code here
    when(typeflg){
    "husky"->{
        when(hoursflg){
            1->resTV.text= clclt(hoursflg,10).toString();
            2->resTV.text= clclt(hoursflg,10).toString();
            3->resTV.text= clclt(hoursflg,10).toString();
            4->resTV.text= clclt(hoursflg,10).toString();
            5->resTV.text= clclt(hoursflg,10).toString();

        }                }
     "rott"-> {
         when(hoursflg){
             1->resTV.text= clclt(hoursflg,20).toString();
             2->resTV.text= clclt(hoursflg,20).toString();
             3->resTV.text= clclt(hoursflg,20).toString();
             4->resTV.text= clclt(hoursflg,20).toString();
             5->resTV.text= clclt(hoursflg,20).toString();

     }             }
     "german"->{
         when(hoursflg){
             1->resTV.text= clclt(hoursflg,30).toString();
             2->resTV.text= clclt(hoursflg,30).toString();
             3->resTV.text= clclt(hoursflg,30).toString();
             4->resTV.text= clclt(hoursflg,30).toString();
             5->resTV.text= clclt(hoursflg,30).toString();

     }             }
    }

}

typespinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
    override fun onItemSelected(
        parent: AdapterView<*>?,
        view: View?,
        position: Int,
        id: Long
    ) {
        typeflg=typearr.get(0)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {


    }

}
hoursspinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
    override fun onItemSelected(
        parent: AdapterView<*>?,
        view: View?,
        position: Int,
        id: Long
    ) {
        hoursflg=hoursarr.get(0)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {


    }


}

    }
}
public fun clclt(a:Int,b:Int):Int{
    return a*b;
}