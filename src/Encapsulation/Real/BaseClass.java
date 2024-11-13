package Encapsulation.Real;

public class BaseClass {
  private  String browser;
   public BaseClass(){
        System.out.println("Dc- Baseclass");
    }

    public BaseClass(String browser){
        System.out.println("Pc- Baseclass");
    }

    public String getBrowser(){
        return browser;

    }
    public  String setBrowser(String browser,boolean isAuth){

        if(isAuth){
            this.browser = browser;
        }else {
            System.out.println("Not allowed to use");
        }


        return browser;
    }
     void openBrowser(){
        System.out.println("opening Browser!");
    }
   void openBrowser(String browser){
        System.out.println("opening Browser!");
    }
   void closeBrowser(){
        System.out.println("close Browser!");
    }

}
