package com.ammous.designpatterns.creational.scopeclass.simplefactory.exemple1;

/**
 * @author Rami Ammous
 */
public class PhoneFactory {

    public Phone makePhone(String type) {

        if (type.equalsIgnoreCase("Samsung"))
            return new Samsung();
        else if (type.equalsIgnoreCase("IPhone"))
            return new IPhone();
        else
        return null;
    }


}
