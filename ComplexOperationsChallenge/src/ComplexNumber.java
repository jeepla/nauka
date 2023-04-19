public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;

    }
    public void add(ComplexNumber complexNumber){
        add(complexNumber.getReal(), complexNumber.getImaginary());

    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
}