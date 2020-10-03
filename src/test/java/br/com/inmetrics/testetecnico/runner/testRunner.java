package br.com.inmetrics.testetecnico.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = {"steps"},
//tags= {"@cadastro"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:relatorio/report.html"},
monochrome = true

		)
         
public class testRunner {
	
	@AfterClass
	public static void  ExtentReport() {
		Reporter.loadXMLConfig(new File("config/extension-config.xml"));
		
	    
	}
	
	

}
