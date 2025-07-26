package org.telran.social.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.telran.social.model.NetworkUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryNetworkUserRepository implements NetworkUserRepository {

    private Map<Long, NetworkUser> storage = new HashMap<>();

    @PostConstruct
    public void init() {
        storage.put(1L, NetworkUser.builder()
                .id(1L)
                .name("Alex")
                .surname("Alexeev")
                .login("alex345")
                .password("alexalex")
                .build());

        storage.put(2L, NetworkUser.builder()
                .id(2L)
                .name("Max")
                .surname("Maxov")
                .login("max345")
                .password("maxmax")
                .build());
    }

    @Override
    public List<NetworkUser> getAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public NetworkUser getById(Long id) {
        return storage.get(id);
    }

    @Override
    public NetworkUser deleteById(Long id) {
        return storage.remove(id);
    }

    @Override
    public List<NetworkUser> filterById(Long minAge, Long maxAge) {
        return null;
    }

    @Override
    public NetworkUser create(NetworkUser networkUser) {
        return storage.put(networkUser.getId(), networkUser);
    }
}
