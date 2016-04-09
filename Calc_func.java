public class Calc_func
{
    static void add(int a,int b)
    {
        System.out.println(a+b);

    }
    static void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    static void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    static void div(int a,int b)
    {
        if(b!=0)
            System.out.println(a/b);
        else
            System.out.println("Denominator cannot be zero");
    }
    static void loops(String str,int b,int sp,int p,int k)
    {
        	try{
		
			if(k==p/2+1)
			{
			System.out.println(String.format("%1$" +((p/2)+1)+ "s",str));
			calx(str,b,sp,p,k+1);
			}
		
		if(k<p/2+1)
		{
			
			System.out.print(String.format("%1$"+b+"s",str));
			System.out.println(String.format("%1$"+sp+"s",str));
		b++;
		sp=sp-2;
		calx(str,b,sp,p,k+1);
		}
		
	 if(k>p/2+1 && k!=p+1)
		{
		// if(b != 1){
		//System.out.println(" b::::::: "+b);
			b--;
		 
			sp=sp+2;
			 System.out.print(String.format("%1$"+b+"s",str));
			System.out.println(String.format("%1$"+sp+"s",str));
		calx(str,b,sp,p,k+1);
		 //}
		}
		
	 if (k==p+1)
 		return 0;
	}
	catch(Exception e)
	{
			System.err.println(e);
			e.printStackTrace();
	}
 	return 0;
	

    }
}
