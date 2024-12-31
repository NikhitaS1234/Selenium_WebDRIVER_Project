package testcases;




import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

	public class Tests extends Baseclass {
		
		@Test
		public void tc01_Signup() {
			SignUpPage sp = new SignUpPage();
			sp.clicksignup("Sign Up - Personal");
			sp.SingupPersonalDetails("Niki103", "D", "nd48@gmail.com", "003839196", "Nik1@dee2","Nik1@dee2");
			sp.SignupAddress("Add12102","Add22102", "City31012", "889020", "State1222", "Country10132", "Personal Details");
			sp.ValidateSucess("You can use your email address as username to login!");
		}
		
		
		@Test
		public void tc02_loginsucess() {
			LoginPage lp =new LoginPage();
			lp.loginmethod("nd84@gmail.com", "Nik1@dee2");
			lp.validateloginsucess("Niki102 D");
		}
		
		
		@Test
		public void tc03_loginfailure() {
			LoginPage lp =new LoginPage();
			lp.loginmethod("nd84@gmail.com", "qwe@123");
			lp.validateloginfailure("Username and Password is invalid!");
		}
		
		
		@Test
		public void tc04_add1itemchkout() {
			LoginPage lp =new LoginPage();
			lp.loginmethod("nd84@gmail.com", "Nik1@dee2");
			HomePage hp = new HomePage();
			hp.addtocart1item();
			hp.validateaddtocart("Product has been successfully added inside cart!");
			hp.validatecheckout("123456789", "12", "95", "222", "Your Order is Confirmed!!");
			
		}
		
		@Test
		public void tc05_add2itemchkout() {
			
			LoginPage lp =new LoginPage();
			lp.loginmethod("nd84@gmail.com", "Nik1@dee2");
			HomePage hp = new HomePage();
			hp.addtocart1item();
			hp.addtocart2items();
			hp.validateaddtocart("Product has been successfully added inside cart!");
			hp.validatecheckout("123456789", "12", "95", "222", "Your Order is Confirmed!!");
			
		}
		

	}

