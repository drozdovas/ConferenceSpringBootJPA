package com.drozdovas.conference.service;

import com.drozdovas.conference.dto.RegistrationReportDto;
import com.drozdovas.conference.model.Course;
import com.drozdovas.conference.model.Registration;
import com.drozdovas.conference.repository.CourseRepository;
import com.drozdovas.conference.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration add(Registration registration){
        registration = registrationRepository.save(registration);

        Course course = new Course();
        course.setName("Intro");
        course.setDescription("Everyone must complete the introduction");
        course.setRegistration(registration);
        courseRepository.save(course);

        return registration;
    }

    @Override
    public List<Registration> getAll() {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReportDto> getAllReports() {
        return registrationRepository.findAllReports();
    }
}
