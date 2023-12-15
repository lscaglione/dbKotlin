package br.com.lucca.listadetarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNome: EditText;
    private lateinit var editTextIdade: EditText;
    private lateinit var editTextTime: EditText;
    private lateinit var editTextEmail: EditText;
    private lateinit var botaoConfirma: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNome = findViewById(R.id.nome)
        editTextIdade = findViewById(R.id.idade)
        editTextTime = findViewById(R.id.time)
        editTextEmail = findViewById(R.id.email)
        botaoConfirma = findViewById(R.id.botaoConfirma)

        botaoConfirma.setOnClickListener {
            salvarDados()
        }


    }

    private fun salvarDados (){

        val nome = editTextNome.text.toString()
        val idade = editTextIdade.text.toString().toIntOrNull()?:0
        val time = editTextTime.text.toString()
        val email = editTextEmail.text.toString()
    }
}