package adddelete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Adduser.Select;

public class Movie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website where movie/review list is present
        driver.get("https://movie-reviews-psi.vercel.app/");

        // Assume there are elements like 'Add Movie' button, 'Edit Movie' button, 'Review' text field, etc.
        // Locate and interact with these elements based on your website structure

        // Example: Clicking on 'Add Movie' button
        WebElement addMovieButton = driver.findElement(By.xpath("//button[@class='flex w-fit items-center gap-1 rounded-md border-2 border-[#b5b4ef] bg-white px-2 py-1 text-[#6558f5] md:px-4 md:py-2']"));
        addMovieButton.click();

        // Example: Entering movie details in input fields
        WebElement movieTitleInput = driver.findElement(By.id("//input[@id='name']"));
        movieTitleInput.sendKeys("Avengers");
        
        WebElement movieTitleInput = driver.findElement(By.id("//input[@id='release']"));

        // Example: Clicking on 'Save' button to add the movie
        WebElement saveButton = driver.findElement(By.id("//button[@type='submit']"));
        saveButton.click();

        // Example: Verifying that the movie was added by checking if it appears in the movie list
        WebElement movieList = driver.findElement(By.xpath("//a[@href='/movies/cltpq16k70000divoyj2ken6x']"));
        boolean movieAdded = movieList.getText().contains("Avengers"); 

        if (movieAdded) {
            System.out.println("Movie added successfully!");
        } else {
            System.out.println("Failed to add the movie.");
        }

        // After adding or editing a movie or review, the list should be updated automatically
        // You may need to wait for the list to update, depending on how it's implemented in your website
        WebElement addReview = driver.findElement(By.xpath("//button[@class='flex w-fit items-center gap-1 rounded-md border-2 px-2 py-1 md:px-4 md:py-2 border-[#6558f5] bg-[#6558f5] text-white']"));

        Select dropdown = new Select(driver.findElement(By.id("//select[@id='movie']")));
        dropdown.selectByVisibleText("avenger");

        WebElement reviewButton = driver.findElement(By.id("//input[@class='focus:shadow-outline w-full appearance-none rounded border-[3px] border-solid border-[#cbd5de] px-3 py-2 leading-tight text-gray-700 focus:outline-none']"));
        reviewButton.sendKeys("houn");
        
        WebElement ratingField = driver.findElement(By.id("//input[@id='rating']"));
        ratingField.sendKeys("5");
        
        WebElement reviewField = driver.findElement(By.id("//textarea[@id='review']"));
        reviewField.sendKeys("Good")
        
        WebElement createreviewButton = driver.findElement(By.id("//button[@type='submit' and @class='flex w-fit items-center gap-1 rounded-md border-2 px-2 py-1 md:px-4 md:py-2 border-[#6558f5] bg-[#6558f5] text-white']"));
        createreviewButton.click();
        
        // Close the browser
        driver.quit();
	}

}
