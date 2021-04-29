package pt.ipg.mostramensagemactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    companion object{
        val INFO_NOME = "Nome"
        val INFO_MAIL = "Mail"
        val INFO_TELEMOVEL = "Telemovel"
        val INFO_IDADE = "Idade"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun enviaMessage(view: View){
        val TextInputEditNome = findViewById<EditText>(R.id.TextInputEditName)
        val messageNome = TextInputEditNome.text.toString()

        val TextInputEditMail = findViewById<EditText>(R.id.TextInputEditMail)
        val messageMail = TextInputEditMail.text.toString()

        val TextInputEditTelemovel = findViewById<EditText>(R.id.TextInputEditTelemovel)
        val messageTelemovel = TextInputEditTelemovel.text.toString()

        val TextInputEditIdade = findViewById<EditText>(R.id.TextInputEditIdade)
        val messageIdade = TextInputEditIdade.text.toString()

        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(INFO_NOME, messageNome)
            putExtra(INFO_MAIL, messageMail)
            putExtra(INFO_TELEMOVEL,messageTelemovel)
            putExtra(INFO_IDADE,messageIdade)
        }
        startActivity(intent)
    }
}