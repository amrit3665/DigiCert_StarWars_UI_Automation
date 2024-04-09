/*package org.example;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test1 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Title']")).click();
        //String txt=driver.findElement(By.xpath("/html/body/section/main/table/tbody")).getText();
        // System.out.println(txt);

        WebElement table = driver.findElement(By.xpath(".//table/tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        WebElement lastRow = rows.get(rows.size() - 1);
        String expectedContent = "The Phantom Menace";

        WebElement firstCellInLastRow = lastRow.findElement(By.tagName("td"));


        String actualContent = firstCellInLastRow.getText(); // Adjust this based on your table structure
        System.out.println(actualContent);
        if (actualContent.equals(expectedContent)) {
            System.out.println("Assertion passed: Last row content matches the expected content");
        } else {
            System.out.println("Assertion failed: Last row content does not match the expected content");
        }

        driver.findElement(By.xpath("//*[text()='The Empire Strikes Back']")).click();
        Thread.sleep(2000);
        String txt1 = driver.findElement(By.xpath(".//div[2]/div[3]/ul")).getText();
        System.out.println(txt1);

        WebElement tab = driver.findElement(By.xpath(".//div[2]/div[3]/ul"));

        //"/html/body/section/main/div[2]/div[3]/ul"

        boolean isElementPresent = false;
        List<WebElement> rows1 = tab.findElements(By.tagName("tr"));
        for (WebElement row : rows1) {
            // Find the desired element within the row
            List<WebElement> cells = row.findElements(By.tagName("td")); // Assuming the element is within td tag
            for (WebElement cell : cells) {
                // Check if the desired element is present
                // You can modify this condition as per your specific element's locator
                if (cell.getText().equals("Wookie")) { // Replace "Desired text" with your desired text
                    isElementPresent = true;
                    break;
                }

            }


            if (isElementPresent) {
                break; // No need to continue iterating if the element is found
            }

            // Print the result
            if (isElementPresent) {
                System.out.println("Element is present in the table");
            } else {
                System.out.println("Element is not present in the table");
            }


        }
        driver.findElement(By.xpath("/html/body/section/nav/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='The Phantom Menace']")).click();
        Thread.sleep(5000);


        WebElement table3 = driver.findElement(By.xpath(".//div[2]/div[2]/ul"));
        List<WebElement> rows2 = table3.findElements(By.tagName("tr"));

        boolean caminoFound = false;

        for (WebElement row : rows2) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                String cellText = cell.getText();
                if (cellText.contains("Camino")) {
                    caminoFound = true;
                    break;
                }
            }
            if (caminoFound) {
                break;
            }
        }

        if (!caminoFound) {
            System.out.println("Assertion passed: 'Camino' is not part of the table");
        } else {
            System.out.println("Assertion failed: 'Camino' is part of the table");
        }


    }

}*/
