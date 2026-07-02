package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
      PlanetRunner pr = new PlanetRunner();

        List<Planet> planetsList = pr.getPlanets();
        pr.printPlanets(planetsList);

        Set<Planet> planetsSet = pr.getPlanetsSet(planetsList);
        pr.printPlanets(planetsSet);

        Map<String, Planet> nameToPlanetMap = pr.getNameToPlanetMap(planetsList);
        System.out.println("Name to Planet Map : ");
        System.out.println(nameToPlanetMap);

        Map<Integer, String> sizeToNameMap = pr.getSizeToNameMap(planetsSet);
        System.out.println("Size to Name Map : ");
        System.out.println(sizeToNameMap);

        System.out.println("Classifying Planets : ");
        pr.classifyPlanet(planetsList);

        System.out.println("New Example : ");
        Map<Integer, List<String>> moonsToPlanetMap = pr.classifyPlanetBasedOnMoonsCount(planetsList);
        System.out.println(moonsToPlanetMap);


    }

    private Map<Integer, List<String>> classifyPlanetBasedOnMoonsCount(List<Planet> planetsList) {


        Map<Integer, List<String>> moonsCountToNameMap = new HashMap<>();

        for (Planet planet : planetsList) {
            Integer noOfMoons = planet.getNoOfMoons(); // no of moons for the persent planet object
            List<String> listOfPlanets = moonsCountToNameMap.get(noOfMoons); // getting the list of string of planets from the map of type Map(Integer, List[])
            if (listOfPlanets == null) {
                listOfPlanets = new ArrayList<>();
                moonsCountToNameMap.put(noOfMoons, listOfPlanets);

            }
            listOfPlanets.add(planet.getName());
        }
        return moonsCountToNameMap;
    }

    private void classifyPlanet(List<Planet> planetsList) {

        List<String> smallPlanets = new ArrayList<>();
        List<String> bigPlanets = new ArrayList<>();


        for (Planet planet : planetsList) {
            if (planet.getDiaInMiles() > 10000) {
                bigPlanets.add(planet.getName());
            } else {
                smallPlanets.add(planet.getName());
            }
        }

        printPlanets(smallPlanets, bigPlanets);

    }

    private Map<Integer, String> getSizeToNameMap(Set<Planet> planetsSet) {
        Map<Integer, String> sizeToNameMap = new HashMap<>();
        for (Planet planet : planetsSet) {
            sizeToNameMap.put(planet.getDiaInMiles(), planet.getName());
        }
        return sizeToNameMap;

    }

    private Map<String, Planet> getNameToPlanetMap(List<Planet> planetsList) {
        Map<String, Planet> nameToPlanetMap = new HashMap<>();

        for (Planet planet : planetsList) {
            nameToPlanetMap.put(planet.getName(), planet);
        }
        return nameToPlanetMap;

    }

    private Set<Planet> getPlanetsSet(List<Planet> planets) {
        Set<Planet> planetSet = new HashSet<>();
        for (Planet planet : planets) {
            planetSet.add(planet);
        }
        return planetSet;
    }

    private void printPlanets(Collection<Planet> planets) {
        System.out.println("Planets : ");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }


    private void printPlanets(List<Planet> planets) {
        System.out.println("Planets : ");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    private void printPlanets(Set<Planet> planets) {
        System.out.println("Set of Planets : ");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }


    private void printPlanets(List<String> smallPlanets, List<String> largePlanets) {
        System.out.println("Small Planets : ");
        System.out.println(smallPlanets);
        System.out.println("Large Planets : ");
        System.out.println(largePlanets);
    }

    private List<Planet> getPlanets() {

        List<Planet> planets = new LinkedList<>();
        Planet mercuryPlanet = new Planet("Mercury", 3032, "Grey", 0);
        Planet venusPlanet = new Planet("Venus", 7520, "Yellowish White", 0);
        Planet earthPlanet = new Planet("Earth", 7817, "Blue", 1);
        Planet marsPlanet = new Planet("Mars", 4212, "Red", 2);
        Planet jupyterPlanet = new Planet("Jupyter", 86881, "Brown", 79);
        Planet saturnPlanet = new Planet("Saturn", 72366, "Yellow", 82);
        Planet uranousPlanet = new Planet("Uranous", 31518, "Light Blue", 27);
        Planet neptunePlanet = new Planet("Neptune", 30598, "Dark Blue", 14);
        Planet plitoPlanet = new Planet("Pluto", 1473, "Brown", 5);

        planets.add(mercuryPlanet);
        planets.add(venusPlanet);
        planets.add(earthPlanet);
        planets.add(marsPlanet);
        planets.add(jupyterPlanet);
        planets.add(saturnPlanet);
        planets.add(uranousPlanet);
        planets.add(neptunePlanet);
        planets.add(plitoPlanet);

        return planets;
    }


}