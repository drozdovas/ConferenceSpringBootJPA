package com.drozdovas.conference.repository;

import com.drozdovas.conference.dto.RegistrationReportDto;
import com.drozdovas.conference.model.Registration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration save(Registration registration){
        entityManager.persist(registration);
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        String jpql = "select r from com.drozdovas.conference.model.Registration r";
        return entityManager.createQuery(jpql).getResultList();
    }

    @Override
    public List<RegistrationReportDto> findAllReports() {
        String jpql = "select new com.drozdovas.conference.dto.RegistrationReportDto (r.name, c.name, c.description) " +
                "from com.drozdovas.conference.model.Registration r, com.drozdovas.conference.model.Course c " +
                "where r.id = c.registration.id";
        return entityManager.createQuery(jpql).getResultList();
    }
}
