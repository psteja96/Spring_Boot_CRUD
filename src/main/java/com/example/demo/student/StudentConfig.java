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
          Student teja=new Student("Teja","tj@gm.com",
                     LocalDate.of(2001, Month.MAY,5));

          Student tj=new Student("tj","tj@gm.com",LocalDate.of(2000, Month.MAY,5));
             repository.saveAll(List.of(teja,tj));
         };



     }
}
