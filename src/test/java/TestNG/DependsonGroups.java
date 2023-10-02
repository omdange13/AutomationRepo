package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonGroups {

    @Test(description = "This is Verify")
    public void  VerifyLogin(){

        System.out.println("VerifyLogin");
        //Assert.assertFalse(true);

    }
    @Test
    public void  VerifyHomepage(){

        System.out.println("VerifyHomepage");
    }
    @Test(dependsOnGroups = {"Smoke"} , alwaysRun = true)
    public void  VerifyFunctionality(){

        System.out.println("VerifyFunctionality");
    }
}
