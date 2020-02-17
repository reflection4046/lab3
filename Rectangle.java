package lab3;

public class Rectangle {
	private double Height;
	private double Width;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(Double height, Double width) {
		Height = height;
		Width = width;
	}

	public Double getHeight()
    {
		return Height;
	}
	
	public void setHeight(Double height) 
	{
		Height = height;
	}
	
	public Double getWidth() 
	{
		return Width;
	}
	
	public void setWidth(Double width) 
	{
		Width = width;
	}

	public String toString() 
	{
		return "Rectangle [Height=" + Height + ", Width=" + Width + "]";
	}
	
	public double CalArea()
	{
		return Height*Width;
		
	}
}