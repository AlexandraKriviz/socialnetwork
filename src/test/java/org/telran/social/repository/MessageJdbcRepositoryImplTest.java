package org.telran.social.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telran.social.model.Message;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageJdbcRepositoryTest {

    @Autowired
    private  MessageRepository messageRepository;

    @Test
    void testGetByUserId(){
        List<Message> messages = messageRepository.getAllByUserId(1L);
    }

    @Test
    void testGetById(){
        Message byId = messageRepository.getById(1L);
    }

}