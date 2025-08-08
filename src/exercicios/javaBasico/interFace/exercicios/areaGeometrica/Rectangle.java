package exercicios.javaBasico.interFace.exercicios.areaGeometrica;

public record Rectangle(double height, double base) implements GeometricForm {
    @Override
    public double getArea() {
        return height * base;
    }
}
