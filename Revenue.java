//Total Revenue in 2018 is: 1307750
//Projected Revenue in 2025 is: 1550950

import static java.lang.Math.pow;
public class Revenue {
    // The method used to calculate the projected sales based upon the base sale, growth rate and number of years
    public static int[] projSales(int productSales2018[], double growthRate[], int numberOfYears)
    {
        int productSales2025[] = new int[5];
        for(int i = 0 ; i < 5 ; i++ ) {
            //Using the given formula to initialize for every product the projected sale
            productSales2025[i] = (int) ((productSales2018[i]) * pow((1 + growthRate[i] / 100), numberOfYears));
        }
        //Return the array of projectedSales
        return productSales2025;
    }
    public static void main(String []args)
    {
        //Initialize all arrays 
        int productPrice[] = {1825, 670, 880, 1910, 485};
        int productSales2018[] = { 320, 140, 530, 45, 160};
        double growthRate[] = { 2.25, 3.5, 2.5, 4.3, 0.8};
        int productRevenue2018[] = new int[5];
        int totalRevenue2018 = 0;
        //Loop to calculate each product's revenue in a loop and also calculate total Revenue for 2018    
        for( int i = 0 ; i < 5 ; i++)
        {
            productRevenue2018[i] = productPrice[i]*productSales2018[i];
            totalRevenue2018 += productRevenue2018[i];
        }
        //Display total revenue of 2018
        System.out.println("Total Revenue in 2018 is: "+totalRevenue2018);
        //Call method projected Sales to initialize productsales2025
        int productSales2025[] = projSales(productSales2018, growthRate, 7);
        int productRevenue2025[] = new int [5];
        int totalRevenue2025 = 0;
        //Loop to calculate revenue for 2025 and total revenue for 2025
        for(int i = 0 ; i < 5 ; i++)
        {
            productRevenue2025[i] = productSales2025[i]*productPrice[i];
            totalRevenue2025 += productRevenue2025[i];
        }
        //Display the total revenue acquired in 2025
        System.out.println("Projected Revenue in 2025 is: "+ totalRevenue2025);
    }
}