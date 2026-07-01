package in.co.nmsworks.training.week3.Day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();
        List<Planet> planets = pr.getPlanets();

        System.out.println("--- All Planets List ---");
        pr.printPlanet(planets);

        System.out.println("\n--- All Planets Set ---");
        Set<Planet> planetSet = pr.getPlanetSet(planets);
        pr.printPlanetSet(planetSet);

        System.out.println("\n--- Name to Planet Map ---");
        Map<String, Planet> nameToPlanetMap = getNameToPlanetMap(planets);
        pr.printPlanetMap(nameToPlanetMap);

        System.out.println("\n--- Size Classification Map ---");
        Map<String, List<String>> sizeClassificationMap = pr.sizeToNameMap(planetSet);
        System.out.println(sizeClassificationMap);

        System.out.println("\n--- Classified Planet Lists (Size > 10000) ---");
        pr.classifyPlanet(planets);

        System.out.println("\n--- Planets Grouped By Moon Count ---");
        pr.classifyByMoon(planets);
    }

    private void classifyByMoon(List<Planet> planets) {
        Map<Integer, List<String>> map = new HashMap<>();

        for (Planet planet : planets) {
            Integer numberOfMoons = planet.getNumberOfMoons();

            if (!map.containsKey(numberOfMoons)) {
                map.put(numberOfMoons, new ArrayList<>());
            }
            map.get(numberOfMoons).add(planet.getName());
        }
        System.out.println(map);
    }

    private void classifyPlanet(List<Planet> planetList) {
        List<String> smallPlanet = new ArrayList<>();
        List<String> largePlanet = new ArrayList<>();

        for (Planet planet : planetList) {
            if (planet.getSize() > 10000) {
                largePlanet.add(planet.getName());
            } else {
                smallPlanet.add(planet.getName());
            }
        }
        printPlanet(smallPlanet, largePlanet);
    }

    private void printPlanet(List<String> smallPlanets, List<String> largePlanets) {
        System.out.println("Small Planets: " + smallPlanets);
        System.out.println("Large Planets: " + largePlanets);
    }

    private Map<String, List<String>> sizeToNameMap(Set<Planet> planetSet) {
        Map<String, List<String>> classificationMap = new HashMap<>();
        classificationMap.put("Smaller Planets", new ArrayList<>());
        classificationMap.put("Larger Planets", new ArrayList<>());

        for (Planet planet : planetSet) {
            if (planet.getSize() < 10000) {
                classificationMap.get("Smaller Planets").add(planet.getName());
            } else {
                classificationMap.get("Larger Planets").add(planet.getName());
            }
        }
        return classificationMap;
    }

    private void printPlanetMap(Map<String, Planet> nameToPlanetMap) {
        for (Map.Entry<String, Planet> entry : nameToPlanetMap.entrySet()) {
            System.out.println(entry.getKey() + " ->" + entry.getValue());
        }
    }

    private static Map<String, Planet> getNameToPlanetMap(List<Planet> planets) {
        Map<String, Planet> planetMap = new HashMap<>();

        for (Planet planet : planets) {
            planetMap.put(planet.getName(), planet);
        }
        return planetMap;
    }

    private Set<Planet> getPlanetSet(List<Planet> planets) {
        Set<Planet> planetSet = new HashSet<>();
        planetSet.addAll(planets);
        return planetSet;
    }

    private void printPlanetSet(Set<Planet> planetSet) {
        for (Planet planet : planetSet) {
            System.out.println(planet);
        }
    }

    private void printPlanet(List<Planet> planets) {
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    private List<Planet> getPlanets() {
        List<Planet> planet = new ArrayList<>();
        planet.add(new Planet("Mercury", 3032, "Grayish and rocky", 0));
        planet.add(new Planet("Venus", 7520, "Yellowish-white", 0));
        planet.add(new Planet("Earth", 7917, "Blue and green", 1));
        planet.add(new Planet("Mars", 4212, "Red", 2));
        planet.add(new Planet("Jupiter", 86881, "Brown with white clouds", 79));
        planet.add(new Planet("Saturn", 72366, "Yellowish with rings", 82));
        planet.add(new Planet("Uranus", 31518, "Light blue/greenGrayish", 27));
        planet.add(new Planet("Neptune", 30598, "Dark blue", 14));
        planet.add(new Planet("Pluto", 1473, "Brown and white with some red", 5));
        return planet;
    }
}