package br.com.inmetrics.testetecnico.pageManager;



public class ContextodeTeste {
	
    private driverObject webDriverManager;
    private PageObjectManager pageObjectManager;
    
    
    public ContextodeTeste(){
        webDriverManager = new driverObject();
        pageObjectManager = new PageObjectManager(webDriverManager.inicializaDriver());    
    }
    
    public  driverObject getWebDriverManager() {
        return webDriverManager;
    }
    
    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
    
   

}
