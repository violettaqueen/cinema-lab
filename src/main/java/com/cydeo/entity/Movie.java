package com.cydeo.entity;

import com.cydeo.enums.Status;
import com.cydeo.enums.Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movies")
@NoArgsConstructor
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;

    private Double duration;
    private String summary;

    public Movie(String name, Double price, Type type, Status status, LocalDate releaseDate, Double duration, String summary) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.status = status;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
    }
}
