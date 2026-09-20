package greenhouse;
public interface ClimateFactory {
    HumiditySensor createHumidity();
    UVLamp createUV();
}