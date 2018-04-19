public class FooBarQix {

    public static String compute(int number){
        StringBuilder builder = new StringBuilder();
        divideAppender(number, builder);
        String s = String.valueOf(number);
        if(s.contains("5")){
            builder.append("Bar");
        }
        return builder.toString();
    }


    private static void divideAppender(int number, StringBuilder builder) {
        if(isDivisibleBy(number, 3)){
            builder.append("Foo");
        }
        if (number % 5 == 0){
            builder.append("Bar");
        }
        if(number % 7 == 0){
            builder.append("Qix");
        }
    }

    private static boolean isDivisibleBy(int dividend, int divider) {
        return (dividend % divider == 0);
    }

}
