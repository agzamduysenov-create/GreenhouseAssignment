package greenhouse;
public class Main {
    public static void main(String[] args) {
        // Part A: Factory Method тест
        System.out.println("=== PART A: Factory Method ===" );
        ResourceCreator waterCreator = new WaterCreator();
        waterCreator.createResource().apply();

        ResourceCreator nutrientCreator = new NutrientCreator();
        nutrientCreator.createResource().apply();

        // Part B: Abstract Factory тест
        System.out.println("\n=== PART B: Abstract Factory ===");
        ClimateFactory hydro = new HydroClimateFactory();
        hydro.createHumidity().readHumidity();
        hydro.createUV().activateUV();

        ClimateFactory soil = new SoilClimateFactory();
        soil.createHumidity().readHumidity();
        soil.createUV().activateUV();
    }
}