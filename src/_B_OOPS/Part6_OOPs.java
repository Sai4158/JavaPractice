package _B_OOPS;

class ShopPart6 {

    String hi = "HI";

    class Shop1 {
        String check = "123";
    }
}

public class Part6_OOPs {

    public static void main(String[] args) {

        ShopPart6 branch1 = new ShopPart6();
        System.out.println(branch1.hi);

        ShopPart6.Shop1 innerObj = branch1.new Shop1();
        System.out.println(innerObj.check);
    }
}
