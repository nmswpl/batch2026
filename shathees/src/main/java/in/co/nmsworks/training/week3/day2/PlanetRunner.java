package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {
        PlanetRunner pr = new PlanetRunner();
        List<Planet> planets = pr.getPlanets();
        pr.printPlanest(planets);
        Set<Planet> planetSet = pr.getPlanetSet(planets);
        printPlanest(planetSet);
        Map<String,Planet> map = getNameToPlanet(planets);
        System.out.println("-----map--------");
        System.out.println(map);
        Map<Integer,String> sizeToNameMap =getSizeToMap(planetSet);
        System.out.println(sizeToNameMap);
        pr.classifyPlanet(planets);
        System.out.println("-------Moons--------");
        pr.moonToName(planets);


    }//List

    private void moonToName(List<Planet> planets) {
        Map<Integer,List<String>> hm = new HashMap<>();
        List<String> groupByList = new ArrayList<>();
        for (Planet planet : planets) {
            groupByList = hm.get(planet.getNoOfMoons());
            if(groupByList == null){
                groupByList = new ArrayList<>();
                hm.put(planet.getNoOfMoons(),groupByList);
            }
            groupByList.add(planet.getName());

        }
        for (Map.Entry<Integer, List<String>> integerListEntry : hm.entrySet()) {
            System.out.println(integerListEntry.getKey());
            System.out.println(integerListEntry.getValue());

        }
    }

    private  void classifyByMoons(List<Planet> planets) {
        Map<Integer,String> moons = new HashMap<>();
        for (Planet planet : planets) {
            moons.put(planet.getNoOfMoons(),planet.getName());
        }
        for (Map.Entry<Integer, String> integerStringEntry : moons.entrySet()) {
            System.out.println("no of moons : "+integerStringEntry.getKey()+"  planet : "+integerStringEntry.getValue());

        }


    }

    private  void classifyPlanet(List<Planet> planets) {
        List<String>small = new ArrayList<>();
        List<String>large =new ArrayList<>();
        for (Planet planet : planets) {
            if (planet.getSize() < 10000){
                small.add(planet.getName());
            }else {
                large.add(planet.getName());
            }


        }
        printPlanet(small,large);

    }

    private static void printPlanet(List<String> small, List<String> large) {
        System.out.println("-------small planets-----");
        System.out.println(small);
        System.out.println("-------large planets-----");
        System.out.println(large);
    }

    private static Map<Integer, String> getSizeToMap(Set<Planet> planetSet) {
        HashMap<Integer,String> hm =new HashMap<>();
        for (Planet planet : planetSet){
            hm.put(planet.getSize(),planet.getName());
        }
        return hm;
    }

    private static Map<String, Planet> getNameToPlanet(List<Planet> planets) {
        Map<String,Planet>map = new HashMap<>();
        for (Planet planet : planets){
            map.put(planet.getName(),planet);
        }
        return map;
    }

    private static void printPlanest(Collection<Planet> planetSet) {
        System.out.println("-----set------");
        for (Planet planet : planetSet) {
            System.out.println(planet);

        }
    }

    private Set<Planet> getPlanetSet(List<Planet> planets) {
        Set<Planet> set =new HashSet<>();
        return  new HashSet<>(planets);
    }



    private  List<Planet> getPlanets() {
        List<Planet>planets = new LinkedList<>();
        planets.add(new Planet("Mercury",3032,"Grayish and rocky",0));
        planets.add(new Planet("Venus",7520,"Yellowish-white",0));
        planets.add(new Planet("Earth",7917,"Blue and green",1));
        planets.add(new Planet("Mars",4212,"Red",2));
        planets.add(new Planet("Jupiter",86881,"Brown with white clouds",79));
        planets.add(new Planet("Saturn",	72366,"Yellowish with rings",82));
        planets.add(new Planet("Uranus",31518,"Light blue/green",27));
        planets.add(new Planet("Neptune",30598,"dark blue",14));
        planets.add(new Planet("Pluto",1473,"Brown and white with some red",5));
        return planets;


    }
}
