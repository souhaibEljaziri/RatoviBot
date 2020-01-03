/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratovibot;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Montasser
 */
public class RatoviBot {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RatovibotForm r = new RatovibotForm() ; 
       r.show();
    }
    
}
