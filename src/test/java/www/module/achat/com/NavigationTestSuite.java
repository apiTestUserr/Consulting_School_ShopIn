package www.module.achat.com;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTestSuite {
	
	
	@Test
	public void rechercheProduit() throws InterruptedException {
		
		
		
		ChromeDriver cursueur = new ChromeDriver();
		
		
		
		cursueur.get("https://shop-in.ovh/");
		
		// localiser l'element web recherche a l'aide de la methode findElement
	//	Thread.sleep(5000);
		
		cursueur.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        cursueur.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/button[1]")).click();
        

		By searchXpath = By.xpath("//button[@aria-label='Search']");
		
		
		WebElement searchElement = cursueur.findElement(searchXpath);
		
		searchElement.click();
		
		// le localisateur className c'est l,equivalent de classe au niveau de l page HTML
		
		cursueur.findElement(By.className("modal-field")).sendKeys("T-Shirt" + Keys.ENTER);
		
		
		// Comparer le resultat attendu avec le resultat actuel pour avoir un resultat concret du test
		
		
       String actualResult	=	cursueur.findElement(By.tagName("h1")).getText();
		
		// La comparaison de fait a l'aide Junit
		
		String expectedResult = "Résultats de recherche pour T-Shirthhhhhhh";
		
		
		Assert.assertEquals(expectedResult, actualResult);
		
		
	}
	
	
	

}
