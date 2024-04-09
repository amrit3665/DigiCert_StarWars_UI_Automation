package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class starWarsPo {

    public WebDriver ldriver;

    public starWarsPo(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()='Title']")
    WebElement title;

    @FindBy(xpath = ".//main/table/tbody")
    WebElement lastMovie;

    @FindBy(xpath = "//*[text()='The Empire Strikes Back']")
    WebElement empireStrikeMovie;

    @FindBy(xpath = ".//main/div[2]/div[3]/ul")
    WebElement specieslist;

    @FindBy(xpath = ("//*[text()='The Phantom Menace']"))
    WebElement phaMen;

    @FindBy(xpath = ".//body/section/nav/a")
    WebElement back;

    public void movieTitle() {
        title.click();
    }

    public void thePhantomMenace() {
        lastMovie.getText();
    }

    public void theempireStrikeMovie() {
        empireStrikeMovie.click();
    }

    public void species() {
        specieslist.getText();
    }

    public void backButton(){
        back.click();
    }


    public void PhantomMenacemovie() {
        phaMen.click();
    }
}



