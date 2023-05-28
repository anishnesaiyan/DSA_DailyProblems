package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JIRA_TC {
	/*	Login to JIRA in incognito
		Click on Projects
		Click 'View All projects'
		Enter and invalid Project name and validate the text
		Enter valid project Name
		Click the project
		Collect the list of issues in the board
		Open a new tab and Create a new issues
		Refresh and validate does the board has newly created issue
		Create a bug with blocked by newly created issue
		Change the status as Done for the newly created bug and validate the status in the board
	 * 
	 * */
	
	
	
public static void main(String[] args) throws InterruptedException {
	ChromeOptions cp= new ChromeOptions();
	cp.addArguments("incognito");
	ChromeDriver driver= new ChromeDriver(cp);
	
	driver.get("https://anishnesaiyan.atlassian.net/jira/software/projects/SAM/boards/1");
	driver.findElement(By.id("username")).sendKeys("11nanish@gmail.com");
	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("An3sh4e@123");
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='Projects']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='View all projects']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Sample1']")).click();
	Thread.sleep(4000);
	String issueCount=driver.findElement(By.xpath("//span[text()='2'])[2]']")).getText();
	int a=Integer.parseInt(issueCount.trim());
	
	 driver.findElement(By.id("createGlobalItem")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.name("summary")).sendKeys("Sample3");
	 driver.findElement(By.xpath("//span[text()='Create']")).click();
	 Thread.sleep(3000);
	 //to check the newly created issue exist
	 driver.findElement(By.xpath("//span[text()='"+(a+1)+"'])[2]']"));
	 
	 driver.findElement(By.id("createGlobalItem")).click();
	 Thread.sleep(1000);
	 String issueName="Issue2";
	 driver.findElement(By.name("summary")).sendKeys(issueName);
	 
	 driver.findElement(By.id("issue-create.ui.modal.create-form.type-picker.issue-type-select")).click();
	 driver.findElement(By.id("react-select-40-option-2")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='Create']")).click();
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//span[text()='"+issueName+"']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='To Do']")).click();
	 
	 driver.findElement(By.xpath("//span[text()='Done']")).click();
	 
	 driver.quit();
}
}
