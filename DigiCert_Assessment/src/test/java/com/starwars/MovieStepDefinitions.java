package com.starwars;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.starWarsPo;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MovieStepDefinitions {

    private WebDriver driver;
    private starWarsPo warsPo;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        warsPo = new starWarsPo(driver);
    }

    @Given("User launches the Chrome browser")
    public void user_launches_the_Chrome_browser() {}

    @When("User opens URL {string}")
    public void user_opens_URL(String url) {
        driver.get(url);
    }

    @When("Sort the movies column")
    public void sort_the_movies_column() {
        warsPo.movieTitle();
    }

    @Then("Verify that last movie in the list is {string}")
    public void verify_that_last_movie_in_the_list_is(String expectedMovie) {
        WebElement lastRow = getLastTableRow();
        String actualContent = lastRow.findElement(By.tagName("td")).getText();
        System.out.println(actualContent);
        if (actualContent.equals(expectedMovie)) {
            System.out.println("Assertion passed: Last row content matches the expected content");
        } else {
            System.out.println("Assertion failed: Last row content does not match the expected content");
        }
    }

    @Then("User clicks on {string} movie")
    public void user_clicks_on_movie(String movieName) {
        warsPo.theempireStrikeMovie();
    }

    @Then("Verifies the species list has {string}")
    public void verifies_the_species_list_has(String expectedSpecies) {
        WebElement table = driver.findElement(By.xpath(".//div[2]/div[3]/ul"));
        boolean isElementPresent = isElementPresentInTable(table, expectedSpecies);
    }

    @Then("Click on movie {string}")
    public void click_on_movie(String movieName) {
        warsPo.PhantomMenacemovie();
    }

    @Then("Verify that Planets {string} is not part of the movie")
    public void verify_that_Planets_is_not_part_of_the_movie(String unexpectedPlanet) {
        WebElement table = driver.findElement(By.xpath(".//div[2]/div[2]/ul"));
        boolean caminoFound = isElementPresentInTable(table, unexpectedPlanet);
        if (!caminoFound) {
            System.out.println("Assertion passed: 'Camino' is not part of the table");
        } else {
            System.out.println("Assertion failed: 'Camino' is part of the table");
        }
    }

    @After

    @Then("Close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }


    // Helper methods

    private WebElement getLastTableRow() {
        WebElement table = driver.findElement(By.xpath(".//table/tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        return rows.get(rows.size() - 1);
    }

    private boolean isElementPresentInTable(WebElement table, String expectedText) {
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                if (cell.getText().equals(expectedText)) {
                    return true;
                }
            }
        }
        return false;
    }

}
