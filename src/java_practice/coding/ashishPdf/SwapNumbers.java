package java_practice.coding.ashishPdf;

public class SwapNumbers {

    public static void main(String[] args) {
        // task: swap 2 numbers
        // ex: int a=4; int b=5
        // result should be a=5, b=4
        int a=4;
        int b=5;

        int temp = a;
        a=b;
        b=temp;

        System.out.println("a value is "+a);
        System.out.println("b value is "+b);

        //without using 3rd variable

        int x=6;
        int y=7;

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("x value is "+x);
        System.out.println("y value is "+y);

        int p=112, q=231, r=432;
        //p =432, q=112, r=231

        int temp1 =r;
        r=p;
        p=q;
        q=temp1;

        System.out.println("p value is "+p);
        System.out.println("q value is "+q);
        System.out.println("r value is "+r);


        int m=6, n=7, o=8;

        m=m+n+o;
        n=m-(n+o);
        o=m-(n+o);
        m=m-(n+o);


        System.out.println("m value is "+m);
        System.out.println("n value is "+n);
        System.out.println("o value is "+o);

    }
}
