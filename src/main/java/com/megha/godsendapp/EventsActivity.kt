package com.megha.godsendapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_events.*


class EventsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)
   //   onBackPressed()
        home.setOnClickListener {
            var intenthome = Intent(this, MainActivity::class.java)
            startActivity(intenthome)
        }
        objective.setOnClickListener {
            var intentobjective = Intent(this, ObjectiveActivity::class.java)
            startActivity(intentobjective)
        }
        members.setOnClickListener {
            var intentmembers = Intent(this, MembersActivity::class.java)
            startActivity(intentmembers)
        }
        events.setOnClickListener {
            var intentevents = Intent(this, EventsActivity::class.java)
            startActivity(intentevents)
        }
        contact.setOnClickListener {
            var intentcontact=Intent(this,ContactActivity::class.java)
            startActivity(intentcontact)

        }

        var itemsList = arrayOf("FIRST - Painting Competition held on 12th January 2014",
                "GODSEND SOCIETY TRUST LAUNCHED ITS MAGAZINE 1st ISSUE", "Summer Champion 2014” to Spread the Message Help Poor Children"
                , "One Day Seminar on 02nd of November 2014", "First  Book Our Existence in Cosmos launched in MAY 2015"
                , "An event  “G.S. Champ-2015 was organised by Godsend Society Trust on 20th June ,2015 in order to promote a social message ‘Save a Girl Child’."
        ,"70th Independence Day Celebration-2016 ","Gender Discrimination Powered By “Splash-Water Park")


        var dataAdapter = ArrayAdapter(this, R.layout.custom_listview, itemsList)

        listview.adapter = dataAdapter

        listview.setOnItemClickListener { _, _, position, _ ->


var intent=Intent(this,DetailActivity::class.java)
                intent.putExtra("position",position)
                startActivity(intent)


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