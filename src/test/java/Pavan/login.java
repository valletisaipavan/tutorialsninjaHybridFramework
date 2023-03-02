package Pavan;


import org.testng.annotations.Test;
                          

                              //groups
public class login {
  @Test(groups= {"smoke"} )
  public void loginwithvalidcredentails() {
	  System.out.println("loginwithvalidcredentails-smoke");
  }


@Test(groups= {"sanity",} )
public void loginwithinvalidcredentails() {
	  System.out.println("loginwithinvalidcredentails-sanity");
}

@Test(groups= {"regression"} )
public void loginwithvalidgmail() {
	
	  System.out.println("loginwithvalidgmail-regression");
}

@Test(dependsOnGroups= {"smoke","sanity","regression"} )
public void loginwithvalidpassword() {
	  System.out.println("loginwithvalidpassword-login");
}
}