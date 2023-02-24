package com.example.teacher.controller;

import com.example.teacher.service.ServiceClass;
import com.example.teacher.teacher.TeacherClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.net.URISyntaxException;
import java.util.Optional;
import java.net.URI;

@RestController
public class ControllerClass {
    @Autowired
    ServiceClass serviceClass;

    @GetMapping("/get")
    public ResponseEntity<List<TeacherClass>> getdetails(){
        List<TeacherClass> demolist=serviceClass.getform();
        return ResponseEntity.ok(demolist);
        
    }

   
    @GetMapping("/getid")
    ResponseEntity<Optional<TeacherClass>> getid(int id){
        Optional<TeacherClass> demolist=serviceClass.findByid(id);
        return ResponseEntity.ok(demolist);
    }
    
    @GetMapping("/getname")
    ResponseEntity<List<TeacherClass>> getname(String name){
        List<TeacherClass> username=serviceClass.findByname(name);
        return ResponseEntity.ok(username);
    }

  
	@PostMapping("/set")
	public ResponseEntity<TeacherClass> setdetails(TeacherClass m) throws URISyntaxException {
		TeacherClass newuser = (TeacherClass) serviceClass.saveform(m);
		return ResponseEntity.created(new URI("/set" + newuser.getId())).body(newuser);
	}
}
