package co.com.bancolombia.certification.utestreto.task;

import co.com.bancolombia.certification.utestreto.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("Cristhian").into(Personal.FIRSTNAME),
                SendKeys.of("Ruiz").into(Personal.LASTNAME),
                SendKeys.of("cristhianruiz14@hotmail.com").into(Personal.EMAIL),
                SendKeys.of("September").into(Personal.MONTH),
                SendKeys.of("22").into(Personal.DAY),
                SendKeys.of("1984").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SISTEMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BUTTONLASTFINAL),
                SendKeys.of("Qwerasdf1234*").into(Complete.PASSWORD),
                SendKeys.of("Qwerasdf1234*").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BUTTONCOMPLETE)




        );
    }
    public static RegisterUserReto makeinformation(){
        return instrumented(RegisterUserReto.class);
    }
}
