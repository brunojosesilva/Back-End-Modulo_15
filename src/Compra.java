

public class Compra {

    private String category;
    public Car car;

    
    public Compra (String category){
        this.category = category;
        Fabrica fabrica = new CategoriaFabrica();
        car = fabrica.retrieveCar(category);

    }

}