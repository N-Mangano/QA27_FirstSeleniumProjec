package com.ait.qa27;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTests extends TestBase{
  @BeforeMethod
  public void ensurePrecondition() {
    if (!isElementPresent(By.cssSelector("[href='/login']"))){
      driver.findElement(By.xpath("//button[.='Log out']")).click();
    }

    driver.findElement(By.cssSelector("[href='/login']")).click();
    driver.findElement(By.name("Email")).click();
    driver.findElement(By.name("Email")).clear();
    driver.findElement(By.name("Email")).sendKeys("luis7@gmail.com");
    driver.findElement(By.name("Password")).click();
    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.name("Password")).sendKeys("Luis1234$");
    driver.findElement(By.cssSelector("[for='RememberMe']")).click();
    driver.findElement(By.cssSelector(".button-1.login-button")).click();

    Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));
  }

  @Test
  public void addProductToCartPositiveTest() {
  driver.findElement(By.cssSelector("[href='/build-your-own-expensive-computer-2']")).click();
  driver.findElement(By.cssSelector("#add-to-cart-button-74")).click();
//  driver.findElement(By.cssSelector(".cart-label")).click();
//  driver.findElement(By.cssSelector(".count")).click();

//    int sizeBefore = sizeOfItems();
//    //click on contact
//    addItems();
//    pause(1000);
//    //get size of contacts after remove
//    int sizeAfter = sizeOfItems();
//    //assert by number of contacts
//    Assert.assertEquals(sizeAfter, sizeBefore+1);
//
//  }
//
//  public void addItems() {
//  }
//
//  public void pause(int millis) {
//    try {
//      Thread.sleep(millis);
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }
//  }
//
//  public int sizeOfItems() {
//    if (isElementPresent(By.cssSelector(".cart-qty"))) {
//      return driver.findElements(By.cssSelector(".cart-qty")).size();
//    }
//    return 0;

//    Assert.assertTrue(isElementPresent(By.xpath("//button[@id='checkout']")));

  }

}
