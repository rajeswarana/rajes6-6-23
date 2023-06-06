package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropproo {
	
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
//		
//		WebElement state = driver.findElement(By.name("country"));
//		
//		Select select=new Select(state);
//		boolean multiple = select.isMultiple();
//		System.out.println(multiple);
//		
//		List<WebElement> options = select.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//		    String text = options.get(i).getAttribute("value");
//		    System.out.println(text);
//			
		
//		driver.get(" ");
//		
//		WebElement fruit = driver.findElement(By.id("fruits"));
//		Select select=new Select(fruit);
//		
//		List<WebElement> options = select.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			if(i%2==0) {
//				String text = options.get(i).getText();
//				System.out.println(text);
//			}
//			
//		}
		
		driver.get("http://output.jsbin.com/osebed/2\r\n");
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select select=new Select(fruit);
		
		
		
		List<WebElement> options = select.getOptions();
		for (int i = 0; i <options.size() ; i++) {
			select.selectByIndex(i);
			
			
		}
		
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement elment:allSelectedOptions) {
			String text = elment.getText();
			System.out.println(text);
		}
		
		
		
	}
}
			
		
			 
		
		
		
	


