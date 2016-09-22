package com.yanin.greendaodemo.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yanin.greendaodemo.R;
import com.yanin.greendaodemo.model.Student;
import com.yanin.greendaodemo.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherAdapter extends RecyclerView.Adapter<TeacherAdapter.ViewHolder>{

    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
        notifyItemInserted(teachers.size() - 1);
    }

    public void setTeachers(List<Teacher> teachers){
        this.teachers.clear();
        this.teachers.addAll(teachers);
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_teacher, parent, false);

        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Teacher teacher = teachers.get(position);

        holder.textName.setText(teacher.getName());
        holder.textId.setText("" + teacher.getId());
    }

    @Override
    public int getItemCount() {
        return teachers.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textName;
        private TextView textId;

        public ViewHolder(View itemView) {
            super(itemView);
            textName = (TextView) itemView.findViewById(R.id.textName);
            textId = (TextView) itemView.findViewById(R.id.textId);
        }
    }
}
