package com.drozdovas.conference.service;

import com.drozdovas.conference.model.Course;
import com.drozdovas.conference.model.Registration;
import com.drozdovas.conference.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration add(Registration registration){
        registration = registrationService.add(registration);

        Course course = new Course();
        course.setName("Intro");
        course.setDescription("Everyone must complete the introduction");
        course.setRegistration(registration);
        courseRepository.save(course);

        return registration;
    }
}
