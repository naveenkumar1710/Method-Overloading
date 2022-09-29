                                    //Method Overloading
public class calculator{
    
    int addition(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    int sub(int x,int y){
        int z=x-y;
        System.out.println(z);
        return z;
    }

    int multiple(int num1,int num2){
        int num3=num1*num2;
        System.out.println(num3);
        return num3;
    }
    int division(int a,int b){
        int c=a/b;
        System.out.println(c);
        return c;
    }
    int sub(int x,int y,int z){
        z=x-y;
        return z;
    }
}
