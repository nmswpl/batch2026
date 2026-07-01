package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();
        List<Planet> planets = pr.getPlanets();
        System.out.println("List");
        pr.printPlanets(planets);
        pr.getPlanetsSet(planets);
        Set<Planet> planetSet = pr.getPlanetsSet(planets);
        System.out.println("Set");
        pr.printPlanetSet(planetSet);
        Map<String, Planet> nameToPlanetMap = pr.getNametoPlanetMap(planets);
        System.out.println("HAshmap");
        System.out.println(nameToPlanetMap);
        Map<Integer, String> sizeToNameMap = pr.getsizeToNameMap(planetSet);
        System.out.println(sizeToNameMap);
        pr.classifyPlanets(planets);
        Map<Integer, List<String>> noOfMoonsToName = pr.getNamebyMoon(planets);
        System.out.println(noOfMoonsToName);
    }

    private Map<Integer, List<String>> getNamebyMoon(List<Planet> planets) {
        Map<Integer, List<String>> noOfMoonsToName = new HashMap<>();
        for (Planet planet : planets) {
            Integer noOnMoons = planet.getNoOfMoons();
            List<String> planetName = noOfMoonsToName.get(noOnMoons);
            if (planetName == null) {
                planetName = new ArrayList<>();
                noOfMoonsToName.put(noOnMoons,planetName);
            }
            planetName.add(planet.getName());

        }
        return noOfMoonsToName;
    }

    private void classifyPlanets(List<Planet> planets) {
        List<String> smallPlanets = new ArrayList<>();
        List<String> largePlanets = new ArrayList<>();
        for (Planet planet : planets) {
            if (planet.getSize() > 10000) {
                largePlanets.add(planet.getName());
            }
            else {
                smallPlanets.add(planet.getName());
            }
        }
        printPlanets(smallPlanets,largePlanets);

    }

    private void printPlanets(List<String> smallPlanets, List<String> largePlanets) {
        System.out.println("Small Planets = "+smallPlanets);
        System.out.println("Large Planets = "+largePlanets);
    }

    private Map<Integer, String> getsizeToNameMap(Set<Planet> planetSet) {
        Map<Integer, String> sizeToNameMap = new HashMap<>();
        for (Planet planet : planetSet) {
            sizeToNameMap.put(planet.getSize(),planet.getName());
        }
        return sizeToNameMap;
    }

    private Map<String, Planet> getNametoPlanetMap(List<Planet> planets) {
        Map<String, Planet> planetMap = new HashMap<>();
        for (Planet planet : planets) {
            planetMap.put(planet.getName(), planet);
        }
        return planetMap;
    }

    private void printPlanetSet(Set<Planet> planetSet) {
        for (Planet planet : planetSet) {
            System.out.println(planet);
        }
    }

    private Set<Planet> getPlanetsSet(List<Planet> planets) {
        Set<Planet> planetSet = new HashSet<>();
        planetSet.addAll(planets);
        return planetSet;
    }

    private void printPlanets(List<Planet> planets) {
        for (Planet planet : planets) {
            System.out.println(planet);
        }

    }

    private List<Planet> getPlanets() {
        Planet planet1 = new Planet("Mercury",3032,"Grayish and rocky",0);
        Planet planet2 = new Planet("Venus",7520,"Yellowish-white",0);
        Planet planet3 = new Planet("Earth",7919,"Blue and green",1);
        Planet planet4 = new Planet("Mars",4212,"Red",2);
        Planet planet5 = new Planet("Jupiter",86881,"Brown with white clouds",79);
        Planet planet6 = new Planet("Saturn",72366,"Yellowish with rings",82);
        Planet planet7 = new Planet("Uranus",31518,"Light blue/green",27);
        Planet planet8 = new Planet("Neptune",30598,"Dark blue",14);
        Planet planet9 = new Planet("Pluto",1473,"Brown and white with some red",5);
        List<Planet> planets = new LinkedList<>();
        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);
        planets.add(planet9);
        return planets;
    }
}
