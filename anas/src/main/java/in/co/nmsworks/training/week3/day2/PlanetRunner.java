package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();
        List<Planet> planets = pr.getPlanets();
        pr.printPlanet(planets);
        System.out.println();
        Set <Planet> planetSet = pr.getPlanetsSet(planets);
        pr.printPlanetSet(planetSet);
        System.out.println();
        Map<String, Planet> planetMap = getNameToPlanetMap(planets);
        pr.printPlanetMap(planetMap);
        System.out.println();
        Map<Integer, String> sizeToNameMap = getSizeToNameMap(planetSet);
        pr.classifyPlanet(planets);
        pr.groupByMoonMap(planets);
    }

    private void groupByMoonMap(List<Planet> planets) {
        System.out.println("MOON PLANET MAP");
        Map<Integer, List<String>> moonPlanetMap = new HashMap<>();
        for (Planet planet : planets) {
            Integer numOfMoons = planet.getNumOfMoons();
            List<String> planetList = moonPlanetMap.get(numOfMoons);
            if( planetList == null){
                planetList = new ArrayList<>();
                moonPlanetMap.put(numOfMoons,planetList);
            }
            planetList.add(planet.getName());

        }
        System.out.println(moonPlanetMap);
    }

    private void classifyPlanet(List<Planet> planets) {
        List<String> small = new ArrayList<>();
        List<String> large = new ArrayList<>();
        for (Planet planet : planets) {
            if(planet.getDiaInMiles() >= 10000){
                large.add(planet.getName());
            }
            else{
                small.add(planet.getName());
            }
        }
        printPlanet(small, large);
    }

    private void printPlanet(List<String> smallPlanet, List<String> largePlanet){
        System.out.println("SMALL PLANETS \n" + smallPlanet);
        System.out.println("LARGE PLANETS \n" + largePlanet);
    }

    private static Map<Integer, String> getSizeToNameMap(Set<Planet> planetSet) {
        Map<Integer, String> planetMap2 = new HashMap<>();
        for (Planet planet : planetSet) {
            planetMap2.put(planet.getDiaInMiles(), planet.getName());
        }
        return planetMap2;
    }

    private void printPlanetMap(Map<String, Planet> planetMap) {
        System.out.println("PLANET MAP");
        System.out.println(planetMap);
    }

    private static Map<String, Planet> getNameToPlanetMap(List<Planet> planets) {
        Map<String, Planet> planetMap = new HashMap<>();
        for (Planet planet : planets) {
            planetMap.put(planet.getName(), planet);
        }
        return planetMap;
    }

    private void printPlanetSet(Set<Planet> planetSet) {
        System.out.println("PLANET SET");
        for (Planet planet : planetSet) {
            System.out.println(planet);
        }
    }

    private Set<Planet> getPlanetsSet(List<Planet> planets) {
        return new HashSet<>(planets);
    }


    private void printPlanet(List<Planet> planets) {
        System.out.println("PLANET LIST");
        for (Planet planet : planets) {
            System.out.println(planet);
        }

    }

    private List<Planet> getPlanets() {
        List<Planet> planets = new LinkedList<>();
        planets.add(new Planet("mercury", 3032, "Grayish and rocky", 0));
        planets.add(new Planet("Venus",	7520	,"Yellowish-white",	0));
        planets.add(new Planet("Earth",	7917,	"Blue and green",	1));
        planets.add(new Planet("Mars",	4212,	"Red",	2));
        planets.add(new Planet("Jupiter",	86881,	"Brown with white clouds",	79));
        planets.add(new Planet("Saturn",	72366,	"Yellowish with rings",	82));
        planets.add(new Planet("Uranus",	31518,	"Light blue/green",	27));
        planets.add(new Planet("Neptune",	30598,"Dark blue",	14));
        planets.add(new Planet("Pluto",	1473,	"Brown and white with some red",	5));

        return planets;
    }
}
