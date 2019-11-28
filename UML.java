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
