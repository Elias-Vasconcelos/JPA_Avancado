package com.atividade.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GenericDao<T> implements IGenereicDao<T> {
    @Override
    public T cadastrar(T entrety) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("Elias");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(entrety);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return entrety;    }
}
