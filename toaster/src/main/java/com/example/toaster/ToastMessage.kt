package com.example.toaster

import android.content.Context
import android.widget.Toast

class ToastMessage {
    companion object{
        fun showToas(context: Context,message:String){
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
        }
    }
}