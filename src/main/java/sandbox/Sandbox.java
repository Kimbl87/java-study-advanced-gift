package sandbox;

import sandbox.staff.Pen;
import sandbox.staff.Pencil;
import sandbox.staff.Staff;

public class Sandbox {
    public static void sandbox() {
        System.out.println("Запущен класс для эксперементов");
        Pen pen1 = new Pen("Pen1", 19.9, "some pen");
        Pencil pencil1 = new Pencil("Pencil1", 10.99,"10l");
        Pencil pencil2 = new Pencil();
        pencil2.setSize("10k");
        pencil2.setBrand("Pencil2");
        pencil2.setPrice(10.10);
        Staff [] box = {pen1, pencil1, pencil2};
        for (Staff someStaff: box){
            System.out.println(someStaff.toString());
        }
    }
}
