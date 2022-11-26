package pl.sda.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        try {Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
           Transaction transaction =  session.beginTransaction();
//            //tworzymy studenta
//           Student student = new Student();
//           student.setImie("Roman");
//           student.setDataUrodzenia(LocalDate.of(1995,12,12));
//           student.setKierunekNauczania("Informatyka");
//           student.setIndeks("928372");

            Student student = Student.builder()
                    .imie("Roman")
                    .dataUrodzenia(LocalDate.of(1995,12,12))
                    .indeks("123123")
                    .kierunekNauczania("Programistyka Kryminalna")
                            .build();

           // zapisujemy studenta
           session.persist(student);

           //zatwierdzamy transakcje
            transaction.commit();

            //jeśli sukces (brak błędu), to nie wywoła siecatch
        }catch(Exception ioe){
            // jeśli złapiemy błą∂ to wywoała sie catch

        }

    }
}
