package com.ait.qa27;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
  @BeforeMethod
  public void ensurePrecondition() {
    if (!isElementPresent(By.cssSelector("[href='/login']"))){
      driver.findElement(By.xpath("//button[.='Log out']")).click();
    }
  }
  @Test
  public void loginPositiveTest() {

    driver.findElement(By.cssSelector("[href='/login']")).click();
    driver.findElement(By.name("Email")).click();
    driver.findElement(By.name("Email")).clear();
    driver.findElement(By.name("Email")).sendKeys("luis7@gmail.com");
    driver.findElement(By.name("Password")).click();
    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.name("Password")).sendKeys("Luis1234$");
    driver.findElement(By.cssSelector("[for='RememberMe']")).click();
    driver.findElement(By.xpath("//button[.='Log in']")).click();
    //driver.findElement(By.cssSelector(".master-wrapper-page:nth-child(4)")).click();

    Assert.assertTrue(isLogOutButtonPresent());
  }

  public boolean isLogOutButtonPresent() {
    return isElementPresent(By.xpath("//button[.='Log Out']"));
  }
}
