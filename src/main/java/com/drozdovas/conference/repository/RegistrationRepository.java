package com.drozdovas.conference.repository;

import com.drozdovas.conference.dto.RegistrationReportDto;
import com.drozdovas.conference.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    List<RegistrationReportDto> getGeneralReport();
}
