package com.example.teacher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.teacher.teacher.TeacherClass;

@Repository
public interface RepositoryClass extends JpaRepository<TeacherClass,Integer>{
    
    @Query(value="select * from Teacher where name=:name",nativeQuery = true)
    public List<TeacherClass> findByname(String name);
    @Query(value="seect * from teacherClass where id=:id",nativeQuery = true)
    public List<TeacherClass> findByid(int id); 
}
