package com.booking.booking;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Service; 

// bean
@Service
public class BookingService {
    
    public List<Booking> getBookings() {
        return List.of(
            new Booking(1L, "John Doe", "1234567890", LocalDate.now(), LocalTime.now(), "comment", "status"),
            new Booking(2L, "Jane Doe", "0987654321", LocalDate.now(), LocalTime.now(), "comment", "status")
        );
    }
}
