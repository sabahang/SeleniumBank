package PageObjectModel;




/**
 *
 * @author hesamyou
 */
public class TestFramework {
    static String Url = "http://localhost:8080";
    static String welcomeMsg = "Welcome";

    public static boolean User_Can_See_Balanace(){
        return true;
    }
    public static void ClosePage(){
        Browser.ClosePage();
    }

    public static class LoginPage {

        /**
         *
         * @param username
         * @param password
         */
        public static void Login(String username, String password) {
            Browser.Goto(Url);
            Browser.Input(username,password);
            Browser.Submit();
        }
        public static boolean CheckIfLoggedIn(String user){
            System.out.print(Browser.getTextByxpath("/html/body/header/div/p"));
            return Browser.getTextByxpath("/html/body/header/div/p").contains(welcomeMsg + " " + user);
        }
    }
}
