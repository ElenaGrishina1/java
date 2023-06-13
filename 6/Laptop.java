import java.util.Objects;

public class Laptop {
    Colour colour;
    Brand brand;

    public Laptop(Brand brand, Colour colour) {
        this.brand = brand;
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, brand);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        return Objects.equals(colour, laptop.colour) &&
                Objects.equals(brand, laptop.brand);
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "brand=" + brand +
                ", colour=" + colour +
                '}';
    }
}