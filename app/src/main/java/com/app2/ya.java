package com.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ya extends AppCompatActivity {
EditText firstName , lastName,reason;
Button push;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ya);
                push = findViewById(R.id.btn_Push);
                firstName=findViewById(R.id.txt1);
                lastName=findViewById(R.id.txt2);
                reason=findViewById(R.id.txt3);
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dto p = new dto();
                p.setFirstName(firstName.getText()+"");
                p.setLastName(lastName.getText()+"");
                p.setReason(reason.getText()+"");
                myRef.setValue(p);
                getIntent()
            }
        });

    }
}
