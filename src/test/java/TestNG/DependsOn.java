package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void Amul(){

        System.out.println("This is Amul");
        Assert.assertFalse(true);

    }
    @Test
    public void Butter(){

        System.out.println("This is AmulButter");

    }
    @Test
    public void India(){

        System.out.println("This is India");

    }


}
