package edu.kh.istad.e2m2database.ELearning_DB;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String icon;

    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted;

    @Column(length = 50, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Course> courses;
}
