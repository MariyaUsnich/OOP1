class Cat {
    String catName;
    int catAge;
    String catColor;
    static double catWeight;


    public Cat() {
        catName = "New Cat";
        catAge = 0;
        catColor = "Default";
        catWeight = 0;
    }

    public Cat(String _catName, int _catAge, String _catColor, double _catWeight) {
        catName = _catName;
        catAge = _catAge;
        catColor = _catColor;
        catWeight = _catWeight;
    }

    public String toString() {
        String returnString = (catName + ", " + catAge + ", " + catColor + ", " + catWeight);
        return returnString;
    }
    public static boolean isFat(){
        if (catWeight > 10.0)
        return true;
        else return false;
    }
    }








