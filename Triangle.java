class Triangle{
	private double a, b, c;
	public Triangle(double l1, double l2, double l3){
		if (!(l1 >= 0 & l2 >= 0 & l3 >= 0) | (l1 + l2 < l3) | (l1 + l3 < l2) | (l2 + l3 < l1)){
			throw new RuntimeException("There is no figure with such parameters.");
			this.a = 0;
			this.b = 0;
			this.c = 0;
		}
		else{
			this.a = l1;
			this.b = l2;
			this.c = l3;
		}
	}

	public double Perimetr(){
		return(a + b + с);
	}
	double p = (a + b + c) / 2;
	public double Ploshad(){
		return(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
	}
}