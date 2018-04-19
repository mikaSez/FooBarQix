public class FooBarQix {

    public static String compute(int number){
        if(number % 3 == 0){
            return "Foo";
        }
        if (number % 5 == 0){
            return "Bar";
        }
        if(number % 7 == 0){
            return "Qix";
        }
        return "";
    }

}
