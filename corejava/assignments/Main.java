class Main
{
    public static void main(String []args)
    {
        int a = 12, b = 21; //Variable declaration.
        System.out.println("\nvalue of a : "+12+" & value of b : " +b);

        System.out.println("\nArithmetic operators");
        System.out.println("a+b = "+(a+b));  //Addition.
        System.out.println("a-b = "+(a-b));  //Subtraction.
        System.out.println("a*b = "+(a*b));  //Multiplication.
        System.out.println("a/b = "+(a/b));  //Division.
        System.out.println("a%b = "+(a%b));  //Modulus.

        System.out.println("\nAssignment operators ");
        int var;
        var = a;
        System.out.println("using = operator; var = a : "+var);
        var+=a;
        System.out.println("using += operator; var+=a : "+var);
        var*=a;
        System.out.println("using *= operator; var*=a : "+var);
        var-=a;
        System.out.println("using -= operator; var-=a : "+var);
        var/=a;
        System.out.println("using /= operator; var/=a : "+var);
        var%=a;
        System.out.println("using %= operator; var%=a : "+var);
        var&=a;
        System.out.println("using &= operator; var&=a : "+var);
        var^=a;
        System.out.println("using ^= operator; var^=a : "+var);
        var<<=a;
        System.out.println("using <<= operator; var<<=a : "+var);
        var>>=a;
        System.out.println("using >>= operator; var>>=a : "+var);
        var>>>=a;
        System.out.println("using >>>= operator; var>>>=a : "+var);

        System.out.println("\nunary operators");
        int result1, result2;
        System.out.println("prefex--------------");
        System.out.println("value of a : "+a);
        result1 = ++a;     //increment operator.
        System.out.println("value of a after increment (++a) : "+result1);
        System.out.println("value of b : "+b);
        result2 = --b;      //decrement operator
        System.out.println("value of b after decrement (--b) : "+result2);

        System.out.println("\npostfix--------------");
        System.out.println("value of a : "+a);
        result1 = a++;     //increment operator.
        System.out.println("value of a after increment (++) : "+result1);
        System.out.println("value of b : "+b);
        result2 = b--;      //decrement operator
        System.out.println("value of b after decrement (--) : "+result2);


        System.out.println("\nrelational operators");
        System.out.println("value of a : "+a+" & value of b : "+b);
        //==operator
        System.out.println(a==b);
        //!=operator
        System.out.println(a!=b);
        //>operator
        System.out.println(a>b);
        //< operator
        System.out.println(a<b);
        //>= operator
        System.out.println(a>=b);
        //<=operator
        System.out.println(a<=b);


        System.out.println("\nlogical operators");
        //&& logical AND
        System.out.println((5>3)&&(8>5));   //true only if both expressions are true
        System.out.println((5>3)&&(8<5));

        //|| logical OR
        System.out.println((5 < 3) || (8 > 5)); //true if either of the expressions are true
        System.out.println((5 > 3) || (8 < 5));
        System.out.println((5 < 3) || (8 < 5));

        //logical NOT
        System.out.println(!(5 == 3));  //true if expression is false
        System.out.println(!(5 > 3));


        System.out.println("\nbitwise operators");
        System.out.println("value of a  : "+a+" & value of b : "+b);

        // bitwise AND
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);
    }//main
}//class
