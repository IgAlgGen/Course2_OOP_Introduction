public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = verificationBrand(brand);
        this.model = verificationModel(model);
        this.engineVolume = verificationEngineVolume(engineVolume);
        this.color = verificationColor(color);
        this.year = verificationYear(year);
        this.country = country;
    }

    private String verificationBrand(String brand) {
        return brand == null || brand.isEmpty() ? "default" : brand;
    }

    private String verificationModel(String model) {
        return model == null || model.isEmpty() ? "default" : model;
    }

    private double verificationEngineVolume(double engineVolume) {
        return engineVolume <= 0 ? 1.5 : engineVolume;
    }

    private String verificationColor(String color) {
        return color == null || color.isEmpty() ? "белый" : color;
    }

    private int verificationYear(int year) {
        return year <=0 ? 2000 : year;
    }



    @Override
    public String toString() {
        return brand + " "
                + model + ", "
                + "год выпуска " + year + ", "
                + "сборка " + country + ", "
                + "цвет " + color + ", "
                + "объем двигателя " + engineVolume + " л.";
    }
}
