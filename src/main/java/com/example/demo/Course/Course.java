package com.example.demo.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data  //makes getters and setters by default
@Builder //
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Course {

    @Id
    private String id;
    private String name;
    private Instructor instructor;


}
