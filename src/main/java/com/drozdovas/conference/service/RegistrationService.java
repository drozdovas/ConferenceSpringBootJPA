package com.drozdovas.conference.service;

import com.drozdovas.conference.model.Registration;

import javax.transaction.Transactional;

public interface RegistrationService {
    @Transactional
    Registration add(Registration registration);
}
