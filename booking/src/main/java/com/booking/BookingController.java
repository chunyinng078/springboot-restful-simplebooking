package com.booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.booking.Booking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List; 

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {
    @GetMapping
    public List<Booking> getBookings() {
        return List.of(
                new Booking(1L, "John Doe", "1234567890", LocalDate.of(2000, 01, 05), LocalTime.now(), "First booking",
                        "Confirmed"));

    }
}
