package co.com.bancolombia.certification.utestreto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home
{
    public static final Target REGISTER = Target.the("register").
            locatedBy("//a[@class=\"login\"]");

}
