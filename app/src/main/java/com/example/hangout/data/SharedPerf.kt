package com.example.hangout.data

import android.content.Context
import android.content.SharedPreferences

class SharedPerf {
    lateinit var sharedPre: SharedPreferences

    fun addData(key: String, value: String){
        var editor: SharedPreferences.Editor = sharedPre.edit()
        editor.putString(key,value)
        editor.commit()
    }


    fun addData(v1: String, v2: Boolean){
        var editor: SharedPreferences.Editor = sharedPre.edit()
        editor.putBoolean(v1,v2)
        editor.commit()
    }


    fun clearData(){
        var editor: SharedPreferences.Editor = sharedPre.edit()
        editor.clear()
        editor.commit()
    }

    fun removeData(key: String){
        var editor: SharedPreferences.Editor = sharedPre.edit()
        editor.remove(key)
        editor.commit()
    }

    fun commit(){
        var editor: SharedPreferences.Editor = sharedPre.edit()
        editor.commit()
    }
}