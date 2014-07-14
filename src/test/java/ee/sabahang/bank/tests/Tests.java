/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ee.sabahang.bank.tests;

import PageObjectModel.TestFramework.LoginPage;
import PageObjectModel.TestFramework;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author hesamyou
 */
public class Tests {
    
    @Test
    public void User_Can_Login(){
        String username = "Jake";
        String password = "Jake";
        LoginPage.Login(username, password);
        assertTrue(LoginPage.CheckIfLoggedIn());
    }

//    public void Can_Logout(){
//        LoginPage.Logout();
//        assertTrue(CheckIfLoggedOut());
//    }
//    public void NewUser_Must_Change_Password(){
//        String username = "Sara";
//        String password = "Sara";
//        LoginPage.Login(username, password);
//        assertTrue(CheckIfPasswordChangeIsNeeded());
//    }
//    //here I need a mock object
//    public void User_Can_See_Balanace(){
//        String username = "Jake";
//        LoginPage.Login();
//        assertTrue(CheckIfBalanceIsShown());
//    }
    
    @AfterClass
    public static void tearDownClass() {
        TestFramework.ClosePage();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
