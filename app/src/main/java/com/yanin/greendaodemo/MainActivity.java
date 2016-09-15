package com.yanin.greendaodemo;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yanin.greendaodemo.factory.NameFactory;
import com.yanin.greendaodemo.factory.ServiceFactory;
import com.yanin.greendaodemo.model.Student;
import com.yanin.greendaodemo.model.StudentDao;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StudentAdapter studentAdapter;
    private StudentDao studentDao;
    private NameFactory nameFactory = new NameFactory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBService dbService = ServiceFactory.getDbService();
        studentDao = dbService.getStudentDao();
        setupRecycleView();
        setupFAB();
    }

    private void setupFAB(){
        FloatingActionButton btnAdd = (FloatingActionButton)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddStudent();
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

    private void onAddStudent(){
        Student student = new Student(null, nameFactory.generateName());
        long id = studentDao.insert(student);

        student = studentDao.load(id);
        studentAdapter.addStudent(student);
    }

    @Override
    protected void onResume() {
        super.onResume();

        List<Student> students = studentDao.loadAll();
        studentAdapter.setStudents(students);
    }
}
