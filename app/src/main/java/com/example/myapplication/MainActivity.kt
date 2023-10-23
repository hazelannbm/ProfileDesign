import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)

        button1.setOnClickListener {
            openUrlInBrowser("https://github.com/hazelannbm")
        }

        button2.setOnClickListener {
            openUrlInBrowser("https://www.behance.net/hazelmones/projects")
        }

        button3.setOnClickListener {
            openUrlInBrowser("https://www.linkedin.com/in/hazelmones/")
        }

        button4.setOnClickListener {
            openUrlInBrowser("https://www.facebook.com/hazelannbm")
        }

        button5.setOnClickListener {
            openUrlInBrowser("https://www.instagram.com/harflms/")
        }
    }

    private fun openUrlInBrowser(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}
