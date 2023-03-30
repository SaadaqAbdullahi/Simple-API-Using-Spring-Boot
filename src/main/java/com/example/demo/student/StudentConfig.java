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
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student saadaq = new Student(
                    "Saadaq",
                    "saadaq123@hotmail.ca",
                    LocalDate.of(1996, Month.JUNE, 18)
            );

            Student john = new Student(
                    "John",
                    "johnpop123@hotmail.ca",
                    LocalDate.of(1998, Month.SEPTEMBER, 30)
            );

            repository.saveAll(
                    List.of(saadaq, john)
            );
        };
    }
}
