package Encapsulation;

import Encapsulation.Real.BaseClass;
import Encapsulation.Real.Testcase1;

public class Encap_Am {
    public static void main(String[] args) {
        Testcase1 tc1 = new Testcase1();
        tc1.setBrowser("chrome",true);
//        tc1.openBrowser();
//   openbrowser is a default method so we can't able to call it in different class of different package
        tc1.startTestCase();
    }
}
