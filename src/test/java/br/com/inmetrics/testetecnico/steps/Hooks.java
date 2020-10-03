package br.com.inmetrics.testetecnico.steps;

import java.io.File;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import br.com.inmetrics.testetecnico.pageManager.driverObject;
import br.com.inmetrics.testetecnico.pageManager.ContextodeTeste;
import br.com.inmetrics.testetecnico.pageManager.Generator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

	public driverObject driver;
	public ContextodeTeste  contexto ;
	
	public Hooks(ContextodeTeste contexto) {
		this.contexto = contexto;
	}

	

	@After(order =0)
	public void finaliza() {

		contexto.getWebDriverManager().fechandoDriver();
	}

	@After(order = 1)
	public void finalizarreport(Scenario scenario) throws Exception, MalformedURLException {
		
		File screenshot = ((TakesScreenshot) contexto.getWebDriverManager().inicializaDriver()).getScreenshotAs(OutputType.FILE);
		String caminho = System.getProperty("user.dir") + "/cucumber-reports/screenshots/" + scenario.getName() + "-"
				+ Generator.dataHoraParaArquivo() + ".png";
		try {
			FileUtils.copyFile(screenshot, new File(caminho));
			Reporter.addScreenCaptureFromPath(caminho.toString());
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
	}
}
