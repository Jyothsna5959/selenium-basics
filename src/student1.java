import java.util.*;   
public class student1 
{ 
    
    public static void main(String args[]) 
    {   
      
        Scanner sc = new Scanner(System.in); 
        int n;    
        
        
        System.out.println("Enter the total subjects ");
        n=sc.nextInt();
        
        
        int m=0;
      
        System.out.println("Enter the marks secured in each subject ");
        for(int m1=0;m1<n;m1++)   
        {
            m1=sc.nextInt();
        }
        
        int total=0;
        //Calculate the total marks
        for(int i=0;i<n;i++)
        {
            total=total+m;
        }
        //Display the total marks
        System.out.println("The total marks obtained is "+total);
        
        //Calculate the percentage
        float percentage; 
        percentage = (total / (float)n); 
        
        //Display the total percentage
        System.out.println( "Total Percentage : " + percentage + "%");                         
    }   
}
