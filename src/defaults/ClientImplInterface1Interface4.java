package defaults;

public class ClientImplInterface1Interface4 implements Interface1, Interface4 {

    //if Both interface have similar method then java will confule which method i have to use
    //so we need to override the method here
    public void method1(){
        System.out.println("Interface1.method1");
    }
}
