import java.util.Locale;

public class javamethodvideo14 {
    public static void main(String[] args) {
        String name = "Rahul";
        System.out.println(name);
//        Length method
        int value = name.length();
        System.out.println(value);
//        tolowercase method
        String ls = name.toLowerCase();
        System.out.println(ls);
//        To uppercase method
        String uc = name.toUpperCase();
        System.out.println(uc);
//        trim method
       String nontrimestring= "     rahul      ";
//        System.out.println(nontrimestring);
        System.out.println(nontrimestring.trim());
//        name. substring method
        System.out.println(name.substring(2));
//        substring(int short , int end)
        System.out.println(name.substring(3,5));
//        name.replace
        System.out.println(name.replace('R','p'));
        System.out.println(name.replace("Rahul","Pahun"));
        System.out.println(name.replace("R","For"));
//        startswith
        System.out.println(name.startsWith("Rah"));
//        endswith
        System.out.println(name.endsWith("ul"));
//        name.charAt
        System.out.println(name.charAt(3));
//
//        index of all string
        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry",4));
        System.out.println(modifiedName.lastIndexOf("rry",4));
//        equals method
        System.out.println(name.equals("Rahul"));
        System.out.println(name.equalsIgnoreCase("raHUl"));
//        Escape sequence characters
        System.out.println("I am escape sequence \" double quote");
        System.out.println("rahul\\kumar");
        System.out.println("rahul\nkumar");
        System.out.println("rahul\tkumar");

    }
}
