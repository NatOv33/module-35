package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    public static final WebDriver webDriver;
    public static final ChoseSectionPage choseSectionPage;
    public static final СhoseGiftPage сhoseGiftPage;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gienka\\IdeaProjects\\cc-scenario\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();
        choseSectionPage = new ChoseSectionPage(webDriver);
        сhoseGiftPage = new СhoseGiftPage(webDriver);
    }


    @Given("url of shop {string}")
    public void url_of_shop(String url) {
        choseSectionPage.go(url);
    }

    @Then("chose section {string}")
    public void chose_section(String section) {
        choseSectionPage.searchSection(section);
    }


    @Then("assert that user got message {string}")
    public void assert_that_user_got_message(String errorMessage) {
        final var sectionNotFoundMessage = choseSectionPage.getSectionNotFoundMessage();
        assertEquals(errorMessage, sectionNotFoundMessage);
        }

    @Then("assert that chosen section is {string}")
    public void assert_that_chosen_section_is(String expectedSection) {
        final var currentSection = сhoseGiftPage.getCurrentSection();
        assertEquals(expectedSection, currentSection);
    }
}


