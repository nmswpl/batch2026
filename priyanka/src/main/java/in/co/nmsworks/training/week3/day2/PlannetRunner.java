package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlannetRunner {
    public static void main(String[] args) {
        PlannetRunner pr = new PlannetRunner();
        System.out.println("List...");
        List<Plannet> plannets = pr.getPlannets();
        pr.printPlannets(plannets);

        System.out.println();

        System.out.println("Set...");
        Set<Plannet> plannetsSet = pr.getPlannetSet(plannets);
        pr.printPlannetsSet(plannetsSet);

        Map<String , Plannet> nameToPlannetMap = getNameToPlannetMap(plannets);
//        pr.NameToPlannetMap(nameToPlannetMap);

        Map<Integer, String> sizeToNameMap = getSizeToNameMap(plannetsSet);
        pr.printSizeToNameMap(sizeToNameMap);
        pr.classifyPlannet(plannets);
        pr.groupByNoOfMoon(plannets);

    }

    private void groupByNoOfMoon(List<Plannet> plannets){
        Map<Integer,List<String>> map = new HashMap<>();
        for (Plannet plannet : plannets) {
            Integer noOfMoon=plannet.getNoOfMoons();
            List<String> planetNames = map.get(noOfMoon);
            if(planetNames ==  null){
                planetNames = new ArrayList<>();
                map.put(noOfMoon,planetNames);
            }
            planetNames.add(plannet.getName());
        }
        System.out.println("group by moon...");
        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }

    private void classifyPlannet(List<Plannet> plannets){
        List<String> small = new ArrayList<>();
        List<String > large = new ArrayList<>();
        for (Plannet plannet : plannets) {
            if(plannet.getSize()>10000){
                large.add(plannet.getName());
            }
            else{
                small.add(plannet.getName());
            }
        }
        printPlannets(small,large);
    }

    private void printPlannets(List<String> small, List<String> large) {
        System.out.println("small: "+small);
        System.out.println("Large: "+large);
    }

    private void printSizeToNameMap(Map<Integer, String> sizeToNameMap) {
        for (Integer i : sizeToNameMap.keySet()) {
            System.out.println(i + " " + sizeToNameMap.get(i));
        }
    }

    private static Map<Integer, String> getSizeToNameMap(Set<Plannet> plannetsSet) {
        Map<Integer,String> map = new HashMap<>();
        for (Plannet plannet : plannetsSet) {
            map.put(plannet.getSize(),plannet.getName());
        }
        return map;
    }

    private static Map<String, Plannet> getNameToPlannetMap(List<Plannet> plannets) {
        Map<String,Plannet> nameToPlannetMap = new HashMap<>();
        for (Plannet plannet : plannets) {
            nameToPlannetMap.put(plannet.getName(),plannet);
//            System.out.println(plannet.getName());
        }

        return nameToPlannetMap;
    }

    private void printPlannetsSet(Set<Plannet> plannetsSet) {
        for (Plannet plannet : plannetsSet) {
            System.out.println(plannet);
        }
    }


    private Set<Plannet> getPlannetSet(List<Plannet> plannets) {
        Set<Plannet> plannet = new HashSet<>();
        plannet.addAll(plannets);
        return plannet;


    }

    private void printPlannets(List<Plannet> plannets) {

        for (Plannet plannet : plannets) {
            System.out.println(plannet);
        }
    }

    private List<Plannet> getPlannets() {
        List<Plannet> plannet = new LinkedList<>();
        plannet.add(new Plannet("Mercury",3032,"Grayish and rocky",0));
        plannet.add(new Plannet("Venus",7520,"Yellowish-white",0));
        plannet.add(new Plannet("Earth",7917,"Blue and green",1));
        plannet.add(new Plannet("Mars",4212,"Red",2));
        plannet.add(new Plannet("Jupiter",86881,"Brown with white clouds",79));
        plannet.add(new Plannet("Saturn",72366,"Yellowish with rings",82));
        plannet.add(new Plannet("Uranus",31518,"Light blue/green",27));
        plannet.add(new Plannet("Neptune",30598,"Dark blue",14));
        plannet.add(new Plannet("Pluto",1473,"Brown and white with some red",5));
        return plannet;
    }
}
