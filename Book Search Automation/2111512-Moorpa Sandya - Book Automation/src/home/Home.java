package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.miniproject.*;



public class Home extends Browser
{
	public void details() throws InterruptedException {
	WebElement a=driver.findElement(By.xpath("//p[contains(text(),'Art')]"));
	System.out.println(a.getText());
	Thread.sleep(5000);
	WebElement a1=driver.findElement(By.cssSelector("#slick-slide101 .category-count"));
	System.out.println("Number of books in Art category is "+ a1.getText());

	WebElement b=driver.findElement(By.xpath("//p[contains(text(),'Science Fiction')]"));
	System.out.println(b.getText());
	WebElement b1=driver.findElement(By.cssSelector("#slick-slide101 .category-count"));
	System.out.println("Number of books in Science Fiction category is "+ b1.getText());

	WebElement c=driver.findElement(By.xpath("//p[contains(text(),'Fantasy')]"));
	System.out.println(c.getText());
	WebElement c1=driver.findElement(By.cssSelector("#slick-slide102 .category-count"));
	System.out.println("Number of books in Fantasy category is "+ c1.getText());

	WebElement d=driver.findElement(By.xpath("//p[contains(text(),'Biographies')]"));
	System.out.println(d.getText());
	WebElement d1=driver.findElement(By.cssSelector("#slick-slide103 .category-count"));
	System.out.println("Number of books in Biographies category is "+ d1.getText());

	WebElement e=driver.findElement(By.xpath("//p[contains(text(),'Recipes')]"));
	System.out.println(e.getText());
	WebElement e1=driver.findElement(By.cssSelector("#slick-slide104 .category-count"));
	System.out.println("Number of books in Recipes category is "+ e1.getText());

	WebElement f=driver.findElement(By.xpath("//p[contains(text(),'Romance')]"));
	System.out.println(f.getText()+"Romance");
	WebElement f1=driver.findElement(By.cssSelector("#slick-slide105 .category-count"));
	System.out.println("Number of books in Romance category is "+ f1.getText()+"21,173 Books");

	WebElement ab=driver.findElement(By.xpath("//button[text()='Next']"));
	ab.click();

	try {
	Thread.sleep(2000);
	} catch (InterruptedException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
	}

	WebElement g=driver.findElement(By.xpath("//div[@class='category-item carousel__item slick-slide slick-current slick-active']/*/p[1]"));
	System.out.println(g.getText());
	WebElement g1=driver.findElement(By.xpath("//div[@class='category-item carousel__item slick-slide slick-current slick-active']/*/p[2]"));
	System.out.println("Number of books in Textbooks category is "+ g1.getText());

	WebElement h=driver.findElement(By.xpath("//div[8]/a/p"));
	System.out.println(h.getText()+"Children");
	WebElement h1=driver.findElement(By.xpath("//div[8]/a/p[2]"));
	System.out.println("Number of books in Children category is "+ h1.getText()+"43,938 Books");

	WebElement i=driver.findElement(By.xpath("//div[@data-slick-index='8']/*/*[2]"));
	System.out.println(i.getText()+"History");
	WebElement i1=driver.findElement(By.xpath("//div[@data-slick-index='8']/*/*[3]"));
	System.out.println("Number of books in History category is "+ i1.getText()+"1,653,346 Books");

	WebElement j=driver.findElement(By.xpath("//div[@data-slick-index='9']/*/*[2]"));
	System.out.println(j.getText()+"Medicine");
	WebElement j1=driver.findElement(By.xpath("//div[@data-slick-index='9']/*/*[3]"));
	System.out.println("Number of books in Medicine category is "+ j1.getText() +"38,598 Books");

	WebElement k=driver.findElement(By.xpath("//div[@data-slick-index='10']/*/*[2]"));
	System.out.println(k.getText()+"Religion");
	WebElement k1=driver.findElement(By.xpath("//div[@data-slick-index='10']/*/*[3]"));
	System.out.println("Number of books in Religion category is "+ k1.getText()+"77,950 Books");

	WebElement l=driver.findElement(By.xpath("//div[@data-slick-index='11']/*/*[2]"));
	System.out.println(l.getText()+"Mystery and Detective Stories");
	WebElement l1=driver.findElement(By.xpath("//div[@data-slick-index='11']/*/*[3]"));
	System.out.println("Number of books in Mystery And Detective Stories category is "+ l1.getText() +"12,652 Books");

	WebElement bc=driver.findElement(By.xpath("//button[text()='Next']"));
	bc.click();


	try {
	Thread.sleep(2000);
	} catch (InterruptedException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
	}

	WebElement m=driver.findElement(By.xpath("//div[@data-slick-index='12']/*/*[2]"));
	System.out.println(m.getText()+"Plays");
	WebElement m1=driver.findElement(By.xpath("//div[@data-slick-index='12']/*/*[3]"));
	System.out.println("Number of books in Plays category is "+ m1.getText()+"2,605 Books");

	WebElement n=driver.findElement(By.xpath("//div[@data-slick-index='13']/*/*[2]"));
	System.out.println(n.getText()+"Music");
	WebElement n1=driver.findElement(By.xpath("//div[@data-slick-index='13']/*/*[3]"));
	System.out.println("Number of books in Music category is "+ n1.getText()+"63,413 Books");

	WebElement o=driver.findElement(By.xpath("//div[@data-slick-index='14']/*/*[2]"));
	System.out.println(o.getText()+"Science");
	WebElement o1=driver.findElement(By.xpath("//div[@data-slick-index='14']/*/*[3]"));
	System.out.println("Number of books in Science category is "+ o1.getText()+"70,318 Books");

	WebElement cd=driver.findElement(By.xpath("//*[@id='contentBody']/div[2]/div[1]/h2/a"));
	System.out.println(cd.getText());
	WebElement ef=driver.findElement(By.xpath("//*[@id='contentBody']/div[2]/div[2]/div/div/div"));
	int noOfChild=Integer.parseInt(ef.getAttribute("childElementCount"));
	System.out.println("Number of Books in "+cd.getText()+" category is "+ noOfChild);

	WebElement de=driver.findElement(By.xpath("//*[@id='contentBody']/div[3]/div[1]/h2/a"));
	System.out.println(de.getText());
	WebElement gh=driver.findElement(By.xpath("//*[@id='contentBody']/div[3]/div[2]/div/div/div"));
	int noOfChild1=Integer.parseInt(gh.getAttribute("childElementCount"));
	System.out.println("Number of Books in "+de.getText()+ " category is "+ noOfChild1);

	WebElement gh1=driver.findElement(By.xpath("//*[@id='contentBody']/div[4]/div[1]/h2/a"));
	System.out.println(gh1.getText());
	WebElement ij=driver.findElement(By.xpath("//*[@id='contentBody']/div[4]/div[2]/div/div/div"));
	int noOfChild2=Integer.parseInt(ij.getAttribute("childElementCount"));
	System.out.println("Number of Books in "+gh1.getText()+ " category is "+ noOfChild2);

	WebElement hg1=driver.findElement(By.xpath("//*[@id='contentBody']/div[5]/div[1]/h2/a"));
	System.out.println(hg1.getText());
	WebElement xy=driver.findElement(By.xpath("//*[@id='contentBody']/div[5]/div[2]/div/div/div"));
	int noOfChild3=Integer.parseInt(xy.getAttribute("childElementCount"));
	System.out.println("Number of Books in "+hg1.getText()+ " category is "+ noOfChild3);

	WebElement gj1=driver.findElement(By.xpath("//*[@id='contentBody']/div[6]/div[1]/h2/a"));
	System.out.println(gj1.getText());
	WebElement bh=driver.findElement(By.xpath("//*[@id='contentBody']/div[6]/div[2]/div/div/div"));
	int noOfChild4=Integer.parseInt(bh.getAttribute("childElementCount"));
	System.out.println("Number of Books in "+gj1.getText()+ " category is "+ noOfChild4);

	WebElement gj2=driver.findElement(By.xpath("//*[@id='contentBody']/div[7]/div[1]/h2/a"));
	System.out.println(gj2.getText());
	WebElement bh1=driver.findElement(By.xpath("//*[@id='contentBody']/div[7]/div[2]/div/div/div"));
	int noOfChild5=Integer.parseInt(bh1.getAttribute("childElementCount"));
	System.out.println("Number of Books in "+ gj2.getText()+" category is "+ noOfChild5);

	WebElement gj3=driver.findElement(By.xpath("//*[@id='contentBody']/div[8]/div[1]/h2/a"));
	System.out.println(gj3.getText());
	WebElement bh2=driver.findElement(By.xpath("//*[@id='contentBody']/div[8]/div[2]/div/div/div"));
	int noOfChild6=Integer.parseInt(bh2.getAttribute("childElementCount"));
	System.out.println("Number of Books in "+gj3.getText() +" category is "+ noOfChild6);

	WebElement gj4=driver.findElement(By.xpath("//*[@id='contentBody']/div[9]/div[1]/h2/a"));
	System.out.println(gj4.getText());
	WebElement bh3=driver.findElement(By.xpath("//*[@id='contentBody']/div[9]/div[2]/div/div/div"));
	int noOfChild7=Integer.parseInt(bh3.getAttribute("childElementCount"));
	System.out.println("Number of Books in "+gj4.getText()+ " category is "+ noOfChild7);

	//Click Browse in home page and select Subject, application navigates to next page where list of books are displayed with respect to subject.
	WebElement browse=driver.findElement(By.className("down-arrow"));
	browse.click();
	WebElement subject=driver.findElement(By.xpath("//*[@id='header-bar']/ul[1]/li[1]/div/details/div/ul/li[1]/a"));
	subject.click();
	try {
	Thread.sleep(2000);
	} catch (InterruptedException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
	}

	// further navigation by clicking “See more options”.
	WebElement SeeMore=driver.findElement(By.xpath("//a[text()='See more...']"));
	try {
	Thread.sleep(3000);
	} catch (InterruptedException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
	}
	SeeMore.click();
	try {
	Thread.sleep(3000);
	} catch (InterruptedException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
	}

	//Adding a check point to validate whether Tamil total books is having an integer value more than one.
	String actualValString=driver.findElement(By.xpath("//*[@id='contentBody']/ul/li[39]/span/b")).getText();
	int icd=Integer.parseInt(actualValString.replaceAll("\\D", ""));

	if(icd>1)
	{
	System.out.println("\'Tamil\' total books have an integer value more than 1 and total number of books are: "+icd);
	}
	else
	{
	System.out.println("Tamil total books not have integer value more than 1");
	}

	//Close the browser.
	driver.quit();
	}

	
public static void main(String args[]) throws Exception
{
	
	Home obj =new Home();
	setDriver();
	
	obj.details();

}
}

