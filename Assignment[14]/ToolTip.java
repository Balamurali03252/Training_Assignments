package junitbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTip {
  @Test
  public void Tooltiptest() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.google.com/?zx=1765904833144&no_sw_cr=1");
	  driver.manage().window().maximize();
	  
	  WebElement searchbar= driver.findElement(By.className("gLFyf"));
	  
	  String tooltip= searchbar.getAttribute("title");
	  
	  System.out.println(tooltip);
	  
  }
}
