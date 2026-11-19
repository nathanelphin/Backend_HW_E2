package edu.kh.istad.e2m2database.ELearning_DB;



import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "instructor_profiles")
public class Instructure {


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
    private String jobTitle;

    @Column(nullable = false)
    private String phoneNumber;
}
