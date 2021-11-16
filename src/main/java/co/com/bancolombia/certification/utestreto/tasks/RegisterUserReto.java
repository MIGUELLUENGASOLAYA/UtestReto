package co.com.bancolombia.certification.utestreto.tasks;

import co.com.bancolombia.certification.utestreto.userinterfaces.Home;
import co.com.bancolombia.certification.utestreto.userinterfaces.Personal;
import co.com.bancolombia.certification.utestreto.userinterfaces.PersonalSecond;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("DSFXGCHJBMKL@hotmail.com").into(Personal.EMAIL),
                Click.on(Personal.NEXT),
                Click.on(PersonalSecond.FILTRO),
                SendKeys.of("Miguel").into(PersonalSecond.FIRSTNAME),
                SendKeys.of("Luengas").into(PersonalSecond.LASTNAME),
                SendKeys.of("12345*").into(PersonalSecond.PASSWORD),
                Click.on(PersonalSecond.DAY),
                Click.on(PersonalSecond.DAYSPE),
                Click.on(PersonalSecond.MONTH),
                Click.on(PersonalSecond.MONTHSPE),
                Click.on(PersonalSecond.YEAR),
                Click.on(PersonalSecond.YEARSPE),
                SendKeys.of("Miguel").into(PersonalSecond.FIRSTNAME2),
                SendKeys.of("acuña").into(PersonalSecond.LASTNAME2),
                SendKeys.of("street 45").into(PersonalSecond.ADDRESS),
                SendKeys.of("texas").into(PersonalSecond.CITY),
                Click.on(PersonalSecond.STATE),
                Click.on(PersonalSecond.STATESPE),
                SendKeys.of("12345").into(PersonalSecond.POSTCODE),
                Click.on(PersonalSecond.COUNTRY),
                Click.on(PersonalSecond.COUNTRYSPE),
                SendKeys.of("12345").into(PersonalSecond.PHONE),
                SendKeys.of("HIT@hotmail.com").into(PersonalSecond.ADDRESS2),
                Click.on(PersonalSecond.NEXT2)
        );
    }
    public static RegisterUserReto makeinformation()
    {
        return instrumented(RegisterUserReto.class);
    }
}
