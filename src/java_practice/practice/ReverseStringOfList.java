package java_practice.practice;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReverseStringOfList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mouni","bujji","sri");
        System.out.println(reverseListOfString(list));
        System.out.println(reversListStringUsingStringBuilder(list));
        System.out.println(reverseUsingJava8(list));
        System.out.println(reverseUsingJava8Builder(list));

    }

    private static List<String> reverseListOfString(List<String> list ){
        List<String> newList = new ArrayList<>();
        for(String s: list){
            newList.add(reverse(s));
        }
        //reverse the list
        List<String> newList1 = new ArrayList<>();
        for(int i=newList.size();i>0;i--){
            newList1.add(newList.get(i-1));
        }
        System.out.println(newList1);
        return newList;
    }
    private static String reverse(String str){

        StringBuilder sb = new StringBuilder();
        char[] ch=str.toCharArray();
        int max=ch.length-1;
        for(int i=0; i<ch.length/2; i++){
            char temp = ch[i];
            ch[i]=ch[max];
            ch[max]=temp;
            max--;
        }
        sb.append(ch);
        return sb.toString();
    }

    private static List<String> reversListStringUsingStringBuilder(List<String> list){
        List<String> reversedString = new ArrayList<>(list.size());

        for(String str: list){
            reversedString.add(new StringBuilder(str).reverse().toString());
        }
        return reversedString;
    }

    private static List<String> reverseUsingJava8(List<String> list){
        return list.stream().map(ReverseStringOfList::reverse).collect(Collectors.toList());
    }

    private static List<String> reverseUsingJava8Builder(List<String> list){
        return list.stream().map(s-> new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
    }
}
