package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();

        System.out.println("\n LIST : \n");
        List<Planet> planetsList = pr.getPlanets();
        printPlanetsList(planetsList);

        System.out.println("\n SET : \n");
        Set<Planet> planetsSet = pr.getPlanetSet(planetsList);
        printPlanetsSet(planetsSet);

        System.out.println("\n MAP \n");
        Map<String,Planet> nameToPlanetMap = getNameToPlanetMap(planetsList);
        printPlanetMap(nameToPlanetMap);

        Map<Integer, String> map = getSizeToName(planetsSet);
        printSizeToName(map);

        classifyPlanet(planetsList);

        Map<Integer, List<String>> sizeGroup =  groupPlanets(planetsList);
        printPlanetSizeMap(sizeGroup);

    }

    private static void printPlanetSizeMap(Map<Integer, List<String>> sizeGroup) {
        for (Map.Entry<Integer, List<String>> entry : sizeGroup.entrySet()) {
            System.out.println(entry);
        }
    }

    private static Map<Integer, List<String>> groupPlanets(List<Planet> planetsList) {

        Map<Integer, List<String>> map = new HashMap<>();

        for (Planet planet : planetsList) {

            Integer key = planet.getNoOfMoons();
            List<String> value = map.get(key);

            if( value == null )
            {

                value = new ArrayList<>();
                map.put(key,value);

            }

            value.add(planet.getName());


//            map.put(planet.getNoOfMoons(), map.getOrDefault(planet.getNoOfMoons(), new ArrayList<>()));
        }

        return map;

    }

    private static void classifyPlanet(List<Planet> planetsList) {

//        List<Planet> smallPlanet = new ArrayList<>();
//        List<Planet> largePlanet = new ArrayList<>();


        List<String> smallPlanet = new ArrayList<>();
        List<String> largePlanet = new ArrayList<>();

        for (Planet planet : planetsList) {
            if( planet.getSize() < 10000 )
            {
                smallPlanet.add(planet.getName());
            }
            else
            {
                largePlanet.add(planet.getName());
            }
        }

        printPlanet(smallPlanet, largePlanet);

    }

    private static void printPlanet(List<String> smallPlanet, List<String> largePlanet) {

        System.out.println("\n Small Planets : ");
        for (String planet : smallPlanet) {
            System.out.println(planet);
        }

        System.out.println("\n Large Planets : ");
        for (String planet : largePlanet) {
            System.out.println(planet);
        }

    }


    private static void printSizeToName(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }
    }

    private static Map<Integer, String> getSizeToName(Set<Planet> planetsSet) {

        Map<Integer,String> map = new HashMap<>();
        for (Planet planet : planetsSet) {
            map.put(planet.getSize(), planet.getName());
        }
        return map;
    }

    private static void printPlanetMap(Map<String, Planet> nameToPlanetMap) {
        for (Map.Entry<String, Planet> stringPlanetEntry : nameToPlanetMap.entrySet()) {
            System.out.println(stringPlanetEntry.getKey()+" = "+stringPlanetEntry);
        }
    }

    private static Map<String, Planet> getNameToPlanetMap(List<Planet> planetsList) {
        Map<String,Planet> planetMap = new HashMap<>();

//        for (Planet planet : planetsList) {
//
//            System.out.println("Name = "+planet.getName());
//
//        }

        for (Planet planet : planetsList) {
            planetMap.put(planet.getName(),planet);
        }

        return planetMap;
    }

    private static void printPlanetsSet(Set<Planet> planetsSet) {
        for (Planet planet : planetsSet) {
            System.out.println(planet);
        }
    }

    private Set<Planet> getPlanetSet(List<Planet> planets) {

        Set<Planet> planetSet = new HashSet<>();
        planetSet.addAll(planets);
        return planetSet;

    }

    private static void printPlanetsList(List<Planet> planets) {

        for (Planet planet : planets) {
            System.out.println(planet);
        }

    }


    private ArrayList<Planet> getPlanets() {
        Planet mercury = new Planet("Mercury", 3032, 	"Grayish and rocky",	0 );
        Planet venus = new Planet("Venus",	7520,	"Yellowish-white0" , 0);
        Planet earth = new Planet("Earth",	7917,	"Blue and green",	1 );
        Planet mars = new Planet("Mars",	4212,	"Red",	2 );

        Planet jupiter = new Planet("Jupiter"	,86881,	"Brown with white clouds",	79);
        Planet saturn = new Planet("Saturn",	72366,	"Yellowish with rings",	82 );
        Planet uranus = new Planet("Uranus",	31518,	"Light blue/green",	27 );
        Planet neptune = new Planet("Neptune",	30598,	"Dark blue",	14 );
        Planet pluto = new Planet("Pluto",	1473,	"Brown and white with some red",	5 );

//        return new ArrayList<>(Arrays.asList(mercury,venus,earth,mars,jupiter,saturn,uranus,neptune,pluto)) ;
        ArrayList<Planet> planets= new ArrayList<>();
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
