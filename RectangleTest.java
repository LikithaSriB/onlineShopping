class Cylinder {
     private int radius;
     private int height;
     private int p=3.14;
    public Cylinder(int r,int h){
        setRadius(r);
        setHeight(h);
    }
    public int area(){
        return p*getRadius()*getRadius()*getHeight();
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int r){
     if(r>0)
     radius=r;
     else
     radius=0;
    }
    public void setHeight(int h){
        if(h>0)
        height=h;
        else
        height=0;
       }
    }
    public class Test
    {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(4,9);
      System.out.println("area:"+c.area());
    }
  }