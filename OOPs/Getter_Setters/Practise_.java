package OOPs.Getter_Setters;

public class Practise_ {

    //Create car attributes
    private String car_name;
    private String car_model;
    private int car_number;
    private String state;

    public Practise_(String car_name, String car_model, int car_number, String state) {
        this.car_name = car_name;
        this.car_model = car_model;
        this.car_number = car_number;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Practise_{" +
                "car_name='" + car_name + '\'' +
                ", car_model='" + car_model + '\'' +
                ", car_number=" + car_number +
                ", state='" + state + '\'' +
                '}';
    }
}
