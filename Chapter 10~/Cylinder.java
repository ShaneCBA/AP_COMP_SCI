//*****************************************
//  Cylinder.java
//
//  Represents a sphere.
//****************************************
public class Cylinder extends Shape
{
    private double radius;  //radius in feet
    private double height;  //height in feet

   //----------------------------------
   //  Constructor: Sets up the sphere.
   //----------------------------------
   public Cylinder(double r, double h)
   {
      super("Cylinder");
      radius = r;
      height = h;
   }

   //-----------------------------------------
   //  Returns the surface area of the sphere.
   //-----------------------------------------
   public double area()
   {
       return Math.PI*radius*radius*height;
   }

   //-----------------------------------
   //  Returns the sphere as a String.
   //-----------------------------------
   public String toString()
   {
       return super.toString() + " of radius " + radius + " and height of "+height;
   }

}
