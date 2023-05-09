package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mike = new Student(
                    "Mike",
                    "mike.pangas@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
            );
            Student chris = new Student(
                    "Chris",
                    "chris.pangas@gmail.com",
                    LocalDate.of(1964, Month.AUGUST, 13),
                    58
            );

            repository.saveAll(
                    List.of(mike, chris)
            );
        };
    }
}
