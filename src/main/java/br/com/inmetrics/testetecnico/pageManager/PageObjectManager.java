package br.com.inmetrics.testetecnico.pageManager;

import org.openqa.selenium.WebDriver;


import br.com.inmetrics.testetecnico.pageObject.cadastroPageObject;

public class PageObjectManager {

	  private WebDriver driver;
	  private cadastroPageObject cadastro;
	
	//  private TelaPrincipalPage telaprincipal;
	//  private TelainicioPage login;

	    public PageObjectManager(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public  cadastroPageObject getcadastroPageObject() {

	 

	        return ( cadastro == null) ? cadastro = new cadastroPageObject(driver) : cadastro;

	 

	    }
	 /*   public TelainicioPage getTeladeinicioPage() {

	   	 

	        return ( login == null) ? login = new TelainicioPage(driver) : login;

	 

	    }
	 

	    public TelaPrincipalPage getBuscaProdutoPage() {

	 

	        return ( telaprincipal== null) ? telaprincipal = new TelaPrincipalPage(driver) : telaprincipal;


	    }

	 

	    public PesquisadeProdutoPage getMassadedadosPage() {

	 

	        return (massadedados == null) ? massadedados = new PesquisadeProdutoPage(driver) : massadedados;


	    } */
}
