package com.example.teacher.teacher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Teacher")
@Data
public class TeacherClass {
    
    @Id
    public int id;
    @Column
    public String name;
    @Column
    public int Salary;
}
