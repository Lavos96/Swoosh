package com.kowalczyk.michal.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            //Intent to sa jakby obiekty do wywolania jakiejs innej aktywnosci
            //np intent moze uruchomic aparat albo wlaczacy email albo tak jak tu przejsc do innego widoku apki
            //Intenty sa explicit i implicit
            //implicit to takie w ktorych nie mowimy jaki ma byc uzyty program np jak klikamy link do strony i sie pojawia okienko jaka przegladarke wybrac
            //implicit to tak jakby wysylasz do androida zadanie co bedziesz chcial zeby sie zadzialo a android wybiera co moze spelnic twoje oczekiwania
            //explicit to takie gdzie mowimy co konkretnie ma sie odpalic jaka konkretnie klasa
            //explicit kiedy my wiemy dokladnie co ma obsluzyc zadanie
            //Context to taka jakby paczka informacji i moze ona dotyczyc tego konkretnego widoku albo calej apki
            //analogia cpontextu wchodzisz do pokoju w ktorym kloci sie 2 ludzi i masz powiedziec ktory ma racje
            //kontekst tylko tego widoku to dostajesz informacje kim sa ci dwaj ludzie i o co sie kloca
            //kontekst calej apki to dostajesz info o wszystkich ludziach w tym budynku i otym o czym gadaja lub sie kloca
            val leagueIntent=Intent(this,LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
