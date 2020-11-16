package it.bitrock.training.cucumber.feature.authentication;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith ( Cucumber.class )
@CucumberOptions ( plugin = { "pretty", "json:target/cucumber-report/cucumber.json" } )
public class RunCucumberTest {

}