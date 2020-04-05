package it.bitrock.training.cucumber.feature.authentication;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith ( SpringJUnit4ClassRunner.class )
@SpringBootTest ( classes = AuthApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT )
public abstract class AbstractSpringIntegrationTest {

}