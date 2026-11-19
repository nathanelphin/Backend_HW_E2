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

    private String biography;

    @Column()
    private String facebookLink;

    @Column()
    private String githubLink;

    private String major;

    @Column()
    private String phoneNumber;

    private String university;
}