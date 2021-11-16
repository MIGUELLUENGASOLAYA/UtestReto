package co.com.bancolombia.certification.utestreto.userinterfaces;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class PersonalSecond
{
    public static final Target FILTRO = Target.the("filtro").
            locatedBy("//input[@id=\"id_gender1\"]");
    public static final Target FIRSTNAME = Target.the("firstname").
            locatedBy("//input[@id=\"customer_firstname\"]");
    public static final Target LASTNAME = Target.the("lastname").
            locatedBy("//input[@id=\"customer_lastname\"]");
    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"passwd\"]");
    public static final Target DAY = Target.the("day").
            locatedBy("//select[@id=\"days\"]");
    public static final Target DAYSPE = Target.the("dayspe").
            locatedBy("(//option[@value=\"1\"])[1]");
    public static final Target MONTH = Target.the("month").
            locatedBy("//select[@id=\"months\"]");
    public static final Target MONTHSPE = Target.the("monthspe").
            locatedBy("(//option[@value=\"1\"])[2]");
    public static final Target YEAR = Target.the("year").
            locatedBy("//select[@id=\"years\"]");
    public static final Target YEARSPE = Target.the("yearspe").
            locatedBy("//option[@value=\"1998\"]");
    public static final Target FIRSTNAME2 = Target.the("firstname2").
            locatedBy("//input[@id=\"firstname\"]");
    public static final Target LASTNAME2 = Target.the("lastname2").
            locatedBy("//input[@id=\"lastname\"]");
    public static final Target ADDRESS = Target.the("adress").
            locatedBy("//input[@id=\"address1\"]");
    public static final Target CITY = Target.the("city").
            locatedBy("//input[@id=\"city\"]");
    public static final Target STATE = Target.the("state").
            locatedBy("//div[@id=\"uniform-id_state\"]");
    public static final Target STATESPE = Target.the("statespe").
            locatedBy("(//option[@value=\"1\"])[3]");
    public static final Target POSTCODE = Target.the("postcode").
            locatedBy("//input[@id=\"postcode\"]");
    public static final Target COUNTRY = Target.the("country").
            locatedBy("//div[@id=\"uniform-id_country\"]");
    public static final Target COUNTRYSPE = Target.the("countryspe").
            locatedBy("(//option[@value=\"21\"])[3]");
    public static final Target PHONE = Target.the("phone").
            locatedBy("//input[@id=\"phone_mobile\"]");
    public static final Target ADDRESS2 = Target.the("address2").
            locatedBy("//input[@id=\"alias\"]");
    public static final Target NEXT2 = Target.the("next2").
            locatedBy("//button[@id=\"submitAccount\"]");

    //input[@id="firstname"]
    //input[@id="lastname"]
    //input[@id="address1"]
    //input[@id="city"]
    //div[@id="uniform-id_state"]
   // (//option[@value="1"])[3]
    //input[@id="postcode"]
    //div[@id="uniform-id_country"]
           // (//option[@value="21"])[3]
    //input[@id="phone_mobile"]
    //input[@id="alias"]
    //button[@id="submitAccount"]




}
