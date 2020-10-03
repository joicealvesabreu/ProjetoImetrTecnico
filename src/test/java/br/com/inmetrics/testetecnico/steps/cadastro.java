package br.com.inmetrics.testetecnico.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.inmetrics.testetecnico.pageManager.ContextodeTeste;
import br.com.inmetrics.testetecnico.pageManager.driverObject;
import br.com.inmetrics.testetecnico.pageObject.cadastroPageObject;

import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

   public class cadastro {
	
	
	public WebDriver driver;
	public ContextodeTeste contexto;
	public cadastroPageObject cadastro;

	public cadastro (ContextodeTeste contexto) {
		this.contexto = contexto;
		cadastro = contexto.getPageObjectManager().getcadastroPageObject();

	}
		 
	
	@Dado("^eu estiver no site$")
	public void eu_estiver_no_site() throws Throwable {
	 
		driver.get("http://www.inmrobo.tk/accounts/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Quando("^eu preencher o cadastro$")
	public void eu_preencher_o_cadastro() throws Throwable {
		cadastro.btn_cadastrar().click();

	}

	@Entao("^serei cadastrado com sucesso$")
	public void serei_cadastrado_com_sucesso() throws Throwable {
	    
	    
	}



}
