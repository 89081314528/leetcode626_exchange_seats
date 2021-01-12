package ru.julia.leetcode626_exchange_seats.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seat {
    @Column(name = "id")
    @Id
    Integer id;
    @Column(name = "student")
    String student;

    public Integer getId() {
        return id;
    }

    public String getStudent() {
        return student;
    }

    public Seat(Integer id, String student) {
        this.id = id;
        this.student = student;
    }

    public Seat() {
    }
}
