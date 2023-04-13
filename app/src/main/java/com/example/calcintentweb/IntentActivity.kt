package com.example.calcintentweb

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class IntentActivity : AppCompatActivity() {
    lateinit var Buttonsms:Button
    lateinit var Buttoncall:Button
    lateinit var Buttoncamera:Button
    lateinit var Buttonshare:Button
    lateinit var Buttonstk:Button
    lateinit var Buttondial:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        Buttonsms=findViewById(R.id.Btn_Sms)
        Buttoncall=findViewById(R.id.Btn_Call)
        Buttoncamera=findViewById(R.id.Btn_Camera)
        Buttonshare=findViewById(R.id.Btn_Share)
        Buttonstk=findViewById(R.id.Btn_Stk)
        Buttondial=findViewById(R.id.Btn_Dial)

        Buttonsms.setOnClickListener {
         val uri=Uri.parse("smsto:0728800335")
         val intent=Intent(Intent(Intent.ACTION_SENDTO,uri))
         intent.putExtra("Hello", "Good morning")
            startActivity(intent)
        }
        Buttoncall.setOnClickListener {

        }
        Buttoncamera.setOnClickListener {
            val takepic=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult()
        }
        Buttonshare.setOnClickListener {

        }
        Buttonstk.setOnClickListener {

        }
        Buttondial.setOnClickListener {

        }

        }

    }
}