package com.example.contactpro;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;




public class notesactivity extends AppCompatActivity {
    FloatingActionButton addNoteBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notesactivity);

        addNoteBtn = findViewById(R.id.add_note_btn);



        addNoteBtn.setOnClickListener((v)-> startActivity(new Intent(notesactivity.this,NoteDetailsActivity.class)) );


    }

}