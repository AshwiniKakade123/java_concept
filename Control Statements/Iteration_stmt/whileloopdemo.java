public class whileloopdemo {
    public static void main(String[] args) {

        int a = 1;
        System.out.println("Display 1 to 10  no: ");
        while (a <=10) {
            System.out.println(a);
            a++;
        }

        //print even number.
        int i = 1;
        System.out.println("Display even no betn 1 to 10: ");
        while (i <= 10)
        {
            if(i % 2 == 0)
            {
                 System.out.println(i);  
            }i++;
        }
    }
    
}
