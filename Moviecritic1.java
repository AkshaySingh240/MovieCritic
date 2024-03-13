package movietesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Moviecritic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the home page
        driver.get("https://movie-reviews-psi.vercel.app/");

        // Find the search bar element
        WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search for your favorite movie']"));
        searchBar.sendKeys("aks"); 
        
        WebElement editButton = driver.findElement(By.xpath("//button[@class='mr-3 rounded border border-[#a19fb6] p-1 shadow-sm']"));
        editButton.click()
        
        WebElement nameBar = driver.findElement(By.xpath("//input[@id='name']"));
        nameBar.sendKeys("sing");
        
        WebElement dateSelect = driver.findElement(By.xpath("//input[@id='release']"));
        dateSelect.sendKeys("sing");
        
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='rounded border border-[#a19fb6] p-1 shadow-sm']"));
        
        //click on the movie card to show review 
        WebElement movieCard = driver.findElement(By.xpath("//a[@href='/movies/cltpo4d7t0000iaavxkgbgsep']"));
        movieCard.click();
        

        // Close the browser
        driver.quit();
	}

}
