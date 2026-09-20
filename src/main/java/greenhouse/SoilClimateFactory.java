package greenhouse;
public class SoilClimateFactory implements ClimateFactory {
    @Override
    public HumiditySensor createHumidity() {
        return new SoilHumiditySensor();
    }
    @Override
    public UVLamp createUV() {
        return new SoilUVLamp();
    }
}