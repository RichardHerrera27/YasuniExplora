package com.mycompany.yasuniexplora.implementacion;

import com.mycompany.yasuniexplora.interfaces.InterfazRegularTour;

public class ImplementationRegularTour implements InterfazRegularTour {

    @Override
    public String showInfo() {
        System.out.println("mensaje exitosos");
        return "";
    }
}
