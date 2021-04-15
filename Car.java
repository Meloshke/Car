public class Car
{
    public String shape = "duży";
    public String color = "czerwony";
    public String brand = "Opel";
    public int size = 100;
    public float velocity = 0;

    public void drive(){
        System.out.println("Brum brum");
        this.velocity+=20.5;
        System.out.println("Samochód porusza się z prędkością " + velocity + "km/h");
    }
    public void brake(){
        this.velocity-=velocity;
        System.out.println("Samochód zwolnił do prędkości " + velocity + "km/h");
    }
    public void drive_into_building(){
        this.color = "burnt";
        this.size = 0;
        System.out.println("Samochód został zniszczony. Jego rozmiar wynosi teraz " + size + "a jego kolor to " + color + ".");
    }

}
