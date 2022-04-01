import java.util.*;

class SWAP
{
    static void swap(SwapTwo stn)
    {
        int temp;
        temp = stn.one;
        stn.one = stn.two ;
        stn.two = temp;
        System.out.println("Inside Method");
        System.out.println("After Swaping \nn1="+a+"\nn2="+b);


    }


public static void main(String[] args) 
    {
        swap obj = new swap();
        {
            int n1 = 44,n2 = 90;
            obj.swapn(obj);
            System.out.println("Outside Method");
            System.out.println("After Swaping \nn1="+n1+"\nn2="+n2);
        }
    } 
}
