package com.example.teacher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teacher.repository.RepositoryClass;
import com.example.teacher.teacher.TeacherClass;


@Service
public class ServiceClass {
    
    @Autowired
    public RepositoryClass r;

    public  List<TeacherClass> getform(){
         return r.findAll();
    }

    public TeacherClass saveform(TeacherClass m){
        return r.save(m);
    }

   public List<TeacherClass> findByname(String name){
         List<TeacherClass> demolist=r.findByname(name);
           return demolist;
     }

    public Optional<TeacherClass> findByid(int id){
        Optional<TeacherClass> demolist= r.findById(id);
        return demolist;
    } 
    public void updateuser(TeacherClass student) {
		r.findById(student.getId()).ifPresent(a -> {
			a.setName(student.getName());
			a.setSalary(student.getSalary());
			r.save(a);
		});
	}

}
