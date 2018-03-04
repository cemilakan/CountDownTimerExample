package net.kisacasi.countdowntimerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var time:Long=10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun baslaBtn(view: View){
        object : CountDownTimer(time*1000, 1000) {
            override fun onFinish() {
            time=0
            }

            override fun onTick(p0: Long) {
            time--
            tv.text="Kalan Süre: $time"
            }

        }.start()
    }
}
