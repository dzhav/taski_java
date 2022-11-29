class Circle{
	private double r;
	public Circle(double l1){
		if (l1 >= 0){
			throw new RuntimeException("There is no figure with such parameters.");
			this.a = 0;
		}
		else{
			this.r = l1;
		}
	}
	public double Perimetr(){
		return(2 * Math.PI * r);
	}
	public double Ploshad(){
		return(Math.PI * r * r)
	}
}