package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();
        List<Planet> planets = pr.getPlanets();
        pr.printPlanets(planets);
        Set<Planet> planetSet = pr.getPlanetSet(planets);
        pr.printPlanets(planetSet);
        Map<String, Planet> nameToPlanetMap = pr.getNameToPlanetMap(planets);
        System.out.println(nameToPlanetMap);
        Map<Integer ,String> sizeToName = pr.sizeToName(planetSet);
        System.out.println(sizeToName);
        pr.classifyPlanet(planets);
        Map<Integer, List<String>> moonToNamesMap = pr.getMoonTONamesMap(planets);
        System.out.println(moonToNamesMap);
    }

    private Map<Integer, List<String>> getMoonTONamesMap(List<Planet> planets) {
        Map<Integer, List<String>> moonToNamesMap = new HashMap<>();
        for (Planet planet : planets) {
            List<String> currentNames;
            if (moonToNamesMap.containsKey(planet.getNoOfMoons())) {
                currentNames = moonToNamesMap.get(planet.getNoOfMoons());
            }
            else {
                currentNames = new ArrayList<>();
                moonToNamesMap.put(planet.getNoOfMoons(), currentNames);
            }
            currentNames.add(planet.getName());
        }
        return moonToNamesMap;
    }

    private void classifyPlanet(List<Planet> planets) {
        List<String> smallPlanet = new ArrayList<>();
        List<String> largePlanet = new ArrayList<>();
        for (Planet planet : planets) {
            if (planet.getSize() < 10000)
                smallPlanet.add(planet.getName());
            else
                largePlanet.add(planet.getName());
        }
        printPlanet(smallPlanet,largePlanet);
    }

    private void printPlanet(List<String> smallPlanets, List<String> largePlanets) {
        System.out.println(smallPlanets);
        System.out.println(largePlanets);
    }

    private Map<Integer, String> sizeToName(Set<Planet> planetSet) {
        Map<Integer ,String> sizeToName = new HashMap<>();
        for (Planet planet : planetSet) {
            sizeToName.put(planet.getSize(),planet.getName());
        }
        return sizeToName;
    }

    private Map<String, Planet> getNameToPlanetMap(List<Planet> planets) {
        Map<String, Planet> nameToPlanetMap = new HashMap<>();
        for (Planet planet : planets) {
            nameToPlanetMap.put(planet.getName(),planet);
        }
        return nameToPlanetMap;
    }

    private void printPlanets(Collection<Planet> planetSet) {
        System.out.println("-------------------------------Planet Information (Set) --------------------------------------");
        for (Planet planet : planetSet) {
            System.out.println(planet);
        }
    }

    private Set<Planet> getPlanetSet(List<Planet> planets) {
        Set<Planet> planetSet = new HashSet<>();
        planetSet.addAll(planets);
        return planetSet;
    }

    private List<Planet> getPlanets() {
        List<Planet> planets = new LinkedList<>();
        planets.add(new Planet("Mercury",3032,"Grayish and rocky",0));
        planets.add(new Planet("Venus",7520,"Yellowish-white",0));
        planets.add(new Planet("Earth",7917,"Blue and green",1));
        planets.add(new Planet("Mars",4212,"Red",2));
        planets.add(new Planet("Jupiter",86881,"Brown with white clouds",79));
        planets.add(new Planet("Saturn",72336,"Yellowish with rings",82));
        planets.add(new Planet("Uranus",31518,"Light blue/green",27));
        planets.add(new Planet("Neptune",30598,"Dark blue",14));
        planets.add(new Planet("Pluto",1473,"Brown and white with some red",5));

        return planets;
    }
}
