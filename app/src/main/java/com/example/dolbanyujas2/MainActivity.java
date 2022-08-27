package com.example.dolbanyujas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dolbanyujas2.adapter.CategoryAdapter;
import com.example.dolbanyujas2.model.Category;
import com.example.dolbanyujas2.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    CategoryAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "запчасти"));
        categoryList.add(new Category(2, "автомобили"));
        categoryList.add(new Category(3, "новости"));
        categoryList.add(new Category(4, "сувениры"));

        setCategoryRecycler(categoryList);

        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "ic_dmjbemiiiqs_png.xml", "Радиатор охлаждения", "Nissan Primera II (P11), 1.6", "3 500 ₽", "#424345"));
        courseList.add(new Course(2, "ic_d8felivcxhs_png.xml", "Крышка багажника", "Mitsubishi ASX, 2012г.", "18 000 ₽", "#424345"));
        courseList.add(new Course(3, "ic_pivi9byafq0_png.xml", "Бампер задний", "Ford Focus 3, 2013г.", "23 000 ₽", "#424345"));
        courseList.add(new Course(4, "ic_ju4qm4jec5o_png.xml", "КПП", "Toyota Camry, 2008г.(2.4)", "65 000 ₽", "#424345"));
        courseList.add(new Course(5, "ic_hwovjea1ke8_png.xml", "Зеркало заднего вида левое", "Fiat Albea", "2 500 ₽", "#424345"));
        courseList.add(new Course(6, "ic_bcmdsbqyj1e_png.xml", "Щиток приборов", "Reno Logan, 2009г.", "3 000 ₽", "#424345"));

        setCourseRecycler(courseList);
        
    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler = findViewById(R.id.courseRecycler);

        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CategoryAdapter(this, courseList);

        categoryRecycler.setAdapter(categoryAdapter);
    }



    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);

        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);

        categoryRecycler.setAdapter(categoryAdapter);

    }

}
