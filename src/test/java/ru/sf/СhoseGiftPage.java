package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class –°hoseGiftPage {

    private final static String SECTION_SPAN_CLASS = "breadcrumb-banner_content-title";

    private final WebDriver webDriver;

    public –°hoseGiftPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getCurrentSection() {
        return webDriver.findElement(By.className(SECTION_SPAN_CLASS)).getText();
    }
}