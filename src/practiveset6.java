public class practiveset6 {
    public static void main(String[] args) {
//        q 1
      /*  float[] marks = {12.2f,235.01f,51.3f,51.12f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("the value of sum is "+ sum);
         */
//        q 2
//        float[] marks = {45.7f,12.2f,235.01f,51.3f,51.12f};
//        float num = 45.7f;
//        boolean isInArray = false;
//        for (float element:marks) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("the value is present in the array");
//        }
//        else {
//            System.out.println("the value is not present in the array");
//        }

//        q 3
//        float[] marks = {12.2f,235.01f,51.3f,51.12f};
//        float sum = 0;
//        for (float element:marks){
//            sum = sum + element;
//        }
//        System.out.println("the value of average marks is sum is "+ sum/marks.length);

//        q 4

//        int [][] mat1 = {{1,2,3},
//                         {4,5,6}};
//        int [][] mat2 = {{2,6,13},
//                         {4,5,6}};
//
//        int [][] result = {{0,0,0},
//                           {0,0,0}};
//        for (int i=0; i<mat1.length;i++){ //row number of times
//            for (int j=0; j<mat1[i].length;j++){ //colum number of time
//                System.out.format("setting value for i=%d and j=%d \n",i,j);
//                result[i][j] = mat1[i][j]+mat2[i][j];
//            }
//        }
//        // printing the elements of a 2-D array
//        for (int i=0;i<mat1.length;i++){ //row number of times
//            for (int j=0;j<mat1[i].length;j++){ // column number of times
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j]+mat2[i][j];
//            }
//            System.out.println(" ");
//        }

//        q -5
//        int [] arr = {1,2,3,4};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//        for (int i=0; i<n; i++){
//            //swap[i] and a{l-1-i}
//            // a  b  temp
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for (int element: arr){
//            System.out.println(element);
//        }

//        q 6
//        int [] arr = {2,5,6,8,7,-9,1,411};
//        int max = Integer.MIN_VALUE;
//        for (int e:arr){
//            if (e>max){
//                max = e;
//            }
//        }
//        System.out.println("teh max value of element in this array is:" +max);
////               q - 7
////        System.out.println(Integer.MIN_VALUE);
////        System.out.println(Integer.MAX_VALUE);

//        q - 8
        boolean isSorted = true;
        int [] arr = {56,965,5623,455623,95623485};
        for (int i=0;i<arr.length-1;i++){
          if(arr[i]>arr[i+1]){
              isSorted = false;
              break;
          }
        }
        if (isSorted){
            System.out.println("this array is sorted");
        }
        else{
            System.out.println("this array is not sorted");
        }
    }
}
