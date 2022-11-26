package pl.sda.hibernate.demo;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.List;

public class MainSelect {
    public static void main(String[] args) {

        try {Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
            TypedQuery<Student> zapytanie = session.createQuery("FROM Student", Student.class);
            List<Student> listaWszystkichStudentow = zapytanie.getResultList();


            for (Student student : listaWszystkichStudentow) {
                System.out.println(student);
            }
        }catch(Exception ioe){
            // jeśli złapiemy błąd to wywoała sie catch
            System.err.println("Błąd bazy: " + ioe);

        }

    }
}
