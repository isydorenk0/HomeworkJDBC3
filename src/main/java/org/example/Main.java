package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.setName("Jack");
        dog.setAge(12);
        dog.setTail(true);
        Animal cat = new Animal();
        cat.setName("Tom");
        cat.setAge(52);
        cat.setTail(true);

        SessionFactory factory  = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(dog);
        session.persist(cat);
        session.getTransaction().commit();

        Query<Animal> q = session.createQuery("from org.example.Animal", Animal.class);
        var selected =  q.list();
        selected.forEach(System.out::println);

        session.close();
    }
}