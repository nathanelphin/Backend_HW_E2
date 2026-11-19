package edu.kh.istad.e2m2database.ELearning_DB;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String duration;

    @Column(nullable = false)
    private Boolean isDeleted;

    @Column(nullable = false)
    private Boolean isPublished;
    @Column(nullable = false)
    private String slug;
    @Column(nullable = false)
    private String thumbnail;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String youtube;

    @ManyToOne()
    private Course course;

}
