package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();
        List<Planet> planets = pr.getPlanets();
        Set<Planet> planetSet = pr.getPlanetSet(planets);
        pr.printPlanets(planets);
        pr.getPlanetSet(planets);
        pr.printPlanets(planets);
        System.out.println("Get the planet name using using planet id as name :");
        Map<String,Planet> nameToPlanetMap = getNameToPlanetMap(planets);
        System.out.println(nameToPlanetMap);
        Map<Integer,Planet> sizeToNameMap = getSizeToPlanetMap(planetSet);
        System.out.println(sizeToNameMap);
        pr.classifyPlanets(planets);
        System.out.println("Splitting planets based on Moons count : ");
        pr.moonsCountToNameMap(planets);

    }



    private void moonsCountToNameMap(List<Planet> planets){
        Map<Integer, List<String>> moonsCountToNameMap = new HashMap<>();
        for (Planet planet : planets) {
            Integer noOfMoons = planet.getNoOfMoons();
            List<String> listOfPlanets = moonsCountToNameMap.get(noOfMoons);
            if(listOfPlanets==null){
                listOfPlanets = new ArrayList<>();
                moonsCountToNameMap.put(noOfMoons,listOfPlanets);
            }
            listOfPlanets.add(planet.getName());

        }
        System.out.println(moonsCountToNameMap);


    }


    private void classifyPlanets(List<Planet> planets){
        List<String> smallPlanets= new ArrayList<>();
        List<String> largePlanets= new ArrayList<>();
        for (Planet planet : planets) {
            if(planet.getDiaInMiles()>10000){
                largePlanets.add(planet.getName());
            }
            else{
                smallPlanets.add(planet.getName());
            }
        }
        printPlanet(smallPlanets,largePlanets);
    }

    private void printPlanet(List<String> smallPlanets, List<String> largePlanets){
        System.out.println(smallPlanets);
        System.out.println(largePlanets);
    }


    private static Map<Integer, Planet> getSizeToPlanetMap(Set<Planet> planetSet) {
        Map<Integer,Planet> planetSizeMap = new HashMap<>();
        for (Planet planet : planetSet) {
            planetSizeMap.put(planet.getDiaInMiles(),planet);
        }
        return planetSizeMap;
    }

    private static Map<String, Planet> getNameToPlanetMap(List<Planet> planets) {
        Map<String,Planet> planetMap = new HashMap<>();
        for (Planet planet : planets) {
            planetMap.put(planet.getName(),planet);
        }
        return planetMap;
    }


    private Set<Planet> getPlanetSet(List<Planet> planets) {
        Set<Planet> planetSet = new HashSet<>();
        planetSet.addAll(planets);
        return planetSet;
    }



    private void printPlanets(List<Planet> planets) {
        System.out.println("List of Planets : ");
        for (Planet planet : planets) {
            System.out.println(planet);

        }
    }

    private List<Planet> getPlanets() {
        List<Planet> planets = new LinkedList<>();
        Planet pr1 = new Planet("Mercury",3032,"Grayish and rocky",0);
        Planet pr2 = new Planet("Venus",7520,"Yellowish-white",0);
        Planet pr3 = new Planet("Earth",7917,"Blue and green",1);
        Planet pr4 = new Planet("Mars",4212,"Red",2);
        Planet pr5 = new Planet("Jupiter",86881,"Brown with white clouds",79);
        Planet pr6 = new Planet("Saturn",2366,"Yellowish with rings",82);
        Planet pr7 = new Planet("Uranus",31518,"Light blue/green",27);
        Planet pr8 = new Planet("Neptune",30598,"Dark blue",14);
        Planet pr9 = new Planet("Pluto",1473,"Brown and white with some red",5);

        planets.add(pr1);
        planets.add(pr2);
        planets.add(pr3);
        planets.add(pr4);
        planets.add(pr5);
        planets.add(pr6);
        planets.add(pr7);
        planets.add(pr8);
        planets.add(pr9);

        return planets;

    }
}
