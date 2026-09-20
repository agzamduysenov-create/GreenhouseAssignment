package greenhouse;
public class NutrientCreator extends ResourceCreator {
    @Override
    public Resource createResource() {
        return new FertilizerInjector();
    }
}