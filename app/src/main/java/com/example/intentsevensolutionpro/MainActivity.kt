package com.example.intentsevensolutionpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.intentsevensolutionpro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnCallActivity.setOnClickListener(this)
        binding.btnSendData.setOnClickListener(this)
        binding.btnSendDataObject.setOnClickListener(this)
        binding.btnSendParcelObject.setOnClickListener(this)
        binding.btnSendParcelArrayList.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnCallActivity -> {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
            R.id.btnSendData -> {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("id", "admin")
                intent.putExtra("pwd", "123456")
                startActivity(intent)
            }
            R.id.btnSendData -> {
                val intent = Intent(this, MainActivity2::class.java)
                val loginData = LoginData("admin", "123456")
                intent.putExtra("no", 3)
                intent.putExtra("loginData", loginData)
                startActivity(intent)
            }
            R.id.btnSendParcelObject -> {
                val intent = Intent(this, MainActivity2::class.java)
                val loginDataParcel = LoginDataParcel("admin", "123456")
                intent.putExtra("no", 4)
                intent.putExtra("loginDataParcel", loginDataParcel)
                startActivity(intent)
            }
            R.id.btnSendParcelArrayList -> {
                val intent = Intent(this, MainActivity2::class.java)
                val loginDataParcelList = arrayListOf<LoginDataParcel>()
                loginDataParcelList.add(LoginDataParcel("admin1", "123456-1"))
                loginDataParcelList.add(LoginDataParcel("admin2", "123456-2"))
                loginDataParcelList.add(LoginDataParcel("admin3", "123456-3"))
                loginDataParcelList.add(LoginDataParcel("admin4", "123456-4"))
                intent.putExtra("no", 5)
                intent.putExtra("loginDataParcelList", loginDataParcelList)
                startActivity(intent)
            }
        }
    }
}