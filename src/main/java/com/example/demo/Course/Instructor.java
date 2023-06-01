package com.example.demo.Course;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data  //makes getters and setters by default
@Builder //
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Instructor {

    @Id

    private String id;
    private String name;
    private int ssid;
    private String email;
    private boolean isActive = true;
    @OneToMany(targetEntity = Course.class,cascade = CascadeType.ALL)
    @JoinColumn(name="ic_fk",referencedColumnName = "id" ) //join Table instructor/course foriegn key by ID
    private List<Course> Courses;




}
