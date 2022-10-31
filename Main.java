public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Cat Cat1 = new Cat();
        count++;
        System.out.println(Cat1);
        System.out.print(Cat1.isFat());
        System.out.println();
        Cat Cat2 = new Cat("Marsik", 7, "red", 11);
        count++;
        System.out.println(Cat2);
        System.out.print(Cat2.isFat());
        System.out.println();
        System.out.println("Total number of cats is " + count);
        System.out.println("My cat's name is " + Cat2.catName + ". " + "He is " + Cat2.catAge + ". " + "He is " + Cat2.catColor + ". " + "He weights " + Cat2.catWeight + " kilos.");
    }

    }


