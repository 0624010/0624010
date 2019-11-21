abstract class Cshape
{
    protected String color;
    public void setColor(String str)
    {
        color=str;
    }
public abstract void show();
}

class CTriangle extends CShape
    {
    protected double a,b,c
    public CTriangle (double x , double y , double z)
    (
      a=x;
      b=y;
      c=z;
    )
    public void show()
    {
    System.out.print("面積="a*b*0.5);
    }
    }

