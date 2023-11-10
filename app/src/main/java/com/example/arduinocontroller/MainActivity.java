package com.example.arduinocontroller;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private ArduinoController arduinoController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        arduinoController = new ArduinoController();
        // Etsi nappi id:n perusteella
        Button saveButton = findViewById(R.id.save);

        // Aseta OnClickListener napille
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText mac = findViewById(R.id.mac);
                String macAdress = mac.getText().toString();
                arduinoController.setMacAddress(macAdress);
                startChat();
            }
        });



    }

    protected void startChat(){
        setContentView(R.layout.activity_chat);
        Button sendButton = findViewById(R.id.send);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText msg = findViewById(R.id.msg);
                String message = msg.getText().toString();
                arduinoController.addMessage(message);
                //arduinoController.printMessages();
                Log.e("MainActivity", "message");
            }
        });
    }

}