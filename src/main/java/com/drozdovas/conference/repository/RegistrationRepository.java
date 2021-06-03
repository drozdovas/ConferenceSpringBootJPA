package com.drozdovas.conference.repository;

import com.drozdovas.conference.dto.RegistrationReportDto;
import com.drozdovas.conference.model.Registration;

import java.util.List;

public interface RegistrationRepository {
    Registration save(Registration registration);

    List<Registration> findAll();

    List<RegistrationReportDto> findAllReports();
}
