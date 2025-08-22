package java_practice._21DayChallenge.day5;

public class Practice {
    public static void main(String[] args) {

        //custom functional interface implementation
        MyInterface in = String::length; // i->i.length();
        System.out.println(in.strLength("dfejd"));

        //reverse a string
        String word = "Reverse";
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse().toString());

        char[] ch = word.toCharArray();
        StringBuilder rev = new StringBuilder();
        for(int i=ch.length-1; i>=0; i--) {
            rev.append(ch[i]);
        }
        System.out.println(rev.toString());
    }

    public String r1(){
        int i =1;
        System.out.println("printing "+ i++);
        return r1();
    }
}

@FunctionalInterface
interface MyInterface{
    int strLength(String input);
}
