package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {

        PlanetRunner planetRunner = new PlanetRunner();
        List<Planet> planets =  planetRunner.getPlanetsList();
        planetRunner.printPlanetsList(planets);
        Set<Planet> planetSet = planetRunner.getPlanetSet(planets);
        planetRunner.printPlanetSet(planetSet);
        planetRunner.printPlanet(planetSet);
        Map<String,Planet> planetMap = planetRunner.getNameToPlanetMap(planets);
        planetRunner.printMapName(planetMap);
        Map<Integer,String> sizeNameMap = planetRunner.getSizeToMap(planetSet);
        planetRunner.classifyPlanet(planets);
        Map<Integer,List<String>> moonsPlanet =  planetRunner.classifyPlanetBasedMoon(planets);
        for(Map.Entry<Integer,List<String>> m : moonsPlanet.entrySet()){
            System.out.println(m);
        }
    }

    private Map<Integer,List<String>>  classifyPlanetBasedMoon(List<Planet> planets) {

        Map<Integer,List<String>> map = new HashMap<>();

//        for(Planet planet : planets){
//
//            if(map.containsKey(planet.getMoons())){
//                map.get(planet.getMoons()).add(planet.getName());
//            }
//            else {
//                List<String> list = new ArrayList<>();
//                list.add(planet.getName());
//                map.put(planet.getMoons(), list);
//            }
//        }
//

        for(Planet planet : planets){
            int moon = planet.getMoons();

            if(map.get(moon) == null){
                List<String> planetNames = new ArrayList<>();
                planetNames.add(planet.getName());
                map.put(moon, planetNames);
            }
            map.get(moon).add(planet.getName());
        }
        return map;
    }

    private void classifyPlanet(List<Planet> planets) {
        List<String> smallPlanet = new ArrayList<>();
        List<String> largePlanet = new ArrayList<>();

        for(Planet planet : planets){
            if(planet.getSize() < 10000){
                smallPlanet.add(planet.getName());
            }
            else{
                largePlanet.add(planet.getName());
            }
        }
        printPlanet(smallPlanet,largePlanet);
    }

    private void printPlanet(List<String> smallPlanets, List<String> largePlanets ){
        System.out.println("Small Planets");
        for (String name : smallPlanets){
            System.out.println(name);
        }

        System.out.println("Large Planets");
        for (String name : largePlanets){
            System.out.println(name);
        }
    }


    private Map<Integer, String> getSizeToMap(Set<Planet> planetSet) {
        Map<Integer,String> map = new HashMap<>();
        for (Planet planet : planetSet){
            map.put(planet.getSize(), planet.getName());
        }
        return map;
    }

    private void printMapName(Map<String, Planet> planetMap) {
        for (String name : planetMap.keySet()){
            System.out.println(name);
        }
    }

    private Map<String,Planet>  getNameToPlanetMap(List<Planet> planets) {
        HashMap<String, Planet> map = new HashMap<>();
        for(Planet planet : planets){
            map.put(planet.getName(), planet);
        }
        return map;
    }

    private void printPlanet(Collection<Planet> planets) {
        System.out.println("Set : ");
        for (Planet planet : planets){
            System.out.println(planet);
        }
    }

    private void printPlanetSet(Set<Planet> planetSet) {
        System.out.println("Set : ");
        for (Planet planet : planetSet){
            System.out.println(planet);
        }
    }

    private Set<Planet> getPlanetSet(List<Planet> planets) {
        return new HashSet<>(planets);
    }

    private void printPlanetsList(List<Planet> planets) {
        System.out.println("List :");
        for (Planet planet : planets){
            System.out.println(planet);
        }
    }

    private List<Planet> getPlanetsList() {
        List<Planet> planets = new LinkedList<>();
        planets.add(new Planet("Mercury",3032,"Gray",0));
        planets.add(new Planet("Venus",307,"Yellow",0));
        planets.add(new Planet("Earth",7917,"Green and Blue",1));
        planets.add(new Planet("Mars",4212,"Red",2));
        planets.add(new Planet("Jupiter",86881,"Brown",79));
        planets.add(new Planet("Saturn",72366,"Yellowish",82));
        planets.add(new Planet("Uranus",31518,"Light blue",27));
        planets.add(new Planet("Neptune",30598,"Dark blue",14));
        planets.add(new Planet("Pluto",1473,"Brown and white",5));

        return planets;
    }

}
