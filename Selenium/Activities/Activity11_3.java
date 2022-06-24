package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activty11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        WebDriver driver = new ChromeDriver();

		        //Open browser
		        driver.get("https://www.training-support.net/selenium/javascript-alerts");

		        //Print title of page and heading on page
		        System.out.println("Page title is: " + driver.getTitle());

		        //Click the button to open a prompt
		        driver.findElement(By.cssSelector("button#prompt")).click();

		        //Switch to prompt window
		        Alert promptAlert = driver.switchTo().alert();

		        //Get text in the prompt box and print it
		        String alertText = promptAlert.getText();
		        System.out.println("Alert text is: " + alertText);

		        //Type "Awesome!" into the prompt
		        promptAlert.sendKeys("Awesome!");

		        //Close the prompt
		        promptAlert.accept();

		        //Close the Browser
		        driver.close();
		    }
		}
