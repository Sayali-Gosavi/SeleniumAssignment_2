package Assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
	
	WebDriver d;
	String url="https://jqueryui.com/droppable/";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		d.quit();
	}

	@Test
	public void test() throws InterruptedException {
		//Switching to child frame
		d.switchTo().frame(0);
		
		//Taking webelement from browser
		WebElement DragElement = d.findElement(By.id("draggable"));
		WebElement DroppingPlace = d.findElement(By.id("droppable"));
		
		//Performing drag and drop action
		Actions action = new Actions(d);
		action.dragAndDrop(DragElement, DroppingPlace).perform();
		//implicit wait for 5 seconds 
		Thread.sleep(5000);
		

	}

}
