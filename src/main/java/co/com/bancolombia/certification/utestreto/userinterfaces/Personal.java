package co.com.bancolombia.certification.utestreto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Personal
{
    public static final Target EMAIL = Target.the("email").
            locatedBy("//input[@class=\"is_required validate account_input form-control\"]");
    public static final Target NEXT = Target.the("next").
            locatedBy("//button[@class=\"btn btn-default button button-medium exclusive\"]");
}
