package com.ait.qa27;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

  @BeforeMethod
  public void ensurePrecondition() {
    if (!isElementPresent(By.cssSelector("[href='/register']"))){
      driver.findElement(By.xpath("//button[.='Log out']")).click();
    }
  }
  @Test
  public void registerExistedNegativeTest() {
    driver.findElement(By.cssSelector("[href='/register']")).click();
   // driver.findElement(By.name("gender-male")).click();
    driver.findElement(By.name("FirstName")).click();
    driver.findElement(By.name("FirstName")).clear();
    driver.findElement(By.name("FirstName")).sendKeys("Luis");
    driver.findElement(By.name("LastName")).click();
    driver.findElement(By.name("LastName")).clear();
    driver.findElement(By.name("LastName")).sendKeys("Bergwein");
    driver.findElement(By.name("Email")).click();
    driver.findElement(By.name("Email")).clear();
    driver.findElement(By.name("Email")).sendKeys("luis156@gmail.com");
    driver.findElement(By.name("Password")).click();
    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.name("Password")).sendKeys("Luis1234$");
    driver.findElement(By.name("ConfirmPassword")).click();
    driver.findElement(By.name("ConfirmPassword")).clear();
    driver.findElement(By.name("ConfirmPassword")).sendKeys("Luis1234$");
    driver.findElement(By.name("register-button")).click();

    Assert.assertTrue(isAlertAppears());
  }

}
