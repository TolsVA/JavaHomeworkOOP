package org.example.homework_3;

import org.example.homework_3.pharmacy.Medicine;

import org.example.homework_3.pharmacy.Medicine2;
import org.example.homework_3.pharmacy.MedicineComponent;
import org.example.homework_3.pharmacy.impl.Asitromin;
import org.example.homework_3.pharmacy.impl.Penicilinium;
import org.example.homework_3.pharmacy.impl.Vetbicid;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Asitromin asitr = new Asitromin("Asitro", 50, 10);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);
        Medicine medicine = new Medicine();
        medicine.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);

        while (medicine.hasNext()) {
            System.out.println(medicine.next());
        }

        medicine.resetPointer();

        Iterator<MedicineComponent> iterator = medicine;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Medicine2 medicineTwo = new Medicine2();
        medicineTwo.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);

        for (MedicineComponent medicineComponent : medicineTwo) {
            System.out.println(medicineComponent);
        }

        medicineTwo.resetPointer();

        Iterator<MedicineComponent> iterator2 = medicineTwo.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println(medicineTwo.getComponents());

        Collections.sort(medicineTwo.getComponents());

        System.out.println(medicineTwo.getComponents());

        medicineTwo.getComponents().sort((comp1, comp2) -> (int) (comp1.getWeight() - comp2.getWeight()));

        System.out.println("----------------------------------------!!!");

        Medicine medicine1 = new Medicine();
        medicine1.addComponent(new Asitromin("Asitro", 40, 60))
//                .addComponent(new Penicilinium("Penicil", 10, 40))
                .addComponent(new Vetbicid("Vetbic", 30, 20));

        Medicine medicine2 = new Medicine();
        medicine2.addComponent(new Asitromin("Asitro", 80, 100));
//                .addComponent(new Penicilinium("Penicil", 20, 30))
//                .addComponent(new Vetbicid("Vetbic", 20, 10));
        List<Medicine> list = new ArrayList<>(List.of(medicine, medicine1, medicine2));

        System.out.println("Не отсортирован");
        System.out.println(list);

        System.out.println("\nОтсортирован по сумме весов");
        Medicine.compareToWeight(list);
        System.out.println(list);

        System.out.println("\nОтсортирован по сумме сил");
        Medicine.compareToPower(list);
        System.out.println(list);

        System.out.println("\nОтсортирован по обшей сумме вес плюс сила");
        Medicine.compareToWeightToPower(list);
        System.out.println(list);

        System.out.println("\nОтсортирован по размеру листа");
        Collections.sort(list);
        System.out.println(list);
    }
}
