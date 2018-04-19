class FooBarQix {

    private static final String FOO = "Foo";
    private static final String BAR = "Bar";
    private static final String QIX = "Qix";

    static String compute(int number){
        return divideAppender(number) + containsAppender(number);
    }

    private static String containsAppender(int number) {
        String s = String.valueOf(number);

        return appendCountedChars(s, FOO, '3') +
                appendCountedChars(s, BAR, '5') +
                appendCountedChars(s, QIX, '7');
    }

    private static String appendCountedChars(String value, String toAppend, char toBeCounted) {
        StringBuilder builder = new StringBuilder();
        long count = getCharCount(value, toBeCounted);
        for(int i = 0; i < count; i++){
            builder.append(toAppend);
        }
        return builder.toString();
    }

    private static long getCharCount(String string, char toBeCounted) {
        return string.chars()
                .filter(value -> value == toBeCounted)
                .count();
    }


    private static String divideAppender(int number) {
        StringBuilder builder = new StringBuilder();
        if(isDivisibleBy(number, 3)){
            builder.append(FOO);
        }
        if (isDivisibleBy(number, 5)){
            builder.append(BAR);
        }
        if(isDivisibleBy(number, 7)){
            builder.append(QIX);
        }
        return builder.toString();
    }

    private static boolean isDivisibleBy(int dividend, int divider) {
        return (dividend % divider == 0);
    }

}
