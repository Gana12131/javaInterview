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

        Practice p = new Practice();
        String out = p.r1(5);
        System.out.println(out);
    }

    public String r1(int limit){
        System.out.println("printing: "+limit);
        limit++;
        if(limit > 15){
            return "exceed max limit";
        }

        for(int i=0; i>-1; i++){
            System.out.println("print value "+i);
        }
        return r1(limit);
    }
}

@FunctionalInterface
interface MyInterface{
    int strLength(String input);
}
