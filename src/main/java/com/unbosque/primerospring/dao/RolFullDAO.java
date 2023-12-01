package com.unbosque.primerospring.dao;

import com.unbosque.primerospring.models.RolComplete;
import com.unbosque.primerospring.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class RolFullDAO {


    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public List<RolComplete> getRol() {
        String query = "FROM RolComplete";
        return entityManager.createQuery(query).getResultList();

    }
}
