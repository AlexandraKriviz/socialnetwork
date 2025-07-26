package org.telran.social.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.telran.social.model.NetworkUser;

import java.util.List;

public interface NetworkUserService {

    List<NetworkUser> getAll();

    NetworkUser getById(@PathVariable(name = "id") Long id);

    NetworkUser deleteById(@PathVariable(name = "id") Long id);

    List<NetworkUser> filterById(Long minAge, Long maxAge);

    NetworkUser create(NetworkUser networkUser);
}
