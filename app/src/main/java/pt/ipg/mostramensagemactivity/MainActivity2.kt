package pt.ipg.mostramensagemactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val messageNome = intent.getStringExtra(MainActivity.INFO_NOME)
        val textViewNome = findViewById<TextView>(R.id.TextViewNome)
        textViewNome.text = messageNome

        val messageMail = intent.getStringExtra(MainActivity.INFO_MAIL)
        val textViewMail = findViewById<TextView>(R.id.TextViewMail)
        textViewMail.text = messageMail

        val messageTelemovel = intent.getStringExtra(MainActivity.INFO_TELEMOVEL)
        val textViewTelemovel = findViewById<TextView>(R.id.TextViewTelemovel)
        textViewTelemovel.text = messageTelemovel

        val messageIdade = intent.getStringExtra(MainActivity.INFO_IDADE)
        val textViewIdade = findViewById<TextView>(R.id.TextViewIdade)
        textViewIdade.text = messageIdade


    }
}