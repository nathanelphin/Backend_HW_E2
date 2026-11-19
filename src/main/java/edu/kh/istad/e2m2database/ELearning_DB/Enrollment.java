package edu.kh.istad.e2m2database.ELearning_DB;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime enrolledAt;

    @Column(nullable = false)
    private LocalDateTime paymentAt;

    @Column(nullable = false)
    private String paymentMethod;

    @Column(nullable = false)
    private Boolean paymentStatus;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

}
