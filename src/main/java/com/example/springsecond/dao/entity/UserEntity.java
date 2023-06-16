package com.example.springsecond.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")


public class UserEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    private String username;

    private Integer age;

    @Column(name="birth_place")
    private String birthplace;
    @CreationTimestamp
    @Column(name="created_At")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name="updated_At")
    private LocalDateTime updatedAt;

}
