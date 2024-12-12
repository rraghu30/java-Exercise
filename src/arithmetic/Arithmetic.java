package arithmetic;

import java.util.Scanner;


public class Arithmetic {

    
    public static void main(String[] args) {
        
        /*
        int a = 14, b = 5;
        
        int c=a/b;
        int r=a%b;
        
        float f=(float)a/b;
        
        System.out.println(c);
        System.out.println(r);
        System.out.println(f);

        */
        
        
        /*
        float base, height, area;
        System.out.println("Enter Base and height : ");
        
        Scanner sc= new Scanner(System.in);
        base= sc.nextFloat();
        height= sc.nextFloat();
        
        area= base*height/2;
        
        System.out.println("Area of a Triangle is "+area);
        
         */
        
        
        
        // area of triangle------
        
        /*
        Scanner sc=new Scanner(System.in);
        
        int a, b, c;
        float s;
        double area;
        
        
        System.out.println("Enter 3 side of a Triangle :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        s = (a+b+c)/2f;
        
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area is "+ area);


       */
        
        Scanner sc=new Scanner(System.in);
        int length,breadth,height;
        int totalArea,volume;
        
        System.out.println("Enter the Lenght breadth and height :");

        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        
        totalArea=2*(length*breadth+length*height+breadth*height);
        
        volume=length*breadth*height;
        
        System.out.println("Total Area  :"+totalArea);
        System.out.println("Volume :"+volume);
    }
    
}
