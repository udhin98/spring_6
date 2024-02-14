package com.example.es6;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnrollments;
    @ManyToOne(fetch = FetchType.LAZY)
    private Students students;
    @ManyToOne(fetch = FetchType.LAZY)
    private Classes classes;
}
