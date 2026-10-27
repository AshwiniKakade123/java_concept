public class dowhiledemo {
    public static void main(String[] args) {

         int a = 1;
        System.out.println("Display 1 to 10  no: ");
       do
        {
            System.out.println(a);
            a++;
        }  while (a <=10);

        int i = 1;
        System.out.println("Display even no betn 1 to 10: ");
        do{
            if(i % 2 == 0)
            {
                System.out.println(i);
                
            }i++;
        }while(i <= 10);
    }
    
}
