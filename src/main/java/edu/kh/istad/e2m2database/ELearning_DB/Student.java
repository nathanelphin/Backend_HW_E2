package edu.kh.istad.e2m2database.ELearning_DB;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_profiles")
public class Student {

    @Id
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false)
    private String biography;

    @Column(nullable = false)
    private String facebookLink;

    @Column(nullable = false)
    private String githubLink;
    @Column(nullable = false)
    private String major;

    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String university;
}