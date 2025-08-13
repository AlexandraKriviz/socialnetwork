package org.telran.social.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.telran.social.model.Message;

import java.util.List;

@Repository

public class MessageJdbcRepositoryImpl implements MessageRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Message> getAllByUserId(Long userId) {
        String sql = "SELECT * FROM messages WHERE sender_id = ?";
        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Message.class),
                userId);
    }

    @Override
    public Message getById(Long messageId) {
        String sql = "SELECT * FROM messages WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Message.class),
                messageId);
    }

    @Override
    public Message create(Message message) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
