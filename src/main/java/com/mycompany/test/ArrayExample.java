package com.mycompany.test;



public class ArrayExample {


//    byte[] arr = {};
//
//    int[] ars = new int[2];
//    int arss[] = new int[1];
//
//    int[] arrs = new int[5];
//
//    {
//
//        arrs[0] = 10;
//        arrs[1] = 20;
//        arrs[2] = 30;
//        arrs[3] = 40;
//        arrs[4] = 50;
//
//
//    }



    public static void main(String[] args) {
//
//        ArrayExample ar = new ArrayExample();
//
//        for (int ard: ar.arrs){
//            System.out.println(ard);
//        }
//
//
//        String[]  city ={"Dhaka", "Sylhet", "Khulna", "Chottogram"};
//
//        for (String cities: city){
//
//            System.out.println(cities);
//        }
//
//        int[] arry = {500,300};
//
//        m(arry);


//        int[] arsy = {50,456,5,69,62,32};
//
//        maax(arsy);
//
//
//
//                for(int b: new int[]{2,6,54}){
//                    System.out.println(b);
//        }
//
//
//    }
//
//    private static void maax(int[] arsy) {
//
//        int max = arsy[0];
////        System.out.println(max);
//
//        for (int i =1; i<arsy.length; i++){
//
//            if (max<arsy[i]){
//                max =arsy[i];
//            }
//        }
//        System.out.println(max);

//
//        int arr[] = {2,5,6};
//        String st[] = {"Radio", "TV"};
//        Class name = st.getClass();
//        String string = name.getName();
//        System.out.println(string);

//        char[] copyFrom = {'d','e','r','a','n','a','b','b','d'};
//        char[] toCopy = new char[4];
//        System.arraycopy(copyFrom,2,toCopy,0,4);
//        System.out.println(String.valueOf(toCopy));

//        int[] arry = {20,5,63,52,50};
//
//        maxArry(arry);

//        int[][] marry= new int[2][3];
//            marry[0][0] =20;
//            marry[0][1] =30;
//            marry[0][2] =40;
//            marry[1][0] = 50;
//            marry[1][1] = 60;
//            marry[1][2] = 70;
//
//            for (int[] row:marry){
//                    for (int value: row){
//                        System.out.print(value+ " ");
//                    }
//
//                System.out.println();
//            }




//        int [][][][]multiarr = new int[2][3][4][5];
//
//        int [][][][] m =
//                {
//                        {
//                                {{10,20,30,40,50},{20,30,40,50,60},{30,70,80,90,100},{40,50,60,70,80}},
//                                {{10,20,30,40,50},{20,30,40,50,60},{30,70,80,90,100},{40,50,60,70,80}},
//                                {{10,20,30,40,50},{20,30,40,50,60},{30,70,80,90,100},{40,50,60,70,80}}
//                        },
//                        {
//                                {{10,20,30,40,50},{20,30,40,50,60},{30,70,80,90,100},{40,50,60,70,80}},
//                                {{10,20,30,40,50},{20,30,40,50,60},{30,70,80,90,100},{40,50,60,70,80}},
//                                {{10,20,30,40,50},{20,30,40,50,60},{30,70,80,90,100},{40,50,60,70,80}}
//                        }
//                };
//
//
//
//        for (int i = 0; i < m.length; i++) { // Iterate over the 1st dimension (layer)
//            System.out.println("Layer " + i + ":");
//            for (int j = 0; j < m[i].length; j++) { // Iterate over the 2nd dimension (row in layer)
//                System.out.println("  Row " + j + ":");
//                for (int k = 0; k < m[i][j].length; k++) { // Iterate over the 3rd dimension (column in row)
//                    System.out.print("    Column " + k + ": ");
//                    for (int l = 0; l < m[i][j][k].length; l++) { // Iterate over the 4th dimension (value in column)
//                        System.out.print(m[i][j][k][l] + " ");
//                    }
//                    System.out.println(); // Move to the next line after printing a column
//                }
//                System.out.println(); // Add a blank line after each row for better readability
//            }
//            System.out.println(); // Add a blank line after each layer for better readability
//        }

//
//        int[][] arr = {{23,50,60},{50,60,50}};
//
//        int []a = {500,20,60,50};
//        int []b = a.clone();
//
//        System.out.println(a == b);




//                System.arraycopy(a,0,b,0,a.length);
//

//                for (int value: b){
//                    System.out.print(value+" ");
//          }


//        int[] a = {10,20,30};
//        int[] b = {10,20,30};
//
//        int[] c = new int[a.length];
//
//        for (int i = 0; i<a.length; i++){
//            for (int j = 0; j<b.length; j++){
//                c[i]= a[i]*b[i];
//            }
//                System.out.print(c[i] +" ");
//
//        }




        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{1,2,3},{4,5,6}};

            int[][] c = new int[2][3];
        System.out.println(c.length);
        for (int i= 0; i<a.length; i++){
            for (int j = 0; j< a[0].length; j++){
                    c[i][j] = a[i][j]*b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }





//        for (int dr: c){
//            System.out.print(dr+" ");
//        }



//        int length = a.length;
//        int index = 0;

//        while (index<length){
//            System.out.print(a[index]+" ");
//            index++;
//        }


       /* do {
            System.out.print(a[index]+" ");
            index++;
        }while (index<length);
*/
//        row:
//        for (int i = 0; i< arr.length; i++ ){
//            column:
//            for (int j = 0; j< arr[0].length; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

//        for (int[] row: arr){
//
//            for (int value:row){
//                System.out.print(value +" ");
//            }
//            System.out.println();
//        }





//        multiarr[1][0] = 50;
//        multiarr[1][1] = 40;
//        multiarr[1][2] = 30;
//        multiarr[1][3] = 20;
//        multiarr[1][4] = 10;
//
//        multiarr[2][0] = 60;
//        multiarr[2][1] = 60;
//        multiarr[2][2] = 60;
//        multiarr[2][3] = 60;
//        multiarr[2][4] = 60;

//        System.out.println(multiarr.length);
//        System.out.println(multiarr[0].length);


//        for (int [][]row: multiarr){
//
//            for ( int value: row){
//                System.out.print(value +" ");
//            }
//            System.out.println();
//        }




    }

    private static void maxArry(int[] arry) {

        int max = arry[0];

        for (int i =1; i<arry.length; i++){

            if (max<arry[i]){
                max = arry[i];
            }

        }
        System.out.println(max);

    }

    private static void m(int[] arry) {

//        int min = arry[0];
//
//
//        for (int i = 1; i< arry.length; i++){
//
//            if (min>arry[i]){
//                min = arry[i];
//            }
//        }
//        System.out.println(min);
//
    }

}
