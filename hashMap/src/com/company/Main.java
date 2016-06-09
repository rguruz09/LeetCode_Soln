package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

////      /* This is how to declare HashMap */
////        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
////
////      /*Adding elements to HashMap*/
////        hmap.put(12, "Chaitanya");
////
////        if(hmap.containsKey(12)){
////            System.out.println(hmap.get(12));
////            hmap.put()
////        }
////        hmap.put(2, "Rahul");
////        hmap.put(2, "Raghu");
////        hmap.put(7, "Singh");
////        hmap.put(49, "Ajeet");
////        hmap.put(3, "Anuj");
////
////      /* Display content using Iterator*/
////        Set set = hmap.entrySet();
////        Iterator iterator = set.iterator();
////        while(iterator.hasNext()) {
////            Map.Entry mentry = (Map.Entry)iterator.next();
////            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
////            System.out.println(mentry.getValue());
////        }
////
////      /* Get values based on key*/
////        String var= hmap.get(2);
////        System.out.println("Value at index 2 is: "+var);
////
////      /* Remove values based on key*/
////        hmap.remove(3);
////        System.out.println("Map key and values after removal:");
////        Set set2 = hmap.entrySet();
////        Iterator iterator2 = set2.iterator();
////        while(iterator2.hasNext()) {
////            Map.Entry mentry2 = (Map.Entry)iterator2.next();
////            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
////            System.out.println(mentry2.getValue());
////        }
////
//
//        int[] a = {1,2,3,1,2,3,4};
//        lonelyInteger(a);

        HashMap<Character, Boolean> hmap = new HashMap<Character, Boolean>();
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int ct = 0;
        String[] str = new String[count+1];

        
        String st;
        char[] arr;
        boolean exist;

        for (int i = 0; i <= count; i++) {
            str[i] = s.nextLine();
        }

        arr = str[1].toCharArray();

        for (int i = 0; i < arr.length; i++) {
            exist = true;
            for (int j = 2; j <= count ; j++) {
                if(str[j].indexOf(arr[i]) < 0 ){
                    exist = false;
                    break;
                }
            }
            if (exist == true) {
                ct++;
            }
        }

        System.out.println(ct);



//        for (int i = 2; i <= count; i++) {
//             st = str[i];
//            for (int j = 0; j < st.length() ; j++) {
//
//            }
//        }

//        for(int i = 0; i <str.length(); i++){
//            if(hmap.containsKey(str.charAt(i))){
//                hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
//            }else{
//                hmap.put(str.charAt(i),1);
//            }
//        }
//
//        Iterator it = hmap.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry pair = (Map.Entry)it.next();
//            if(  ((Integer) pair.getValue()) % 2 == 1 ){
//                ct ++ ;
//                if(ct > 1)
//                    break;
//            }
//            it.remove(); // avoids a ConcurrentModificationException
//        }
//
//        if(ct > 1)
//            System.out.println("NO");
//        else
//            System.out.println("YES");



    }


    static int lonelyInteger(int[] arr) {


        Scanner s = new Scanner(System.in);
        s.next();
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int count, key = 0;
        for(int i=0; i<arr.length; i++){
            if(hmap.containsKey(arr[i])){
                count = hmap.get(arr[i]);
                hmap.put(arr[i], count+1 );
            }else{
                hmap.put(arr[i], 1);
            }
        }

        for(int i=0; i<arr.length; i++){
            count = hmap.get(arr[i]);
            if(count % 2 == 1){
                key = arr[i];
                break;
            }
        }
        return key;
    }

}
