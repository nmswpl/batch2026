package in.co.nmsworks.training.Week3.Map.Day2;

import java.util.*;

public class PlanetRunner {
    public static void main(String[] args) {

        List<Planet> planets=getPlanets();
        printPlanets(planets);
        Set<Planet> plantSet = getPlanentSet(planets);
        printSetPlanet(plantSet);
        Map<String,Planet>nameToPlanet=getNameToPlanetMap(planets);
        printPlanet(nameToPlanet);
        Map<Integer,String>sizeToName=getSizeToMap(planets);
        classifyPlant(planets);
        Map<Integer,List<String>>value=getMoonClassify(planets);
        for(Map.Entry<Integer,List<String>>m:value.entrySet()){
            System.out.println(m);
        }

    }

    private static Map<Integer, List<String>> getMoonClassify(List<Planet> planets) {
    Map<Integer,List<String>>map=new HashMap<>();
    for(Planet planet:planets){
        Integer moon= planet.getMoons();
        List<String>plantName=new ArrayList<>();
        if(plantName==null){
            plantName=new ArrayList<>();
            map.put(moon,plantName);
        }
        plantName.add(planet.getName());
        }
    return map;
    }



    private static void classifyPlant(List<Planet> planets) {
        List<String>small=new ArrayList<>();
        List<String>large=new ArrayList<>();
        for(Planet pla:planets){
            if(pla.getSize()<9000){
                small.add(pla.getName());
            }
            else{
                large.add(pla.getName());
            }
        }
        printPlanet(small,large);
    }

    private static void classifyMoon(List<Planet>planets){


    }
    private static void printPlanet(List<String> small, List<String> large) {
        System.out.println("Small");
        System.out.println(small);
        System.out.println("large");
        System.out.println(large);
    }



    private static Map<Integer, String> getSizeToMap(List<Planet> planets) {
        Map<Integer,String>map=new HashMap<>();
        for(Planet plr:planets){
            map.put(plr.getSize(),plr.getName());
        }
        return map;
    }



    private static Map<String, Planet> getNameToPlanetMap(List<Planet> planets) {
      Map<String,Planet>map=new HashMap<>();
      for(Planet pr:planets){
          map.put(pr.getName(),pr);
      }
      return map;
    }
    private static void printPlanet(Map<String, Planet> nameToPlanet){
        for(String plr:nameToPlanet.keySet()){
            System.out.println(plr);
        }
    }

    private static Set<Planet> getPlanentSet(List<Planet> pr) {
    return new HashSet<>(pr);
    }

    private static void printSetPlanet(Set<Planet> plantSet) {
        for(Planet plr:plantSet){
            System.out.println(plr);
        }
    }

    private static void printPlanets(List<Planet> pr) {
        for(Planet pl:pr){
            System.out.println(pl);
        }
    }

    private static List<Planet> getPlanets() {
        List<Planet>pr=new LinkedList<>();
        pr.add(new Planet("Mercury",3032,"Grayish and rocky",0));
        pr.add(new Planet("Earth"	,7917,"Blue and green",1));
        pr.add(new Planet("Mars",	4212,"Red",2));
        pr.add(new Planet("Jupiter",86881	,"Brown with white clouds",79));
        pr.add(new Planet("Saturn",72366	,"Yellowish with rings",82));
        pr.add(new Planet("Uranus",31518,"Light blue/green",27));
        pr.add(new Planet("Neptune",30598,"Dark blue",14));
        pr.add(new Planet("Pluto"	,1473,"Brown and white with some red",5));

        return pr;
    }

}
