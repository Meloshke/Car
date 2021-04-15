import java.awt.image.SampleModel;

public class CarInteraction {
    public static void main(String[] args) {
        Car samochod = new Car();

        for (int i = 0; i < 102.5; i++) {
            samochod.drive();
        }
        samochod.brake();
        samochod.drive_into_building();
    }
}
