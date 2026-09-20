package greenhouse;
public class IrrigationPump implements Resource {
    @Override
    public void apply() {
        System.out.println("Полив работает");
    }
}