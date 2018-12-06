package com.kowalczyk.michal.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    //rozpakowywanie zmiennych przeslanych z leagueActivity

    var league=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league=intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
