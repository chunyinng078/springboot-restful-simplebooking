package com.booking.booking;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// time date
import java.time.LocalDate;
import java.time.LocalTime;


@Configuration
public class BookingConfig {

    @Bean
    CommandLineRunner commandLineRunner(BookingRepository bookingRepository) {
        return args -> {


            // add preset local date and time
            LocalDate date = LocalDate.of(2021, 1, 5);
            LocalTime time = LocalTime.of(12, 0);

            Booking John = new  Booking(1L, "John Doe", "1234567890", date, time, "comment", "status",  LocalDate.of(2000, 1, 5));  
            Booking Jane = new  Booking(2L, "Jane Doe", "0987654321", date, time, "comment", "status",  LocalDate.of(2000, 1, 5));
        
            
            bookingRepository.saveAll(
                List.of(John, Jane)
            );
        };
        
    }
}
