package pierwszyTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Kielan on 27.02.2016.
 */
public class WorkshopTest {

    @Test
    public void startTestDriver() throws InterruptedException {

        WebDriver driver= new FirefoxDriver();
        driver.navigate().to("http://www.lufthansa.com/online/portal/lh/pl/homepage");
        WebElement startPlaceFlight=driver.findElement(By.id("flightmanagerFlightsFormOrigin"));
        startPlaceFlight.sendKeys("Berlin");
        WebElement destinationPlaceFlight=driver.findElement(By.id("flightmanagerFlightsFormDestination"));
        destinationPlaceFlight.sendKeys("Paris - Charles De Gaulle (CDG)");
       // WebElement probaOkienka = driver.findElement(By.id("flightmanagerFlightsFormAirportAtlasDestination"));
       // probaOkienka.click();
       // driver.findElement(By.xpath("//*[contains(text(),'Peru')] ")).sendKeys("");
       // WebElement wybierzKraj = driver.findElement(By.xpath("//*[contains(text(),'Polinezja Francuska')] "));
        //wybierzKraj.click();
        WebElement startDate= driver.findElement(By.id("flightmanagerFlightsFormOutboundDateDisplay"));
        startDate.sendKeys("");
        WebElement pickStartDate=driver.findElement(By.xpath("/*//*[@aria-label='Mo, 29.02.2016' or @aria-label='Pn, 29.02.2016']" ));
        pickStartDate.click();

        WebElement pickReturnDate=driver.findElement(By.xpath("/*//*[@aria-label='We, 02.03.2016' or @aria-label='Śr, 02.03.2016']"));
        pickReturnDate.click();
        startPlaceFlight.submit();

        //WebElement pierwszaCena=driver.findElement(By.xpath("/*//*[@data-reactid='.4.2.$AvailabilityRow1.3.3']"));
        String napis=driver.findElement(By.xpath("/*//*[@data-reactid='.4.2.$AvailabilityRow1.3.3']")).getText();
        double cena=Double.parseDouble(driver.findElement(By.xpath("/*//*[@data-reactid='.4.2.$AvailabilityRow1.3.3']")).getText().substring(3,9).replace(",","."));
        System.out.println("naspi: "+napis);
        System.out.println("CENA: "+cena);


       // WebElement startDateInput = driver.findElement(By.cssSelector("Moje rezerwacje"));
        // startDateInput.click();
        //WebElement returnDate = driver.findElement(By.id("flightmanagerFlightsFormInboundDateDisplay"));
        //returnDate.sendKeys("");
        //startDate.sendKeys("Śr, 09.03.2016");


       /* WebElement flightmanagerFlightsFormAirportAtlasOrigin=driver.findElement(By.id("flightmanagerFlightsFormAirportAtlasOrigin"));
        flightmanagerFlightsFormAirportAtlasOrigin.click();
        WebElement findStartPlace= driver.findElement(By.id("flmOriginAirportAtlasCountry126"));
        findStartPlace.click();
        findStartPlace.click();
        WebElement findCity = driver.findElement(By.id("flmOriginAirportAtlasCityWAW"));
        findCity.click();
        //findStartPlace.submit();
       /* WebElement pickCity = driver.findElement(By.id("flmOriginAirportAtlasCityBER"));
        pickCity.click();
        WebElement pickAirport =driver.findElement(By.id("flmOriginAirportAtlasAirportSXF"));
        pickAirport.click();
        WebElement submit=driver.findElement(By.cssSelector("input[value=Select]"));
        submit.click();
        WebDriverWait driver1 = null;
        driver1.until((Function<? super WebDriver, Object>) driver.findElement(By.cssSelector("button[aria-label='Wt, 08.03.2016]'")));
        */

        //spaceFlight.sendKeys("Berlin");


        //Dzialajcy XPATH///
        /*WebElement probny = driver.findElement(By.xpath("/*//*[@tabindex='34']"));
        probny.click();*/
    }
}
