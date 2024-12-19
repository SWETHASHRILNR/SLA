package Interface;

interface sumnum 
{
    int calsum();
}

class SumInterf implements sumnum 
{
    public static void main(String[] args)
    {
        SumInterf obj = new SumInterf();
        int a = obj.calsum();
        System.out.println("Sum of 10 numbers is: " + a);
    }

    @Override
    public int calsum()
    {
        int sum = 0;
        for (int i = 0; i <= 10; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
}
