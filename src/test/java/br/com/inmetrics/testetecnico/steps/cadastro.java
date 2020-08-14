package br.com.inmetrics.testetecnico.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.inmetrics.testetecnico.pageManager.driverObject;
import br.com.inmetrics.testetecnico.pageObject.cadastroPageObject;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

   public class cadastro {
	
	
	public WebDriver driver;
	public cadastroPageObject cadastro;

	//public cadastro(WebDriver driver) {
        //this.driver = driver;
     //cadastro = PageFactory.initElements(driver, cadastroPageObject.class);
       //}
	
	@Before

	public void Driver(WebDriver driver)
	
	{

	 /* iniciando o driver */
		driver = driverObject.InicializaDriver();
		cadastro= PageFactory.initElements(driver, cadastroPageObject.class);
		// wait = new WebDriverWait(driver, 50);
}
		 
	
	@Dado("^quando eu eu estiver no site 'http://www\\.inmrobo\\.tk/accounts/login/'$")
	public void quando_eu_eu_estiver_no_site_http_www_inmrobo_tk_accounts_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Quando("^eu preencher o cadastro$")
	//public void eu_preencher_o_cadastro() throws Throwable {




	@Entao("^serei cadastrado com sucesso$")
	public void serei_cadastrado_com_sucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
