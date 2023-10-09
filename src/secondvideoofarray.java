public class secondvideoofarray {
    public static void main(String[] args) {
        int[] marks = {52,5,3,8,96};
//        float [] marks = {54.023f,62.5f,623.02f};
//        String [] student = {"rahul","sachin","prince","ankit","aryan","saif"};
//        System.out.println(marks[2]);
//        System.out.println(marks.length);

//        displaying the array (naive way)
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

////        for loop
//        for (int i=0;i<marks.length;i++) {
//            System.out.println(marks[i]);
//        }
////        quick quiz
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
//        for each loop
//        for (int element:marks){
//            System.out.println(element);
//        }
    }
}
