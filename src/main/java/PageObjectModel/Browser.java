/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author hesamyou
 */
public class Browser {
    
    static WebDriver WebDriver = new FirefoxDriver();

    static void Goto(String Url) {
        WebDriver.get(Url);
    }

    static void Input(String username, String password) {
        WebDriver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys(username);
        WebDriver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys(password);
    }

    static void Submit() {
        WebDriver.findElement(By.xpath("/html/body/div/div/form/button")).submit();
    }

    static String getTextByxpath(String xpathString) {
        return WebDriver.findElement(By.xpath(xpathString)).getText();
    }

    static void ClosePage() {
        WebDriver.close();
    }
    
}
