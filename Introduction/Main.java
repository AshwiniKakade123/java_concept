class Main{
    public static void main(String[] args) {
       System.out.println("Hello I Am Ashwini");
       System.out.println("Hello I Am Radha");

       int a=10;
       double b=1.5;
       char c='A';
       System.out.println("Your integer number is "+a);
       System.out.println("Your floating number is "+b);
       System.out.println("Your character is "+c);

       int num1 =10;
       int num2 =5;
       System.out.println("*******Arithmatic Opretors********");
       System.out.println("Addition: "+(num1+num2));
       System.out.println("Subtraction: "+(num1-num2));
       System.out.println("Multiplication: "+(num1*num2));
       System.out.println("Division: "+(num1/num2));
       System.out.println("Modulas: "+(num1%num2));

       System.out.println("******Relational opretors*******");
       System.out.println("Less than: "+(num1<num2));
       System.out.println("Greter than: "+(num1>num2));
       System.out.println("Less than equal to: "+(num1<=num2));
       System.out.println("Greter than equal to: "+(num1>=num2));
       System.out.println("equal to equal to: "+(num1==num2));

       System.out.println("******Logical opretors*******");
       System.out.println("Logical AND(Both sides are true than logical AND is true otherwise false): "+(num1 & num2));
       System.out.println("Logical OR(Both sides are false than logical OR is false otherwise true): "+(num1 | num2));
       System.out.println("(): "+(num1 & num2));

       boolean isashu = false;
       System.out.println(!isashu);

       int num =3;
       int result = num++;
       int result1 = ++num;
       System.out.println("Post Increment(first featch the value then increase):"+result);
       System.out.println(num);

       System.out.println("pre Increment(first increase the value then print:)"+result1);
       System.out.println(num);

       System.out.println("Post Decrement(first featch the value then Decrease):"+result);
       System.out.println(num);

       System.out.println("pre Decrement(first decrease the value then print:)"+result1);
       System.out.println(num);
    


    }
}
