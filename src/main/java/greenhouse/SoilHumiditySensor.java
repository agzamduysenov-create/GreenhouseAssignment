package greenhouse;
public class SoilHumiditySensor implements HumiditySensor {
    @Override
    public void readHumidity() { System.out.println("Soil moisture: 45%"); }
}