class Complex {

    private double re, im;

    public Complex(final double re, final double im) {
        this.re = re;
        this.im = im;
    }

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(final Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /*
         * Check if o is an instance of Complex or not "null instanceof [type]" also returns false
         */
        if (!(o instanceof Complex)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        final Complex c = (Complex) o;

        // Compare the data members and return accordingly
        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
    }
}

// Driver class to test the Complex class
public class Main {

    public static void main(final String[] args) {
        final Complex c1 = new Complex(10, 15);
        final Complex c2 = new Complex(10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
            System.out.println(c1.hashCode());
            System.out.println(c2.hashCode());

        } else {
            System.out.println("Not Equal ");
        }
    }
}
