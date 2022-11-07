package day37_static.BestBuy;

public class bestBuyStores {
    public static void main(String[] args) {

        // BestBuy.location = "Fairfax"; // location is an instance variable, so we need an object in order to access
        bestBuy store1 = new bestBuy();
        store1.location = "Fairfax";
        System.out.println(store1.location);

        System.out.println(bestBuy.headquarters); // this is a static variable, which means we can use the class name to access
        System.out.println(store1.headquarters); // this is valid syntax, but you should use the class name to access, but instance references

        // other static members
        System.out.println(Math.PI); // PI is static
        System.out.println(Integer.MIN_VALUE); // min value is tatic

        //Arrays.sort(); accessing static method from Arrays class

    }


}
