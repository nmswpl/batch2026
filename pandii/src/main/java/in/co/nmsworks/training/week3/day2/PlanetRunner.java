package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();

        List<Planet> planets = pr.getPlanets();
        pr.printPlanets(planets);

        Set <Planet> planetSet=pr.getPlanetset(planets);
        pr.printPlanets(planetSet);

        Map<String,Planet> nameToPlanetMap=pr.getNameToPlanetMap(planets);
        Map<Integer,String> sizeToPlanetMap=pr.sizeToNameMap(planetSet);

        Map<Integer,List<String>> moonToPlanet=pr.moonToPlanetList(planets);

        System.out.println(moonToPlanet);

//
//        System.out.println(nameToPlanetMap);
//        System.out.println(sizeToPlanetMap);

//        pr.printMap(nameToPlanetMap);



        pr.classifyPlanet(planets);



    }

    private Map<Integer, List<String>> moonToPlanetList(List<Planet> planets) {
        Map<Integer,List<String>> moonPlanet=new HashMap<>();

        for (Planet planet : planets) {
            Integer noOfMoons = planet.getNoOfMoons();
            List<String> planetName = moonPlanet.get(noOfMoons);

            if(planetName==null)
            {
                planetName=new ArrayList<>();
                moonPlanet.put(noOfMoons,planetName);
            }
            planetName.add(planet.getName());
        }

        return moonPlanet;

    }

    private void classifyPlanet(List<Planet> planets) {
        List <String> smallPlanet=new ArrayList<>();
        List <String> largePlanet=new ArrayList<>();
        for (Planet planet : planets) {
            if(planet.getDiameter()<10000)
            {
                smallPlanet.add(planet.getName());
            }
            else {
                largePlanet.add(planet.getName());
            }
        }
        printPlanet(smallPlanet,largePlanet);

    }
    private void printPlanet(List<String> smallPlanets,List<String> largePlanets)
    {
        System.out.println(smallPlanets);
        System.out.println(largePlanets);
    }


    private Map<Integer, String> sizeToNameMap(Set<Planet> planetSet) {
        Map<Integer,String> setPlanetMap=new HashMap<>();
        for (Planet planet : planetSet) {
            setPlanetMap.put(planet.getDiameter(),planet.getName());
        }
        return setPlanetMap;
    }

    private Map<String, Planet> getNameToPlanetMap(List<Planet> planets) {
        Map<String,Planet> planetMap= new HashMap<>();
        for (Planet planet : planets) {
//            System.out.println(planet.getName());
            planetMap.put(planet.getName(),planet);
        }
        return planetMap;
    }

    private void printPlanets(Set<Planet> planets) {
        System.out.println("Planets Set");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    private Set getPlanetset(List<Planet> planets) {
        Set <Planet> planetSet=new HashSet<>();
        planetSet.addAll(planets);
        return planetSet;
    }

    private void printPlanets(List<Planet> planets) {
        System.out.println("Planets List");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }


    private List<Planet> getPlanets() {
        List<Planet> planetsList = new LinkedList<>();
        planetsList.add(new Planet("Mercury", 3032, "Grayish and rocky", 0));
        planetsList.add(new Planet("Venus", 7520, "Yellowish-white", 0));
        planetsList.add(new Planet("Earth", 7917, "Blue and green", 1));
        planetsList.add(new Planet("Mars", 4212, "Red", 2));
        planetsList.add(new Planet("Jupiter", 86881, "Brown with white clouds", 79));
        planetsList.add(new Planet("Saturn", 72366, "Yellowish with rings", 82));
        planetsList.add(new Planet("Uranus", 31518, "Light blue/green", 27));
        planetsList.add(new Planet("Neptune", 30598, "Dark blue", 14));
        planetsList.add(new Planet("Pluto", 1473, "Brown and white with some red", 5));

        return planetsList;
    }
}

