package greenhouse;
public class HydroHumiditySensor implements HumiditySensor {
    @Override
    public void readHumidity() { System.out.println("Hydro moisture: 85%"); }
}