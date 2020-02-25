package com.maksim.durov.simplenotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.maksim.durov.simplenotes.adapters.NotesRecyclerAdapter;
import com.maksim.durov.simplenotes.models.Note;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static String TAG = "Main activity";

    //ui
    RecyclerView recyclerView;

    //variables
    List<Note> notes ;
    NotesRecyclerAdapter notesRecyclerAdapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        recyclerView = findViewById(R.id.mainActivityRecyclerView);
        notes = new ArrayList<>();
        notes.add(new Note(0,"note 1",new Date().getTime()));
        notes.add(new Note(0,"note 2",new Date().getTime()));
        notes.add(new Note(0,"note 3",new Date().getTime()));
        notes.add(new Note(0,"note 4",new Date().getTime()));
        notes.add(new Note(0,"note 4",new Date().getTime()));
        notes.add(new Note(0,"note 4",new Date().getTime()));
        notes.add(new Note(0,"note 4",new Date().getTime()));
        notes.add(new Note(0,"note 4",new Date().getTime()));
        notes.add(new Note(0,"note 4",new Date().getTime()));
        notes.add(new Note(0,"note 4",new Date().getTime()));
        notes.add(new Note(0,"long note 4 this is  loooooooong noooote",new Date().getTime()));
        notesRecyclerAdapter = new NotesRecyclerAdapter(notes);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(notesRecyclerAdapter);
    }
}
