//*****************************************
//  Rectangle.java
//
//  Represents a sphere.
//****************************************
public class Rectangle extends Shape
{
    private double length;
    private double width;

   //----------------------------------
   //  Constructor: Sets up the sphere.
   //----------------------------------
   public Rectangle(double w, double l)
   {
      super("Rectangle");
      width = w;
      length = l;
   }

   //-----------------------------------------
   //  Returns the surface area of the sphere.
   //-----------------------------------------
   public double area()
   {
       return length*width;
   }

   //-----------------------------------
   //  Returns the sphere as a String.
   //-----------------------------------
   public String toString()
   {
       return super.toString() + " of width of "+width+" and length of "+length;
   }

}
