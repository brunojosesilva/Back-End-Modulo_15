

public abstract class Fabrica {

    public Car create(String category){

        Car car = retrieveCar(category);

        return car;
    }


    abstract Car retrieveCar(String category);

}