//Sarah Wang
//September 21st, 2021
//Purpose: Problem Set 1-A

class Problem_Set_1A {
    
    public static void main (String[] args) {
        
        //QUADRATIC FORMULA
        double a = 1;//a, b, and c are the coefficients of the polynomial
        double b = 5;
        double c = 6;
        double x; //variable used to facilitate calculations
        double z1; //first solution
        double z2; // second solution
    
        x = Math.sqrt((b*b)-(4*a*c)); 
        z1 = (-1*b-x)/(2*a);
        z2 = (-1*b+x)/(2*a);
            
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + z1 + " and " + z2);
        System.out.println();
        
        /*--------------------*/        
        
        //SLOPE
        double x1 = 0;//x1 and y1 are coordinates of the 1st point
        double y1 = 0;
        double x2 = 2;//x2 and y2 are coordinates of the 2nd point
        double y2 = 3;
        double m; //slope
        
        m = (y2-y1)/(x2-x1);
        
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + (int)x1 + ", " + (int)y1 + ") and (" + (int)x2 + ", " + (int)y2 + ") has a slope of " + m);
        System.out.println();
        
        /*--------------------*/
        
        //MIDPOINT FORMULA
        //uses the same coordinates from the slope equation
        double Mx; //x value of midpoint
        double My; //y value of midpoint
            
        Mx = ((x1+x2)/2);
        My = ((y1+y2)/2);
        
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + (int)x1 + ", " + (int)y1 + ") and (" + (int)x2 + ", " + (int)y2 + ") is (" + Mx + ", " + My + ")");
        System.out.println();
        
        /*--------------------*/
        
        //SUM OF ARITHMETIC SERIES
        int k = 5; //number of terms
        double a1 = 1; //first term
        double a2 = 5; //last term
        double s; //sum of arithmetic series
        
        s = (k/2.0)*(a1+a2);
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first 5 terms of an arithemetic series that starts with " + a1 + " and increases by " + a1 + " is " + s);
        System.out.println();
        
        /*--------------------*/
        
        //SUM OF GEOMETRIC SERIES
    
        double k1 = 3; //number of terms
        double g = 3;  //first term
        double r = 2; //common ratio
        double S; //sum of geometric series
        
        S = g*((1-Math.pow(r,k1))/(1-r));
        
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first 3 terms of a finite geometric series that starts with " + g + " and increases by a rate of " + r + " is " + S);
        
        
        
        
    }
}