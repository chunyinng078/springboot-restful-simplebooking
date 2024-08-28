package com.booking.booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List; 

@RestController
public class BookingController {
    @GetMapping
    public List<Booking> hello() {
        return List.of(
                new Booking(1L, "John Doe", "1234567890", LocalDate.of(2000, 01, 05), LocalTime.now(), "First booking",
                        "Confirmed"));

    }
}
