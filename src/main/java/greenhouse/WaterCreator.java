package greenhouse;
public class WaterCreator extends ResourceCreator {
    @Override
    public Resource createResource() {
        return new IrrigationPump();
    }
}