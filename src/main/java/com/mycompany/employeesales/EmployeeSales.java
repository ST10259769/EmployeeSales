package com.mycompany.employeesales;
import java.util.Scanner;
//author:@s.nkomo
 
public class EmployeeSales {

    public static void main(String[] args) {
            
        //1.declaring variables
        
        int saleamount = 1;
        double totalsold;
        
        //2.instantiating a scanner object
        
        Scanner scan = new Scanner(System.in);
        
        //3.prompting the user for input
        
        System.out.print("Enter the name of the employee: ");
        String employeename  = scan.nextLine();
        
        int count=1;
        double total=0;
        
        //5.prompting the user for sales amounts
        
        while( saleamount != 0) {
          
         System.out.print("Enter the sale "+count+" amount: ");
         saleamount=scan.nextInt();
         
        if(saleamount < 0){
            System.out.println("You have entered a sale amount less than zero");
            System.out.println("Please enter the sale again");
           
        }else{
             count= count+1;
             total=total + saleamount;
        }           
         
            
        }
        
        count= count-2;
        
        totalsold = total;
        
      
            
            
        
        //7.displaying the employee sales report
        
        double averagesales = 0;
        
        averagesales = total/count;
        
        averagesales = Math.round(averagesales*100.0)/100.0;
        
        System.out.println("------------------------");
        
        System.out.println("EMPLOYEE SALES REPORT");
        
        System.out.println("------------------------");
        
        System.out.println(" EMPLOYEE: "+employeename+"");
        
        System.out.println(" Total Sold: R"+totalsold+"");
        
        System.out.println("------------------------");
        
        System.out.println(" Sales count: "+count+"");
       
        System.out.println("Average sales: R"+averagesales+"");
   
    
        }
        
        
        
        
        
        
        
        
        }
           
           
    
    

