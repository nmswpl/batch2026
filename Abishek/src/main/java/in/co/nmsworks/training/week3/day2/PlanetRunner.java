package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.*;

public class PlanetRunner {

    public static void main(String[] args) {
        PlanetRunner runner = new PlanetRunner();
        List<Planet> planets = runner.getPlanets();
        runner.printPlanets(planets);
        Set<Planet> planetSet = runner.getPlanetsSet(planets);
        runner.printPlanetsSet(planetSet);
        Map<String, Planet> nameToPlanet = getNameToPlanet(planetSet);
        runner.printPlanetsMap(nameToPlanet);
        Map<Integer, String> sizeToName = getSizeToName(planetSet);
        runner.printPlanetssize(sizeToName);
        classifyPlanet(planets);
        runner.classifyNumberOfPlanet(planets);
    }

    private void classifyNumberOfPlanet(List<Planet> planets) {
        List<String> name  = new ArrayList<>();
        Map<Integer, List<String>> mp = new HashMap<>();
        for (Planet p:planets)
        {
            List<String> planetNames;
            if (mp.containsKey(p.getNumberOfMoons()))
            {
                planetNames = mp.get(p.getNumberOfMoons());
            }
            else
            {
                planetNames = new ArrayList<>();
                mp.put(p.getNumberOfMoons(), planetNames);
            }
            planetNames.add(p.getName());

        }
        for (Map.Entry<Integer, List<String>> entry : mp.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }

    private static void classifyPlanet(List<Planet> planets) {

        List<String> small = new ArrayList<>();
        List<String> large = new ArrayList<>();

        for (Planet planet : planets)
        {
            if( planet.getSize() > 10000)
                large.add(planet.getName());
            else
                small.add(planet.getName());
        }
        printPlanet(small,large);
    }
    private static void printPlanet(List<String> small, List<String> large)
    {
        System.out.println(small);
        System.out.println(large);
    }

    private void printPlanetssize(Map<Integer, String> sizeToName) {

        System.out.println();
        for (Map.Entry<Integer, String> mp : sizeToName.entrySet())
        {
            System.out.println(mp.getKey()+": "+mp.getValue());
        }
    }

    private static Map<Integer, String> getSizeToName(Set<Planet> planetSet) {

        Map<Integer, String> newMap = new HashMap<>();

        for (Planet s : planetSet)
        {
            newMap.put(s.getSize(),s.getName());
        }
        return  newMap;
    }

    private void printPlanetsMap(Map<String, Planet> nameToPlanet) {

        System.out.println();
        for (Map.Entry<String, Planet> mp : nameToPlanet.entrySet())
        {
            System.out.println(mp.getKey()+": "+mp.getValue());
        }
    }

    private static Map<String, Planet> getNameToPlanet(Set<Planet> planetSet) {

        Map<String, Planet> newMap = new HashMap<>();

        for (Planet s : planetSet)
        {
            newMap.put(s.getName(),s);
        }
        return  newMap;
    }

    private void printPlanetsSet(Set<Planet> planets) {
        System.out.println();
        for (Planet p : planets)
        {
            System.out.println(p);
        }
    }

    private Set<Planet> getPlanetsSet(List<Planet> planets) {
        Set<Planet> planetSet = new HashSet<>();
        for (Planet p : planets)
        {
            planetSet.add(p);
        }
        return planetSet;
    }

    private void printPlanets(List<Planet> planets) {

        for (Planet p : planets)
        {
            System.out.println(p);
        }

    }

    private List<Planet> getPlanets() {

        List<Planet> planets = new LinkedList<>();
        Planet planet1 = new Planet("Mercury",3302,	"Grayish and rocky",0);
        Planet planet2 = new Planet("Venus",7520,	"Yellowish-white",0);
        Planet planet3 = new Planet("Earth",7917,	"Blue and green",1);
        Planet planet4 = new Planet("Mars",4212,	"red",2);
        Planet planet5 = new Planet("Jupiter",86881,	"Brown with white clouds",79);
        Planet planet6 = new Planet("Saturn",72366,	"Yellowish with rings",82);
        Planet planet7 = new Planet("Urenus",31518,	"Light blue/green",27);
        Planet planet8 = new Planet("Neptune",30598,	"Dark blue",14);
        Planet planet9 = new Planet("Pluto",1473,	"Brown and white with some red",5);

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
