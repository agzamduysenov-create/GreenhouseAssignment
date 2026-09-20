# GreenhouseAssignment

Assignment #2 — Factory Method & Abstract Factory (ShP-2216 Software Design Patterns, Astana IT University).

Domain: smart greenhouse control system. Free topic (Option C), chosen because it splits naturally into a single-product factory (resource dispensers) and a family-of-related-objects factory (climate control hardware).

## What's implemented

**Part A — Factory Method**
`ResourceCreator` declares the factory method `createResource()`. `WaterCreator` and `NutrientCreator` each return a different `Resource` implementation (`IrrigationPump`, `FertilizerInjector`) without the client choosing the concrete class itself.

**Part B — Abstract Factory**
`ClimateFactory` declares one creation method per product in the family: `createHumidity()` and `createUV()`. `HydroClimateFactory` and `SoilClimateFactory` each return a matching, consistent pair of products, so the client can never mix a hydro sensor with a soil lamp.

The client (`Main`) only talks to `Resource`, `ResourceCreator`, `HumiditySensor`, `UVLamp`, and `ClimateFactory` — no `if`/`switch` on type.

## Project structure
src/main/java/greenhouse/
├── Resource.java # Product interface (Part A)
├── IrrigationPump.java # Concrete Product
├── FertilizerInjector.java # Concrete Product
├── ResourceCreator.java # Creator (abstract)
├── WaterCreator.java # Concrete Creator
├── NutrientCreator.java # Concrete Creator
├── HumiditySensor.java # Abstract Product (Part B)
├── UVLamp.java # Abstract Product (Part B)
├── HydroHumiditySensor.java # Concrete Product — hydro family
├── HydroUVLamp.java # Concrete Product — hydro family
├── SoilHumiditySensor.java # Concrete Product — soil family
├── SoilUVLamp.java # Concrete Product — soil family
├── ClimateFactory.java # Abstract Factory
├── HydroClimateFactory.java # Concrete Factory — hydro family
├── SoilClimateFactory.java # Concrete Factory — soil family
└── Main.java # Client=== PART A: Factory Method ===
Полив работает
Удобрение подано

=== PART B: Abstract Factory ===
Hydro moisture: 85%
Hydro UV: LED high
Soil moisture: 45%
Soil UV: standard
