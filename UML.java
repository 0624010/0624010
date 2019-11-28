interface Shape
{
  abstract getArea();
}

class Rectangle implements Shape
{
  double length;
  double width;
  public void getArea()
{
  System.out.println("Area="+length*width);
}

class Triangle implements Shape
{
  double base;
  double height;
  public void getArea()
{
  System.out.println("Area="+base*height*1/2);
}
