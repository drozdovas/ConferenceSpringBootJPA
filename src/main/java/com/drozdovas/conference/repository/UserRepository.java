package com.drozdovas.conference.repository;

import com.drozdovas.conference.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User save(User user);
}
