package ru.edutech.demo.tdd;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
@ExtendWith({SpringExtension.class, RestDocumentationExtension.class})
public class BaseTest {

    @Autowired
    private AuditController auditController;

    @BeforeEach
    public void setup(final TestInfo info, final RestDocumentationContextProvider restDocumentation) {
        RestAssuredMockMvc.mockMvc(MockMvcBuilders
                .standaloneSetup(auditController)
                .apply(MockMvcRestDocumentation.documentationConfiguration(restDocumentation))
                .alwaysDo(MockMvcRestDocumentation.document(getClass().getSimpleName() + "_" + info.getDisplayName()))
                .build());
    }

}
