public class KomplexniCislo {
    private double real;
    private double imag;

    public KomplexniCislo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public double getImag() {
        return this.imag;
    }

    public KomplexniCislo add(KomplexniCislo b) {
        double newReal = this.real + b.getReal();
        double newImag = this.imag + b.getImag();
        return new KomplexniCislo(newReal, newImag);
    }

    public KomplexniCislo subtract(KomplexniCislo b) {
        double newReal = this.real - b.getReal();
        double newImag = this.imag - b.getImag();
        return new KomplexniCislo(newReal, newImag);
    }

    public KomplexniCislo multiply(KomplexniCislo b) {
        double newReal = this.real * b.getReal() - this.imag * b.getImag();
        double newImag = this.real * b.getImag() + this.imag * b.getReal();
        return new KomplexniCislo(newReal, newImag);
    }

    public String toString() {
        return this.real + " + " + this.imag + "i";
    }
}
