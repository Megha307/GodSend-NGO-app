package com.megha.godsendapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class ObjectiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_objective)
      //  onBackPressed()
        home.setOnClickListener {
            var intenthome= Intent(this,MainActivity::class.java)
            startActivity(intenthome)
        }
        objective.setOnClickListener {
            var intentobjective= Intent(this,ObjectiveActivity::class.java)
            startActivity(intentobjective)
        }
        members.setOnClickListener {
            var intentmembers= Intent(this,MembersActivity::class.java)
            startActivity(intentmembers)
        }
        events.setOnClickListener {
            var intentevents= Intent(this,EventsActivity::class.java)
            startActivity(intentevents)
        }
        contact.setOnClickListener {
            var intentcontact=Intent(this,ContactActivity::class.java)
            startActivity(intentcontact)

        }
    }
//    override fun onBackPressed() {
//        var backButtonCount=0
//        if (backButtonCount >= 1) {
//            val intent = Intent(Intent.ACTION_MAIN)
//            intent.addCategory(Intent.CATEGORY_HOME)
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//            startActivity(intent)
//        } else {
//            Toast.makeText(this, "Press the back button once again to exit the application.", Toast.LENGTH_SHORT).show()
//            backButtonCount++
//        }
//    }
}
