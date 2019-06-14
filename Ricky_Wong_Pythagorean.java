package pythagoreanTheorem;


public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // calculate the value of c given legA and legB

    	double a = legA * legA;
    	double b = legB * legB;
    	double hypotenuse = Math.sqrt(a + b);
    	return hypotenuse;
    }
}

