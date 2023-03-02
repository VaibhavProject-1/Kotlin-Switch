package `in`.mvlu.prac3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import `in`.mvlu.prac3.R.id.btnact
import `in`.mvlu.prac3.R.layout.activity_switched

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sec = findViewById<Button>(R.id.btnact)
        sec.setOnClickListener{
            var Intent4 = Intent(this, SwitchedActivity::class.java)
            startActivity(Intent4)
        }
    }
}