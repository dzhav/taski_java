class Rectangle{
	private double a, double b;
	public Rectangle(double l1, double l2){
		if (!(l1 >= 0 & l2 >= 0)){
			throw new RuntimeException("There is no figure with such parameters.");
			this.a = 0;
			this.b = 0;
		}
		else{
			this.a = l1;
			this.b = l2;
		}
	}
	public double Perimetr(){
		return(2*(a+b));
	}
	public double Ploshad(){
		return(a * b);
	}
}