import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		//get url		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("SUPPORT")).click();

}
}