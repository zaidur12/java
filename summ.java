class Add{
    public int sum()
{
  int a =3;
  int b = 4;
  return a+b;
}
}
public class summ{
    public static void main(String[] args)
    {
        Add obj = new Add();
        int result = obj.sum();
        System.out.println(result);
        }
}