public class Fraction {

private int numerator;
private int denonminator;


public Fraction(int numerator, int denonminator){
    this.numerator = numerator;
    this.denonminator = denonminator;
}

public int getNumerator(){
    return numerator;
}
public int getDenominator() {
    return denonminator;
}
public Fraction product(Fraction object2){
    int newNumerator = this.numerator * object2.numerator;
    int newDenonminator = this.denonminator * object2.denonminator;
    Fraction product = new Fraction(newNumerator, newDenonminator);
    product.print();
    return product;

}
public Fraction sum(Fraction  object2){
    int newNumerator = (this.numerator * object2.denonminator) + (object2.numerator * this.denonminator);
    int newDenonminator = (this.denonminator * object2.denonminator);


    Fraction sum = new Fraction(newNumerator, newDenonminator);
    sum.print();
    return sum;
    
    
}
public Fraction reciprocal(){

    Fraction reciprocal = new Fraction(getDenominator(), getNumerator());
    reciprocal.print();
    return reciprocal;

}
public void print(){
    System.out.println(numerator + "/" + denonminator);

}

public static void main(String[] args) {
    Fraction f1 = new Fraction(1, 2);
    f1.print();
    f1.reciprocal();

    Fraction f2 = new Fraction(2, 3);
    f2.print();
    f2.reciprocal();

    f1.sum(f2);
    f1.product(f2);
}




}
