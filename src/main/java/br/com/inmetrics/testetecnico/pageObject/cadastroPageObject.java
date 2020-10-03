package br.com.inmetrics.testetecnico.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class cadastroPageObject {

	private WebDriver driver;
	//private WebElement element;

	 public  cadastroPageObject (WebDriver driver){
	 this.driver = driver;
	 PageFactory.initElements(this.driver, this);
	 }

	 
	public WebElement btn_cadastrar() {

	 WebElement btn_cadastrar = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a"));

	 return btn_cadastrar;

	 
	}

	 


}
