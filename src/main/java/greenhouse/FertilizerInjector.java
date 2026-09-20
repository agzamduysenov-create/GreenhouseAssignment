package greenhouse;
public class FertilizerInjector implements Resource {
    @Override
    public void apply() {
        System.out.println("Удобрение подано");
    }
}