class Calc{
    public int add(int a,int b){
      return a+b;

    }
    public int sub(int a,int b){
      return a-b;

    }
    public int mul(int a,int b){
      return a*b;

    }
    public float div(float a, float b){
        if (b == 0){
            System.out.println("Invalid: cannot divide by zero");
            return 0;
        }
        else
          return a/b;
    }
}

public class calculator {
    public static void main(String[] args){
      int num1= 5;
      int num2 = 3;
        Calc obj = new Calc();
        int sum = obj.add(num1,num2);
        int sub = obj.sub(num1,num2);
        int mul = obj.mul(num1,num2);
        float div = obj.div(num1,num2);

        System.out.println("Sum = " + sum);
        System.out.println("Sub = " + sub);
        System.out.println("Mul = " + mul);
        System.out.println("Div = " + div);




    }
}
