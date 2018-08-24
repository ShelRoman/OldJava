package week2.homework;

public class Fraction {
	private int chislitel; 
	private int znamenatel;
	
	public Fraction (int chislitel, int znamenatel) {
		this.setChislitel(chislitel);
		this.setZnamenatel(znamenatel);
	}

	public String toString() {
		if (this.getChislitel() == this.getZnamenatel()) {
			return "1";
		} else if (this.getChislitel() == 0) {
			return "0";
		} else if (this.getChislitel() > this.getZnamenatel()) {
			int natural = (this.getChislitel() - (this.getChislitel() % this.getZnamenatel())) / this.getZnamenatel();
			int chis = this.getChislitel() % this.getZnamenatel();
			return String.valueOf(natural) + "(" + String.valueOf(chis) + "/" + String.valueOf(this.getZnamenatel() + ")");
		}
		return String.valueOf(this.getChislitel()) + "/"  + String.valueOf(this.getZnamenatel());
	}
	
	public void print() {
		System.out.println(String.valueOf(this.getChislitel()) + "/"  + String.valueOf(this.getZnamenatel()));
	}

	
	public void setChislitel(int chislitel){
		this.chislitel = chislitel;
	}
	
	public int getChislitel() {
		return this.chislitel;
	}
	
	public void setZnamenatel(int znamenatel){
		this.znamenatel = znamenatel;
	}
	
	public int getZnamenatel() {
		return this.znamenatel;
	}
	
	public Fraction add(Fraction frac) {
		if (this.getZnamenatel() == frac.getZnamenatel()) {
			int newChis = this.getChislitel() + frac.getChislitel();
			int newZnam = this.getZnamenatel();
			return new Fraction(newChis, newZnam);
		} else {
			int newZnam = this.getZnamenatel() * frac.getZnamenatel();
			int newChis = ((this.getChislitel() * (newZnam / this.getZnamenatel())) +
					(frac.getChislitel() * (newZnam / frac.getZnamenatel()))) ;
			return new Fraction(newChis, newZnam);
		}
	}
	
	public Fraction sub(Fraction frac) {
		if (this.getZnamenatel() == frac.getZnamenatel()) {
			int newChis = this.getChislitel() - frac.getChislitel();
			int newZnam = this.getZnamenatel();
			return new Fraction(newChis, newZnam);
		} else {
			int newZnam = this.getZnamenatel() * frac.getZnamenatel();
			int newChis = ((this.getChislitel() * (newZnam / this.getZnamenatel())) -
					(frac.getChislitel() * (newZnam / frac.getZnamenatel()))) ;
			return new Fraction(newChis, newZnam);
		}
	}
	
	public Fraction mul(Fraction frac) {
		return new Fraction(this.getChislitel() * frac.getChislitel(), this.getZnamenatel() * frac.getZnamenatel());
	}
	
	public Fraction div(Fraction frac) {
		return new Fraction(this.getChislitel() * frac.getZnamenatel(), this.getZnamenatel() * frac.getChislitel());
	}
}