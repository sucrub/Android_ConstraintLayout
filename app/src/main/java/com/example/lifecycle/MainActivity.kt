package com.example.lifecycle

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.no_constraint)

        val registerButton: Button = findViewById(R.id.registerButton)
        registerButton.setOnClickListener{
            val editTextFirstName: EditText = findViewById(R.id.editTextFirstName)
            val editTextLastName: EditText = findViewById(R.id.editTextLastName)
            val editTextBirthday: EditText = findViewById(R.id.editTextBirthday)
            val editTextAddress: EditText = findViewById(R.id.editTextAddress)
            val editTextEmail: EditText = findViewById(R.id.editTextEmail)
            val termsCheckbox: CheckBox = findViewById(R.id.termsCheckbox)

            val firstName = editTextFirstName.text.toString()
            val lastName = editTextLastName.text.toString()
            val birthday = editTextBirthday.text.toString()
            val address = editTextAddress.text.toString()
            val email = editTextEmail.text.toString()

            if (firstName.isEmpty() || lastName.isEmpty() || birthday.isEmpty() || address.isEmpty() || email.isEmpty() || !termsCheckbox.isChecked) {
                Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
            }
        }

    }


}
