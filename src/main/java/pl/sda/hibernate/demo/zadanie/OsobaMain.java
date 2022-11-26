package pl.sda.hibernate.demo.zadanie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


public class OsobaMain {


//Klasa POJO => Plain Old Jaba Object
// Klasa która posiada
// - prywatne pola
// - gettery, settery
//- pusty konstruktor

    @Data
    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    public class Osoba {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String imie;                                                    // 'imie'                   VARCHAR(255)
        private String kierunekStudiow;                                       // 'kierunek_nauczania'     VARCHAR(255)
        private String indeks;
        private LocalDate dataUrodzenia;                                        // 'data_urodzenia'         DATE
    }

}
