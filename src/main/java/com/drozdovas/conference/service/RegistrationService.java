package com.drozdovas.conference.service;

import com.drozdovas.conference.dto.RegistrationReportDto;
import com.drozdovas.conference.model.Registration;

import javax.transaction.Transactional;
import java.util.List;

public interface RegistrationService {
    @Transactional
    Registration add(Registration registration);

    List<Registration> getAll();

    List<RegistrationReportDto> getGeneralReport();
}
