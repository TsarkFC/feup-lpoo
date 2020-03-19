import java.util.ArrayList;
import java.util.List;

public class City implements SumProvider{
    private List<House> houses = new ArrayList<>();

    public void addHouse(House house){
        houses.add(house);
    }

    public double sum(){
        double sum = 0;
        for (House house : houses){
            sum += house.getArea();
        }
        return sum;
    }
}
