package com.ait.qa27;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class ShoppingCartTests extends TestBase{
  @BeforeMethod
  public void ensurePrecondition() {
    if (!isElementPresent(By.cssSelector("[href='/login']"))){
      driver.findElement(By.xpath("//button[.='Log out']")).click();
    }
  }



    //driver.findElement(By.cssSelector(".master-wrapper-page:nth-child(4)")).click();

}
