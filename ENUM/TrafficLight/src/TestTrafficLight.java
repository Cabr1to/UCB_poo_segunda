enum TrafficLight {
    RED(30),
    GREEN(45),
    YELLOW(5);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class TestTrafficLight {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println("Luz: " + light + ", Duração: " + light.getDuration() + " segundos");
        }
    }
}
