package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();

        List<Planet> planets = pr.getPlanets();

//        pr.printPlanets(planets);

        Set<Planet> planetSet = pr.getPlanetSet(planets);
//        pr.printPlanets(planetSet);

        Map<String, Planet> nameToPlanetMap = getNameToPlanetMap(planets);

        Map<Integer, String> sizeToNameMap = getSizeToNameMap(planetSet);

//        classifyPlanets(planets);
        classifyBasedOnMoon(planets);
    }

    private static void classifyBasedOnMoon(List<Planet> planets) {
        Map<Integer, List<String>> moonToPlanetMap = new HashMap<>();

        for (Planet planet : planets) {
            int moonCount = planet.getNoOfMoons();
            List<String> planetNamesList = moonToPlanetMap.get(moonCount);

            if(planetNamesList == null) {
                planetNamesList = new ArrayList<>();
                moonToPlanetMap.put(moonCount, planetNamesList);
            }

            moonToPlanetMap.get(moonCount).add(planet.getName());

            //moonToPlanetMap.computeIfAbsent(planet.getNoOfMoons(), v -> new ArrayList<>()).add(planet.getName());
        }

        System.out.println(moonToPlanetMap);
    }

    private static void classifyPlanets(List<Planet> planets) {

        List<String> smallPlanets = new ArrayList<>();
        List<String> bigPlanets = new ArrayList<>();

        for (Planet planet : planets) {
            if(planet.getSize() > 10000) {
                bigPlanets.add(planet.getName());
            }
            else {
                smallPlanets.add(planet.getName());
            }
        }

        printPlanetList(smallPlanets, bigPlanets);
    }

    static void printPlanetList(List<String> small, List<String> big){
        System.out.println("Small : " + small);
        System.out.println("Big : " + big);
    }

    private static Map<Integer, String> getSizeToNameMap(Set<Planet> planetSet) {

        Map<Integer, String> sizeToNameMap = new HashMap<>();

        for (Planet planet : planetSet) {
            sizeToNameMap.put(planet.getSize(), planet.getName());
        }

        return sizeToNameMap;
    }

    private static Map<String, Planet> getNameToPlanetMap(List<Planet> planets) {

        Map<String, Planet> nameToPlanetMap = new HashMap<>();

        for (Planet planet : planets) {
            nameToPlanetMap.put(planet.getName(), planet);
        }

        return nameToPlanetMap;
    }


    private Set<Planet> getPlanetSet(List<Planet> planets) {
        return new HashSet<>(planets);
    }

    private void printPlanets(Set<Planet> planets) {
        System.out.println("Planets : ");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    private void printPlanets(List<Planet> planets) {
        System.out.println("Planets : ");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }



    private List<Planet> getPlanets() {

        List<Planet> planets = new ArrayList<>();

        planets.add(new Planet(1, "Mercury", 3302, "Grayish and Rocky", 0));
        planets.add(new Planet(2, "Venus", 7520, "Yellowis white", 0));
        planets.add(new Planet(3, "Earth", 7917, "Blue and Green", 1));
        planets.add(new Planet(4, "Mars", 4212, "Red", 2));
        planets.add(new Planet(5, "Jupiter", 86881, "Brown with white clouds", 79));
        planets.add(new Planet(6, "Saturn", 72366, "Yellowish with Rings", 82));
        planets.add(new Planet(7, "Uranus", 31518, "Light Blue/Green", 27));
        planets.add(new Planet(8, "Neptune", 30598, "Dark Blue", 14));
        planets.add(new Planet(9, "Pluto", 1473, "Brown and White with some Red", 5));

        return planets;
    }
}
