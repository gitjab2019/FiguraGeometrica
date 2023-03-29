public class Circulo extends FiguraGeometrica{

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public float calclularArea() {
        return 2.1418f*this.radio*this.radio/2;
    }
}
