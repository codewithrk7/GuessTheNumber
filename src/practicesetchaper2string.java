public class practicesetchaper2string {
    public static void main(String[] args) {
//        Problem 1/
        String name = "Jack parker";
        name = name.toLowerCase();
        System.out.println(name);
//        problem 2
        String text = "To lower case";
        text = text.replace(" ", "_");
        System.out.println(text);
//        problem 3
        String letter = "Dear <|name|>, thanks a lot!";
       letter =  letter.replace("<|name|>","Harry");
        System.out.println(letter);
//        problem 4
        String my = "This string contains       Double and tripe spaces";
        System.out.println(my.indexOf("    "));
        System.out.println(my.indexOf("      "));
//        problem 5
        String letter2 = "Dear Harry,\n\tThis java course is nice.\nthanks! ";
        System.out.println(letter2);

    }
}
