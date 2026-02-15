package _B_OOPS;

class Owner {
    String name = "Sai";
}

interface SupplierName {
    String supplierName = "UPP";
    String supplierName1 = "xcss";
    String supplierName2 = "MCS";
}

class Shop extends Owner implements SupplierName {
}

class Room extends Shop {
    int roomNo = 3;
    int noOfChairs = 2;
}

public class Part5 {
    public static void main(String[] args) {

        Room r = new Room();

        // print room info
        System.out.println(r.roomNo);
        System.out.println(r.noOfChairs);

        // print owner name (from Owner class)
        System.out.println(r.name);

        // print supplier name (from interface)
        System.out.println(r.supplierName1);
        System.out.println(r.supplierName2);
        System.out.println(r.supplierName);
    }
}
