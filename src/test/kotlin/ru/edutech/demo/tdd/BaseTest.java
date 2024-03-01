package ru.edutech.demo.tdd;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BaseTest {

    @Autowired
    AuditService auditService;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new AuditController(auditService));
    }
}