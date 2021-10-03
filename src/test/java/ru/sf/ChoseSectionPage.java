package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ChoseSectionPage {

    private static final String SEARCH_FIELD_CLASS = "header-search-form-input";
    private static final String ERROR_MESSAGE_SPAN_CLASS = "tab_text_XXXXXXXL";

    private final WebDriver webDriver;

    public ChoseSectionPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void go(String url) {
        webDriver.get(url);

    }

    public void searchSection(String section) {
        final var searchInput = webDriver.findElement(By.className(SEARCH_FIELD_CLASS));
        searchInput.sendKeys(section, Keys.ENTER);

    }

    public String getSectionNotFoundMessage() {
        return webDriver.findElement(By.className(ERROR_MESSAGE_SPAN_CLASS)).getText();
    }

}