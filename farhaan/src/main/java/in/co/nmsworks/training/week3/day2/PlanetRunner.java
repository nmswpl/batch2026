package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();
        System.out.println("------------------------------------------ LIST -----------------------------------------");
        List<Planet> planets = pr.getPlanets();
        pr.printPlanets(planets);
        System.out.println("------------------------------------------- SET -----------------------------------------");
        Set<Planet> planetSet = pr.getPlanetSet(planets);
        pr.printPlanets(planetSet);
        System.out.println("------------------------------------------- MAP -----------------------------------------");
        Map<String, Planet> planetMap = pr.getPlanetMap(planets);
        System.out.println(planetMap);
        Map<Integer, String> sizeMap = sizeToNameMap(planetSet);
        System.out.println(sizeMap);
        System.out.println("------------------------------------------- Planet by size -----------------------------------------");
        pr.classifyPlanets(planets);
        Map<Integer, List<String>> newMap = pr.moonToName(planets);

        System.out.println("------------------------------------------- Planet by No of Moons -----------------------------------------");
        pr.mapPrint(newMap);
    }

    private void mapPrint(Map<Integer, List<String>> map){
        for (Integer i : map.keySet()) {
            System.out.println(i + " :: " + map.get(i));
        }
    }

    private Map<Integer, List<String>> moonToName(List<Planet> planetList){
        Map<Integer, List<String>> moonMap = new HashMap<>();
        List<String> groupedPlanets = new ArrayList<>();
        for (Planet planet : planetList) {
            groupedPlanets =  moonMap.get(planet.getNoOfMoons());
            if(groupedPlanets == null){
                groupedPlanets = new ArrayList<>();
                moonMap.put(planet.getNoOfMoons(), groupedPlanets);
            }
            groupedPlanets.add(planet.getName());
        }
        return moonMap;
    }

    private void classifyPlanets(List<Planet> planetList){
        List<String> small = new ArrayList<>();
        List<String> large = new ArrayList<>();

        for (Planet planet : planetList) {
            if(planet.getSize() > 10000){
                large.add(planet.getName());
            }
            else {
                small.add(planet.getName());
            }
        }
        printPlanet(small, large);
    }

    private void printPlanet(List<String> smallPlanets, List<String> largePlanets){
        System.out.println(smallPlanets);
        System.out.println(largePlanets);
    }

    private static Map<Integer, String> sizeToNameMap(Set<Planet> set) {
        Map<Integer, String> sizeNameMap = new HashMap<>();
        for (Planet planet : set) {
            sizeNameMap.put(planet.getSize(),planet.getName());
        }
        return sizeNameMap;
    }


    private Map<String, Planet> getPlanetMap(List<Planet> list) {
        Map<String,Planet> planets = new HashMap<>();
        for (Planet planet : list) {
            planets.put(planet.getName(),planet);
        }
        return planets;
    }

    private Set<Planet> getPlanetSet(List<Planet> list) {
        return new HashSet<>(list);
    }

    private void printPlanets(Collection<Planet> list) {
        for (Planet planet : list) {
            System.out.println(planet);
        }
    }

    private List<Planet> getPlanets() {

        List<Planet> planetList = new LinkedList<>();
        planetList.add(new Planet("Mercury", 3032, "Grayish and rocky"	, 0));
        planetList.add( new Planet("Venus", 7520, "Yellowish White"	, 0));
        planetList.add(new Planet("Earth", 7917, "Blue Green"	, 1));
        planetList.add(new Planet("Mars", 4212, "Red"	, 2));
        planetList.add(new Planet("Jupiter", 86881, "Brown with white clouds"	, 79));
        planetList.add(new Planet("Saturn", 72366, "Yellowish with rings"	, 82));
        planetList.add(new Planet("Uranus", 31518, "Light blue/green"	, 27));
        planetList.add(new Planet("Neptune", 30598, "Dark blue"	, 14));
        planetList.add(new Planet("Pluto", 1473, "Brown and white with some red"	, 5));

        return planetList;
    }


}
