package entities;

public class Rectangle {
    public double width;
    public double heigth;

    public double Area() {
        return this.heigth * this.width;
    }

    public double Perimeter() {
        return (this.heigth + this.width) * 2;
    }

    public double Diagonal() {
        double aux = Math.pow(this.heigth, 2) + Math.pow(this.width, 2);
        return Math.sqrt(aux);
    }
}


