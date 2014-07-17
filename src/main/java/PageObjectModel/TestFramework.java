package PageObjectModel;



import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author hesamyou
 */
public class TestFramework {

    static public LoginPage getLoginPage() {
        LoginPage LoginPage = new LoginPage();
        PageFactory.initElements(Browser.getDriver(), LoginPage);
        return LoginPage;
    }
    
    public static boolean User_Can_See_Balanace(){
        return true;
    }
    public static void ClosePage(){
        Browser.ClosePage();
    }

    public static class LoginPage {
        
        String Url = "http://localhost:8080";
        String welcomeMsg = "Welcome";
        /**
         *
         * @param username
         * @param password
         */
        public void Login(String username, String password) {
            Browser.Goto(Url);
            Browser.Input(username,password);
            Browser.Submit();
        }
        public boolean CheckIfLoggedIn(String user){
            return Browser.getTextByxpath("/html/body/header/div/p").contains(welcomeMsg + " " + user);
        }

        public void Logout() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
