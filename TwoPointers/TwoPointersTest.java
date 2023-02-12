package TwoPointers;

public class TwoPointersTest {
    

    public static void main(String[] args)throws NumberFormatException {
        int x;
        if(args!=null)
            if (args.length>0)
                x=Integer.parseInt(args[0]);
            else return;
        else return;


        System.out.println(isSrictlyPalindrom(x));

        
        




            
    }

    public static boolean isSrictlyPalindrom(int x){
        if (x<10)
            return false;

        String dec = String.valueOf(x);
        String bin=Integer.toBinaryString(x);
        String oct=Integer.toOctalString(x);
        //two pointers 
        char p1,p2;
        System.out.printf("%s %s %s",dec,bin,oct);
        for (int i=0;i<dec.length();i++){
            p1=dec.charAt(i);
            p2=dec.charAt(dec.length()-i-1);
            if (p1!=p2)
                return false;
        }

        for (int i=0;i<bin.length();i++){
            p1=bin.charAt(i);
            p2=bin.charAt(bin.length()-i-1);
            if (p1!=p2)
                return false;
        }

        for (int i=0;i<oct.length();i++){
            p1=oct.charAt(i);
            p2=oct.charAt(oct.length()-i-1);
            if (p1!=p2)
                return false;
        }

        return true;

    }
}
