package in.co.nmsworks.training.week3.Day2;
import com.google.protobuf.Internal;

import java.util.*;

public class PlanetRunner {

    public static void main(String[] args) {
        PlanetRunner planetrunner = new PlanetRunner();
        List<Planet> planetList = planetrunner.getPlanet();
        planetrunner.printPlaent(planetList);
        System.out.println();
        System.out.println(" for set of planet -----");
        System.out.println();
        Set<Planet> planetSets= planetrunner.getPlanetSet(planetList);
        planetrunner.printPlanetSet(planetSets);
        System.out.println();
        System.out.println(" for map of planet -----");
        Map<String ,Planet> nameToPlanetMap =getNameToPlanetMap(planetList);
        System.out.println(nameToPlanetMap);

        System.out.println();
        Map<Integer, String> sizeToPlanetMap =sizeToNameMap(planetSets);
        System.out.println(sizeToPlanetMap);

        System.out.println();
        planetrunner.classifyPlanet(planetList);

        System.out.println();
        planetrunner.groupNoOfMoons(planetList);

    }

    private  void groupNoOfMoons (List<Planet> planetGroup){
        Map<Integer, List<String>> namesToMoon=new HashMap<>();

        for (Planet planet : planetGroup) {
            Integer numberOfMoon= planet.getNumberOfMoons();
            List<String> planetName=namesToMoon.get(numberOfMoon);
            if(planetName == null){
                planetName =new ArrayList<>();
                namesToMoon.put(numberOfMoon,planetName);
            }
            planetName.add(planet.getName());
        }

        for (Integer i : namesToMoon.keySet()){
            String names= namesToMoon.get(i).toString();
            System.out.println(i + " " + names);
        }
    }

    private void classifyPlanet(List<Planet> planetList){
        List<String> smallPlanets =new ArrayList<>();
        List<String> largePlanets =new ArrayList<>();
        for (Planet planet : planetList) {
            if(planet.getDiameterInMiles()< 10000){
                smallPlanets.add(planet.getName());
            }
            else{
                largePlanets.add(planet.getName());
            }
        }
        printPlanet(smallPlanets,largePlanets);
    }

    private void printPlanet(List<String> smallPlanets , List<String> largePlanets ){
        System.out.println(smallPlanets);
        System.out.println(largePlanets);
    }
    private static Map<String, Planet> getNameToPlanetMap(List<Planet> planetList) {
        Map<String,Planet> planetMap=new HashMap<>();
        for (Planet planet : planetList) {
             planetMap.put(planet.getName(),planet);
        }
        return planetMap;
    }

    private static Map<Integer, String > sizeToNameMap(Set<Planet> planetChangeSet) {
        Map<Integer, String> planetSetMap=new HashMap<>();
        for (Planet planete : planetChangeSet) {
            planetSetMap.put(planete.getDiameterInMiles(),planete.getName());
        }
        return planetSetMap;
    }



    private void printPlanetSet(Set<Planet> planetSets) {
        for (Planet planetSet : planetSets) {
            System.out.println(planetSet);
        }
    }

    private Set<Planet> getPlanetSet(List<Planet> planetList) {
        Set<Planet> planetSet= new HashSet<>();
        planetSet.addAll(planetList);
        return planetSet;
    }

    private void printPlaent(List<Planet> planets) {
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    private List<Planet> getPlanet() {
        List<Planet> listPlanet = new LinkedList<>();

        Planet planetOne = new Planet("Mercury", 3032, "Grayish and rocky", 0);
        Planet planetTwo = new Planet("Venus", 7520, "Yellowish-white", 0);
        Planet planetThree = new Planet("Earth", 7917, "Blue and green", 1);
        Planet planetFour = new Planet("Mars", 4212, "Red", 2);
        Planet planetFive = new Planet("Jupiter", 86881, "Brown with white clouds", 79);
        Planet planetSix = new Planet("Saturn", 72366, "Yellowish with rings", 82);
        Planet planetSeven = new Planet("Uranus", 31518, "Light blue/green", 27);
        Planet planetEight = new Planet("Neptune", 30598, "Dark blue", 14);
        Planet planetNine = new Planet("Pluto", 1473, "Brown and white with some red", 5);

        listPlanet.add(planetOne);
        listPlanet.add(planetTwo);
        listPlanet.add(planetThree);
        listPlanet.add(planetFour);
        listPlanet.add(planetFive);
        listPlanet.add(planetSix);
        listPlanet.add(planetSeven);
        listPlanet.add(planetEight);
        listPlanet.add(planetNine);

        return listPlanet;
    }
}
