package com.yanin.greendaodemo.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yanin.greendaodemo.R;
import com.yanin.greendaodemo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder>{

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        notifyItemInserted(students.size() - 1);
    }

    public void setStudents(List<Student> students){
        this.students.clear();
        this.students.addAll(students);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);

        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Student student = students.get(position);

        holder.textName.setText(student.getName());
        holder.textId.setText("" + student.getId());
        holder.textAge.setText(student.getAge() + "歲");

        if(student.getTeacher() != null) {
            holder.textTeacher.setText(student.getTeacher().getName());
        }
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textName;
        private TextView textId;
        private TextView textAge;
        private TextView textTeacher;

        public ViewHolder(View itemView) {
            super(itemView);
            textName = (TextView) itemView.findViewById(R.id.textName);
            textId = (TextView) itemView.findViewById(R.id.textId);
            textAge = (TextView) itemView.findViewById(R.id.textAge);
            textTeacher = (TextView) itemView.findViewById(R.id.textTeacher);
        }
    }
}
