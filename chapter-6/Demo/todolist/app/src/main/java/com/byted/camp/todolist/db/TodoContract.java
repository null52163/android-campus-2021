package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

public final class TodoContract {

    private  static final String SQL_CREATE_ENTRIES = "CREATE TABLE" +
            TodoNote.TABLE_NAME + "(" + TodoNote._ID + "INTEGER PRIMARY KEY,"
            + TodoNote.COLUME_NAME_TITLE + "TEXT," + TodoNote.COLUME_NAME_SUBTITLE
            + "TEXT)" ;

    private  static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS" + TodoNote.TABLE_NAME;

    private  static final String SQL_UPGRADE_ENTRIES(SQLiteDatabase db , int old Version , int new Version){};


    private TodoContract() {
    }

    public static class TodoNote implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUME_NAME_TITLE = "title";
        public static final String COLUME_NAME_SUBTITLE = "subtitle";
    }

}
