package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {


    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();

        List<Planet> planetList = pr.getPlanetsList();
        pr.printPlanetList(planetList);

        Set<Planet> planetSet = pr.getPlanetSet(planetList);
        pr.printPlanetSet(planetSet);

        Map<String, Planet> nameToPlanet = pr.getNameToPlanetMap(planetList);
        System.out.println(nameToPlanet);

        Map<Integer, String> sizeToNameMap = pr.getSizeToNameMap(planetSet);
        System.out.println(sizeToNameMap);

        pr.classifyPlanets(planetList);
        pr.groupByMoon(planetList);
    }

    private void groupByMoon(List<Planet> planetList) {

        Map<Integer, List<String>> maps = new HashMap<>();
        for (Planet planet : planetList){
            Integer noOfMoons = planet.getNoOfMoons();
            List<String> list = maps.get(noOfMoons);
            if (list == null){
                list = new ArrayList<>();
                maps.put(noOfMoons, list);
            }

            list.add(planet.getName());
        }
        System.out.println(maps);
    }

    private void classifyPlanets(List<Planet> planetList) {
        List<String> small = new ArrayList<>();
        List<String> large = new ArrayList<>();

        for (Planet p : planetList) {

            if (p.getDiaInMiles() > 10000) {
                large.add(p.getName());
            }
            else{
                small.add(p.getName());
            }
        }
        printPlanets(small, large);
    }

    private void printPlanets(List<String> small, List<String> large) {
        System.out.println("small : " + small);
        System.out.println("large : " + large);
    }

    private Map<Integer, String> getSizeToNameMap(Set<Planet> planetSet) {
        Map<Integer, String> map = new HashMap<>();
        for (Planet pl : planetSet) {
            map.put(pl.getDiaInMiles(), pl.getName());
        }
        return map;
    }

    private Map<String, Planet> getNameToPlanetMap(List<Planet> planetList){
       Map<String , Planet> map = new HashMap<>();
       for (Planet pla : planetList){
           map.put(pla.getName(), pla);

       }
       return map;

    }


    private void printPlanetSet(Set<Planet> planetSet) {
        for (Planet pl : planetSet){
            System.out.println(pl);
        }
    }


    private Set<Planet> getPlanetSet(List<Planet> planets) {
        System.out.println("Planet Set ");
        Set<Planet> planetSet = new HashSet<>();
        planetSet.addAll(planets);
        return planetSet;
    }

    private void printPlanetList(List<Planet> planets) {
        for (Planet planet : planets){
            System.out.println(planet);
        }
    }

    private List<Planet> getPlanetsList() {
        List<Planet> planet = new LinkedList<>();
        planet.add(new Planet("Mercury", 3032, "Grayish and rocky", 0));
        planet.add(new Planet("Venus", 7520, "Yellowish-white", 0));
        planet.add(new Planet("Earth", 7917, "Blue and green", 1));
        planet.add(new Planet("Mars", 4212, "Red", 2));
        planet.add(new Planet("Jupiter", 86881, "Brown with white clouds", 79));
        planet.add(new Planet("Saturn", 72366, "Yellowish with rings", 82));
        planet.add(new Planet("Uranus", 31518, "Light blue/green", 27));
        planet.add(new Planet("Neptune", 30598, "Dark blue", 14));
        planet.add(new Planet("Pluto", 1473, "Brown and white with some red", 5));
        return planet;

    }

}
