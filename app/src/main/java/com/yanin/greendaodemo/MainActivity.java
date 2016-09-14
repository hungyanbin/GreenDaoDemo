package com.yanin.greendaodemo;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yanin.greendaodemo.model.Student;

public class MainActivity extends AppCompatActivity {

    private StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupRecycleView();
        setupFAB();
    }

    private void setupFAB(){
        FloatingActionButton btnAdd = (FloatingActionButton)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentAdapter.addStudent(new Student(0, "name"));
            }
        });
    }

    private void setupRecycleView(){
        RecyclerView recycleStudent = (RecyclerView)findViewById(R.id.recycleStudent);

        studentAdapter = new StudentAdapter();
        recycleStudent.setAdapter(studentAdapter);
        recycleStudent.setLayoutManager(new LinearLayoutManager(this));
        recycleStudent.addItemDecoration(new DividerItemDecoration(this));
    }
}
