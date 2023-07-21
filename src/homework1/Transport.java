package homework1;

public class Transport {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transport(String name) {
        this.name = name;
    }

    private String name;


    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                '}';
    }

    public void speedUp(){
        System.out.println("vrum vrum");
    }
}
