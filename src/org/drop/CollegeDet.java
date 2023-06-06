package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CollegeDet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("rajeswaran");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Style@333");
		
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		
		WebElement loc = driver.findElement(By.id("location"));
		
		Select select=new Select(loc);
		select.selectByValue("London");
		
		WebElement hot = driver.findElement(By.id("hotels"));
		Select select2=new Select(hot);
		select2.selectByVisibleText("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select select3=new Select(room);
		List<WebElement> options = select3.getOptions();
		int size = options.size();
		System.out.println(size);
		select3.selectByIndex(3);
		
		WebElement nos = driver.findElement(By.id("room_nos"));
		Select select4=new Select(nos);
		select4.selectByValue("6");
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("01/05/2023");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("02/05/2023");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select select5=new Select(adult);
		select5.selectByValue("2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select select6=new Select(child);
		select6.selectByValue("1");
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys("rajeswaran");
		
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys("A");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("new york st, america");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("1233433226754325");
		
		WebElement com = driver.findElement(By.id("cc_type"));
		Select select7=new Select(com);
		select7.selectByVisibleText("American Express");
		
		WebElement mon = driver.findElement(By.id("cc_exp_month"));
		Select select8=new Select(mon);
		select8.selectByVisibleText("March");
		
		WebElement exp = driver.findElement(By.id("cc_exp_year"));
		Select select9=new Select(exp);
		select9.selectByValue("2022");
		
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("123");
		
		WebElement now = driver.findElement(By.id("book_now"));
		now.click();
		
	    
		
		WebElement order = driver.findElement(By.xpath("order_no"));
		String attribute = order.getAttribute("value");
		System.out.println(attribute);
	}
	
}


