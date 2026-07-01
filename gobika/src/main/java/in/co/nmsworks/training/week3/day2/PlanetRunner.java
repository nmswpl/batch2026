package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner planet = new PlanetRunner();
        List<Planet> planets = planet.getPlanets();
        planet.printPlants(planets);

        Set<Planet> planetSet = planet.getPlanetSet(planets);
        planet.printPlanets(planetSet);

        Map<String,Planet> planetMap = getNameToPlanetMap(planets);
        System.out.println(planetMap);
        Map<Integer,String> sizeToName = getSizeToNameMap(planetSet);
        System.out.println(sizeToName);
        classifyPlanet(planets);

        Map<Integer,List<String>> moonsToNames = getNoOfMoonsToNames(planets);
        System.out.println(moonsToNames);

    }


    private static Map<Integer, List<String>> getNoOfMoonsToNames(List<Planet> planets) {
        Map<Integer,List<String>>  moonsToName = new HashMap<>();
        for (Planet planet : planets) {
            Integer noOfMoons = planet.getNoOfMoons();
            List<String> planentNameList = moonsToName.get(noOfMoons);
            if(planentNameList == null){
                planentNameList = new ArrayList<>();
                moonsToName.put(noOfMoons,planentNameList);
            }
            planentNameList.add(planet.getName());
        }
        return moonsToName;

    }



    private static void classifyPlanet(List<Planet> planets) {
        List<String> smallPlanet = new ArrayList<>();
        List<String> largePlanet = new ArrayList<>();

        for (Planet planet : planets) {
            if (planet.getSize() < 10000){
                smallPlanet.add(planet.getName());
            }
            else {
                largePlanet.add(planet.getName());
            }
        }
        printPlanets(smallPlanet,largePlanet);

    }

    private static void printPlanets(List<String> smallPlanet, List<String> largePlanet) {
        System.out.println(smallPlanet);
        System.out.println(largePlanet);
    }

    private static Map<Integer, String> getSizeToNameMap(Set<Planet> planetSet) {
        Map<Integer,String> sizeToMap = new HashMap<>();
        for (Planet planet : planetSet) {
            sizeToMap.put(planet.getSize(), planet.getName());
        }
        return sizeToMap;
    }

    private static Map<String, Planet> getNameToPlanetMap(List<Planet> planets) {

        Map<String,Planet> planetMap = new HashMap<>();
        for (Planet planet : planets) {
            planetMap.put(planet.getName(), planet);
        }
        return planetMap;
    }

    private void printPlanets( Set<Planet> planets) {
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    private Set<Planet> getPlanetSet(List<Planet> planets) {
        Set<Planet> planetSet = new HashSet<>();
        planetSet.addAll(planets);
        return planetSet;


    }

    private void printPlants(List<Planet> planets) {
        for (Planet planet : planets) {
            System.out.println(planet);
        }


    }

    private List<Planet> getPlanets() {
        Planet mercury = new Planet("Mercury", 3032,	"Grayish and rocky",0);
        Planet venus = new Planet("Venus", 7520,	"Yellowish-white",0);
        Planet earth = new Planet("Earth", 7917,	"Blue and green",1);
        Planet mars = new Planet("Mars", 4212,	"Red",2);
        Planet jupiter = new Planet("Jupiter", 86881,	"Brown with white clouds",79);
        Planet saturn = new Planet("Saturn", 72366,	"Yellowish with rings",82);
        Planet uranus = new Planet("Uranus", 31518,	"Light blue/green",27);
        Planet neptune = new Planet("Neptune", 30598,	"Dark blue",14);
        Planet pluto = new Planet("Pluto", 1473,	"Brown and white with some red",5);
        List<Planet> planets = new LinkedList<>();
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
}
