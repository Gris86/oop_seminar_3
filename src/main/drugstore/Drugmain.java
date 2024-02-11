package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.*;

public class Drugmain {
    public static void printSortedPharmacy(List<Pharmacy> pList) {
        pList.sort(Comparator.naturalOrder());
        for (int i = 0; i < pList.size(); i++) {
            System.out.println(pList.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);

        List<Pharmacy> list = new ArrayList<>();

        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, azitronite);
        list.add(p1);

        Pharmacy p2 = new Pharmacy();
        p2.addComponents(penicillin, water);
        list.add(p2);

        Pharmacy p3 = new Pharmacy();
        p3.addComponents(azitronite, penicillin);
        list.add(p3);

        printSortedPharmacy(list);

        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c : p2) {
//            System.out.println(c);
//        }

    }
}
