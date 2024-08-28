package com.booking.booking;

import java.time.LocalDate;
// add timestamp
import java.time.LocalTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table

public class Booking {
    @Id

    @SequenceGenerator(name = "booking_sequence", sequenceName = "booking_sequence", allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "booking_sequence")
    private Long id;
    private String name;
    private String phone;
    private LocalDate date;
    private LocalTime time;
    private String comment;
    private String status;

    public Booking() {
    }

    public Booking(Long id, String name, String phone, LocalDate date, LocalTime time, String comment, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.time = time;
        this.comment = comment;
        this.status = status;
    }

    public Booking(String name, String phone, LocalDate date, LocalTime time, String comment, String status) {
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.time = time;
        this.comment = comment;
        this.status = status;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return LocalDate return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return LocalTime return the time
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

    /**
     * @return String return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
