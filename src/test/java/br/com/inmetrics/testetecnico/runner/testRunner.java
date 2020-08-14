package br.com.inmetrics.testetecnico.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = {"steps"},
//tags= {"@cadastro"}
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:relatorio/report.html"},
monochrome = true

		)
         
public class testRunner {
	
	

}
