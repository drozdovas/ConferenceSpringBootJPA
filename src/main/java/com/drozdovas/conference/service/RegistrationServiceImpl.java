package com.drozdovas.conference.service;

import com.drozdovas.conference.model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationService registrationService;

    @Override
    @Transactional
    public Registration add(Registration registration){
        return registrationService.add(registration);
    }
}
