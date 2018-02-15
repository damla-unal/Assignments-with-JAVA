import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.math.*;  

public class HelloJava {
	
	public static void main(String[] args)
	{
		try {          
			  Scanner scanner = new Scanner(new File(args[0]));     //Creating a Scanner class to retrieve data from a specified file    
			  while(scanner.hasNextLine()){          //This method returns true if there is another line in the input of this scanner.       
				  String[] line = scanner.nextLine().split(" ");
				   /*"nextLine()" advances this scanner past the current line and returns the input that was skipped.
				   It was an array of string type by splitting it from each line spacing that was read.*/
				  if(line[0].equals("IntegrateReimann"))
				  {
					  double dline2=Double.parseDouble(line[2]);     //Returns the double value represented by a string parameter
					  double dline3=Double.parseDouble(line[3]);
					  double dline4=Double.parseDouble(line[4]);
					  System.out.print(line[0]+" "+line[1]+" "+line[2]+" "+line[3]+" "+line[4]+" "+"Result: ");
					  riemannSum(line[1],dline2,dline3,dline4);
				  }
				  else if(line[0].equals("Arcsinh"))    //"equals()" Compares this string to the specified object
				  {
					  double double1=Double.parseDouble(line[1]);
					  System.out.println(line[0]+" "+line[1]+" "+"Result: "+Func3(double1));
				  }
				  else {
					  int integer1=Integer.parseInt(line[1]);    //Returns the integer value represented by a string parameter
					  System.out.print(line[0]+" "+line[1]+" "+"Result: ");
					  Armstrong(integer1);
				  }
				}         
			  scanner.close();                    
			  }          
		  catch (FileNotFoundException ex) {       //Part to work if there is no file  
			  System.out.println("No File Found!");             
			  return;         
			  } ;
	}
	public static double Func1(double x)
	{
		return x*x-x+3;
	}
	public static double Func2(double y)
	{
		double dsin=Math.sin(y);
		return Math.pow(3*dsin-4,2);
	}
	public static int factoriyel(int sayi)
	{
		if(sayi==0)
			return 1;
		else
			return sayi*factoriyel(sayi-1);   
	}
	public static double Func3(double dnumb)
	{    /* for this method; implement arcsinh(x) function as Maclaurin Series. 
					For function arcsinh(x) value of x will be given by user.  */
		int n1;
		double dSum=0;
		for(n1=0;n1<=30;n1++)
		{
			double ustel1=Math.pow(-1,n1);  //pow(a,b)->returns the value of the first argument raised to the power of the second argument.
			double ustel2=Math.pow(4,n1);
			int iFact1=factoriyel(2*n1);
			double factUstel=Math.pow(factoriyel(n1),2);
			double carpan=Math.pow(dnumb,2*n1+1);
			dSum+= (ustel1*iFact1*carpan)/(ustel2*factUstel*(2*n1+1));		
		}
		return dSum;		
	}
	public static void riemannSum(String fonkName,double l_border,double u_border,double partitions)
	{   /* The sum is calculated by dividing the region up into shapes (rectangles)
		     is used middle Reimann sum rule in this method. */
		
		double interval=partitions,lower=l_border,upper=u_border;
		double dx=(upper-lower)/interval;
		double c=lower;
		double sum=0;
		
			if (fonkName.equals("Func1"))
			{
				for (double i=1;i<=interval;i++)
				{
					double sonuc=Func1((c+(lower+dx))/2);
					sum+=sonuc*dx;
					c+=dx;
					lower+=dx;
				}System.out.println(sum);
			}
			else if(fonkName.equals("Func2"))
			{
				for (double i=1;i<=interval;i++)
				{
					double sonuc=Func2((c+(lower+dx))/2);
					sum+=sonuc*dx;
					c+=dx;
					lower+=dx;
				}System.out.println(sum);
			}
			else{
				for (double i=1;i<=interval;i++)
				{
					double sonuc=Func3((c+(lower+dx))/2);
					sum+=sonuc*dx;
					c+=dx;
					lower+=dx;
				}System.out.println(sum);
			}
	}
	public static void Armstrong(int bas)
	{	 // This method, find out and print the Armstrong numbers whose digit number is below or equal to the given digit parameter .
		int number;
		for(number=0;number<=(int)Math.pow(10,bas);number++)
		{	
			int copyNumber=number;
			String s_Number=copyNumber+"";
			int i_length=s_Number.length();  
			int sum=0;
		while(copyNumber!=0)
		{				
		int digit=copyNumber%10;
		sum=sum+(int)Math.pow(digit, i_length);
		copyNumber=copyNumber/10;
		}
		if(sum==number){
			System.out.print(number+" ");
		}
	}
	}
}
