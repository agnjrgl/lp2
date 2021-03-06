package com.example.alunos.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alunos on 20/09/17.
 */

public class CriaBanco extends SQLiteOpenHelper {

    public static final String NOME_BANCO = "banco.db";
    public static final String TABELA = "livros";
    public static final String ID = "_id";
    public static final String TITULO = "titulo";
    public static final String AUTOR = "autor";
    public static final String EDITORA = "editora";
    public static final int VERSAO = 1;

    public CriaBanco(Context context) {
        super (context, NOME_BANCO, null, VERSAO);

    }

    public void onCreate (SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE " + TABELA + " ( " +
                        ID + " integer primary key autoincrement, " +
                        TITULO + " text, " +
                        AUTOR + " text, " +
                        EDITORA + " text " + " ) ";
        sqLiteDatabase.execSQL(sql);

    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(sqLiteDatabase);

    }

}
