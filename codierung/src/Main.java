import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        char ch=' ';
        int  x=0;
        char w='j';
        String by="";
        String bi="";
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\nAlphanumerische Codes anzeigen");
        while(w=='j'){
            System.out.println("---------------------------------------------------");
            System.out.print("Buchstaben (CHAR) eingeben: ");
            ch=sc.next().charAt(0);
            x=ch;
            by=Integer.toHexString(x);
            bi=Integer.toBinaryString(x);
            System.out.println("CHAR:"+ch+"  DEZ:"+x+"  HEX:"+by+"  BIN:"+bi);
            System.out.print("Weiter? [j/n] ");
            w=sc.next().charAt(0);
        }
    }
}