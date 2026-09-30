package net.backend.journalApp.service;

import net.backend.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;
    @ParameterizedTest
    @CsvSource({
            "bablu",
            "Bablu",
            "ram",
            "vipul",
            "Narasimha07"
    })
    public void findByUserName(String name){

        assertNotNull(userRepository.findByUserName(name));
    }
}
