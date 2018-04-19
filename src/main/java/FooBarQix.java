public class FooBarQix {

    public static String compute(int number){
        StringBuilder builder = new StringBuilder();
        if(number % 3 == 0){
            builder.append("Foo");
        }
        if (number % 5 == 0){
            builder.append("Bar");
        }
        if(number % 7 == 0){
            builder.append("Qix");
        }
        return builder.toString();
    }

}
