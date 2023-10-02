package Annotations;

import org.testng.annotations.*;

public class Annotations {

    @BeforeTest
    public void BeforeTestEG(){

        System.out.println("This is BeforeTest");
    }
    @BeforeClass
    public void BeforeClassEG(){

        System.out.println("This is BeforeClass");
    }
    @BeforeMethod
    public void BeforeMethodEG(){

        System.out.println("This is BeforeMethod");
    }
    @Test
    public void TestCase1(){

        System.out.println("This is TestCase1");
    }
    @Test
    public void TestCase2(){

        System.out.println("This is TestCase2");
    }
    @Test
    public void TestCase3(){

        System.out.println("This is TestCase3");
    }
    @AfterMethod
    public void AfterMethodEG(){

        System.out.println("This is AfterMethod");
    }
    @AfterClass
    public void AfterClassEG(){

        System.out.println("This is AfterClass");
    }
    @AfterTest
    public void AfterTestEG(){

        System.out.println("This is AfterTest");
    }

}
