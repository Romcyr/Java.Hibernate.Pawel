package pl.sda.hibernate.demo;

//Klasa POJO => Plain Old Jaba Object
// Klasa która posiada
// - prywatne pola
// - gettery, settery
//- pusty konstruktor

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Data
@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Student {
    @Id // PRIMARY KEY
    @GeneratedValue (strategy = GenerationType.IDENTITY)// Auto Increment
    private Long id;

    @Column(nullable = false)
    private String imie;                                                    // 'imie'                   VARCHAR(255)
    private LocalDate dataUrodzenia;                                        // 'data_urodzenia'         DATE
    private String kierunekNauczania;                                       // 'kierunek_nauczania'     VARCHAR(255)
    private String indeks; // index jest słowem zabronionymn przez mySQL    // 'indeks;                 VARCHAR(255)

   // private int wiek;                                                       // 'wiek'                   INT NOT NULL
   // private Integer;                                                        // 'wiek'                   INT
}
