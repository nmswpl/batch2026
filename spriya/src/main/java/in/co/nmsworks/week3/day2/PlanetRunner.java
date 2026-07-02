package in.co.nmsworks.week3.day2;

import java.util.*;

public class PlanetRunner {

    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();
        List<Planet> planets = pr.getPlanets();
         pr.printPlanets(planets);

        Set<Planet> planetSet = pr.getPlanetSet();
        pr.printPlanetsSet(planetSet);

        Map<String, Planet> nameToPlanetMap = pr.getNameToPlanetMap(planets);
        pr.printPlanetMap(nameToPlanetMap);

        Map<Integer, String> sizeToName = pr.getSizeToName(planetSet);
         pr.classifyPlanet(planets);

    }
    private Map<Integer, String> getSizeToName(Set<Planet> planetSet) {

        Map<Integer, String> planetSetMap = new HashMap<>();

        for (Planet planet : planetSet) {
            planetSetMap.put(planet.getSize(), planet.getName());
        }
        return planetSetMap;
    }


    private void classifyPlanet(List<Planet> planets) {
        List<String> largePlanet = new ArrayList<>();
        List<String> smallPlanet = new ArrayList<>();

        for (Planet planet : planets) {

            if (planet.getSize() > 10000) {
                largePlanet.add(planet.getName());
            } else {
                smallPlanet.add(planet.getName());
            }
        }
        printClassifyplanet(largePlanet, smallPlanet);
    }

    private void printClassifyplanet(List<String> largePlanet, List<String> smallPlanet) {
        System.out.println(largePlanet);
        System.out.println(smallPlanet);

    }

    private Map<String, Planet> getNameToPlanetMap(List<Planet> planets) {
        Map<String, Planet> planetMap = new HashMap<>();

        for (Planet planet : planets) {
            planetMap.put(planet.getName(), planet);
        }
        return planetMap;
    }

    private void printPlanetMap(Map<String, Planet> planets) {

        for (Map.Entry<String, Planet> e : planets.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }


    private void printPlanets(List<Planet> planets) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }
        System.out.println(" ");


    }

    private List<Planet> getPlanets() {
        Planet mercury = new Planet("Mercury", 3032, "Grayish and rocky", 0);
        Planet venus = new Planet("Venus", 7520, "Yellowish-white", 0);
        Planet earth = new Planet("Earth", 7917, "Blue and green", 1);
        Planet mars = new Planet("Mars", 4212, "Red", 2);
        Planet jupiter = new Planet("Jupiter", 86881, "Brown with white clouds", 79);
        Planet saturn = new Planet("Saturn", 72366, "Yellowish with rings", 82);
        Planet uranus = new Planet("Uranus", 3518, "	Light blue/green", 27);
        Planet neptune = new Planet("Neptune", 30598, "Dark blue", 14);
        Planet pluto = new Planet("Pluto", 1473, "	Brown and white with some red", 5);


        List<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);
        planets.add(pluto);

        return planets;

    }

    private Set<Planet> getPlanetSet() {
        Planet mercury = new Planet("Mercury", 3032, "Grayish and rocky", 0);
        Planet venus = new Planet("Venus", 7520, "Yellowish-white", 0);
        Planet earth = new Planet("Earth", 7917, "Blue and green", 1);
        Planet mars = new Planet("Mars", 4212, "Red", 2);
        Planet jupiter = new Planet("Jupiter", 86881, "Brown with white clouds", 79);
        Planet saturn = new Planet("Saturn", 72366, "Yellowish with rings", 82);
        Planet uranus = new Planet("Uranus", 3518, "	Light blue/green", 27);
        Planet neptune = new Planet("Neptune", 30598, "Dark blue", 14);
        Planet pluto = new Planet("Pluto", 1473, "	Brown and white with some red", 5);


        Set<Planet> planets = new HashSet<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);
        planets.add(pluto);

        return planets;
    }

    private void printPlanetsSet(Set<Planet> planets) {

        for (Planet planet : planets) {
            System.out.println(planet);
        }
        System.out.println(" ");

    }

}
