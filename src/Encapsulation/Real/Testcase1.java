package Encapsulation.Real;

public class Testcase1 extends BaseClass {


    public Testcase1(){
        super();//parent class constructor can be called using super keyword

        System.out.println("Dc- Testcase1");

    }

   public void startTestCase(){
        openBrowser();
        closeBrowser();
    }

    @Override
    public String setBrowser(String browser, boolean isAuth) {
        System.out.println("Own logic ");
        return super.setBrowser(browser, isAuth);

    }
}
