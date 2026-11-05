package com.mycompany.yasuniexplora;

import com.mycompany.yasuniexplora.implementacion.ImplementationRegularTour;
import com.mycompany.yasuniexplora.interfaces.InterfazRegularTour;
import com.mycompany.yasuniexplora.objetos.RegularTour;

public class YasuniExplora {

    public static void main(String[] args) {

        RegularTour regularTour = new RegularTour(1, "limoncocha");
        InterfazRegularTour regularTour1 = new ImplementationRegularTour();

        regularTour1.showInfo();

    }
}
