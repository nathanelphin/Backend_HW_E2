package edu.kh.istad.e2m2database.ELearning_DB;



import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 4, nullable = false)
    private Integer countRating;

    @Column(nullable = false, length = 6, unique = true)
    private LocalDateTime createdAt;

    private String description;

    @Column(nullable = false, length = 10)
    private Float discountPercent;

    @Column(nullable = false)
    private Boolean isDeleted;

    @Column(nullable = false)
    private Boolean isPublished;

    @Column(nullable = false)
    private String keyword;

    @Column(nullable = false)
    private String level;

    @Column(nullable = false,precision = 38, scale = 2)
    private BigDecimal price;

    @Column(nullable = false)
    private String slug;

    @Column(nullable = false)
    private Float starRating;

    @Column(nullable = false)
    private String thumbnail;

    @Column(nullable = false)
    private String title;

    @Column(length = 24, nullable = false)
    private Float totalHours;

    @Column(unique = true, nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne()
    private Category category;

    @ManyToOne()
    private Instructure instructor;

}
