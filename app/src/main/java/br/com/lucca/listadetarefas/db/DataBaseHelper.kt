package br.com.lucca.listadetarefas.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "MeuBancoDeDados.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_NAME = "MinhaTabela"
    }


    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, idade INTEGER, time TEXT, email TEXT)"
        db?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Código para atualizar o banco de dados, se necessário
    }

    fun addData(nome: String, idade: Int, time: String, email: String) {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put("nome", nome)
        values.put("idade", idade)
        values.put("time", time)
        values.put("email", email)

        db.insert(TABLE_NAME, null, values)
        db.close()
    }

    // Outros métodos, como recuperar dados, etc.
}
