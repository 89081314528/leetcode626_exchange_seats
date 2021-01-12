package ru.julia.leetcode626_exchange_seats.dto;

import javax.persistence.Column;

public class ExchangeSeat {
    Integer id;
    String student;

    public Integer getId() {
        return id;
    }

    public String getStudent() {
        return student;
    }

    public ExchangeSeat(Integer id, String student) {
        this.id = id;
        this.student = student;
    }

}
