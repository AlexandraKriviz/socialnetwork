package org.telran.social.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.telran.social.SocialNetworkApp;
import org.telran.social.model.NetworkUser;

import java.util.List;

@Primary
@Repository
public class NetworkUserJdbsRepository implements  NetworkUserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<NetworkUser> getAll() {
        String sql = "select * from network_users";
        List<NetworkUser> query = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(NetworkUser.class));
        return query;
    }

    @Override
    public NetworkUser getById(Long id) {
        return null;
    }

    @Override
    public NetworkUser deleteById(Long id) {
        return null;
    }

    @Override
    public List<NetworkUser> filterById(Long minAge, Long maxAge) {
        return List.of();
    }

    @Override
    public NetworkUser create(NetworkUser networkUser) {
        return null;
    }
}
