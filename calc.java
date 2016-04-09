import java.util.Scanner;
public class calc extends Calc_func
{
    static Scanner s=new Scanner(System.in);
    static int a,b;
    public static void get()
    {
        System.out.println("Enter the two numbers :");
        a=s.nextInt();
        b=s.nextInt();
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int option;
        do
        {
            System.out.println("Menu:\n1.Add\t2.Sub\t3.Multiply\t4.Divide\t5Loop 6.Exit");
            System.out.println("Enter the option :");
            option=s.nextInt();
            
            switch(option)
            {
                case 1:
                    get();
                    Calc_func.add(a,b);
                    break;
                case 2:
                    get();
                    Calc_func.sub(a,b);
                    break;
                case 3:
                    get();
                    Calc_func.mul(a,b);
                    break;
                case 4:
                    get();
                    Calc_func.div(a,b);
                    break;

                case 5:try
		{
		int n=in.nextInt();
		int blank=1,space=n-1;
		int line=1;
		String x=new String("x");
		System.out.println("");
		calx(x,blank,space,n,line);
		}
		
		finally {
			in.close();
		}
		break;
		case 6 :
		    return;
                default:System.out.println("Enter 1, 2 or 3:");
            }
        }while(option<4);
    }
}
