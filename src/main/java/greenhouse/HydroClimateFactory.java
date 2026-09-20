package greenhouse;
public class HydroClimateFactory implements ClimateFactory {
    @Override
    public HumiditySensor createHumidity() {
        return new HydroHumiditySensor();
    }
    @Override
    public UVLamp createUV() {
        return new HydroUVLamp();
    }
}