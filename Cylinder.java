//import java.lang;
public static main(String[] args) {
    

    Cylinder c=new Cylinder();
    c.setHeight(9);
    c.setRadius(4);
    c.setDim(9,4);
     System.out.println("area:"+c.area());
   }

class Cylinder {
    private int radius;
    private int height;
    private int p=3.14;
     Cylinder()
    {
        radius=height=1;
    }
    Cylinder(Double r,Double h){
       radius=r;
       height=h;
   }
   public double area(){
       return p*getRadius()*getRadius()*getHeight();
   }
   public double getRadius(){
       return radius;
   }
   public double getHeight(){
       return height;
   }
   public void setRadius(Double r){
    if(r>0)
    radius=r;
    else
    radius=0;
   }
   public void setHeight(Double h){
       if(h>0)
       height=h;
       else
       height=0;
      }
      public void setDim(double h,double r)
      {
          height=h;
          radius=r;
      }
   }
   

