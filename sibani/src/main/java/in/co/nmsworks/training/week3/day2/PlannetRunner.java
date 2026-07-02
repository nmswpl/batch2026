package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class PlannetRunner {
    public static void main(String[] args) {
        PlannetRunner plannetRunner = new PlannetRunner();
        List<Plannet> plannets = plannetRunner.getPlannets();
        plannetRunner.printPlannet(plannets);

        Set<Plannet> plannetSet = plannetRunner.getPlannetSet(plannets);
        plannetRunner.printPlannetSet(plannetSet);

        for (Plannet plannet : plannets) {
            System.out.println(plannet.getName());
        }

        Map<String, Plannet> plannetMap = plannetRunner.getPlannetMap(plannets);
        Map<Integer, String> sizeToName = plannetRunner.sizeToNameMap(plannetSet);

        plannetRunner.classifyPlannet(plannets);

        plannetRunner.classifyBasedOnMoon(plannets);


    }

    private void classifyBasedOnMoon(List<Plannet> plannets) {
        Map<Integer, List<String>> sizeToNameMap = new HashMap<>();
        for (Plannet plannet : plannets) {
            Integer numOfMoons = plannet.getNoOfMoons();
            List<String> planetNameList = sizeToNameMap.get(numOfMoons);
            if (planetNameList == null) {
                planetNameList = new ArrayList<>();
                sizeToNameMap.put(numOfMoons, planetNameList);
            }
            planetNameList.add(plannet.getName());
        }
        for (Map.Entry<Integer, List<String>> entries : sizeToNameMap.entrySet()) {
            System.out.println("Size of Moons : " + entries.getKey() + " " + "Planet Name List : " + entries.getValue());
        }
    }

    private void classifyPlannet(List<Plannet> plannets) {
        List<String> smallPlannet = new ArrayList<>();
        List<String> largePlannet = new ArrayList<>();
        for (Plannet plannet : plannets) {
            if (plannet.getSize() >= 10000) {
                largePlannet.add(plannet.getName());
            }
            else {
                smallPlannet.add(plannet.getName());
            }
        }
        printPlannet(smallPlannet, largePlannet);
    }

    private void printPlannet(List<String> smallPlannet, List<String> largePlannet){
        System.out.println(smallPlannet);
        System.out.println(largePlannet);
    }

    private  Map<Integer, String> sizeToNameMap(Set<Plannet> plannetSet) {
        Map<Integer, String> sizeToNameMap = new HashMap<>();
        for (Plannet plannet : plannetSet) {
            sizeToNameMap.put(plannet.getSize(), plannet.getName());
        }
        return sizeToNameMap;
    }

    private  Map<String, Plannet> getPlannetMap(List<Plannet> plannets) {
        Map<String, Plannet> plannetMap = new HashMap<>();
        for (Plannet plannet : plannets) {
            plannetMap.put(plannet.getName(), plannet);
        }
        return plannetMap;
    }


    private void printPlannetSet(Set<Plannet> plannetSet) {
        System.out.println("Plannet Set");
        for (Plannet plannet : plannetSet) {
            System.out.println(plannet);
        }
    }


    public Set<Plannet> getPlannetSet(List<Plannet> plannets) {
        Set<Plannet> plannetSet = new HashSet<>();
        plannetSet.addAll(plannets);
        return plannetSet;
    }

    private void printPlannet(List<Plannet> plannets) {
        System.out.println("Plannet List");
        for (Plannet plannet : plannets) {
            System.out.println(plannet);
        }

    }

    private List<Plannet> getPlannets() {
        Plannet plannet1 = new Plannet("Mercury", 3032, "Grayish and rocky",0);
        Plannet plannet2 = new Plannet("Venus", 7520, "Yellowish-white",0);
        Plannet plannet3 = new Plannet("Earth", 7917, "Blue and green",1);
        Plannet plannet4 = new Plannet("Mars", 4212, "Red",2);
        Plannet plannet5 = new Plannet("Jupiter", 86881, "Brown with white clouds",79);
        Plannet plannet6 = new Plannet("Saturn", 72366, "Yellowish with rings",82);
        Plannet plannet7 = new Plannet("Uranus", 31518, "Light blue/green",27);
        Plannet plannet8 = new Plannet("Neptune", 30598, "Dark Blue",14);
        Plannet plannet9 = new Plannet("Pluto", 1473, "Brown and white with some red",5);
        List<Plannet> plannet = new LinkedList<>();
        plannet.add(plannet1);
        plannet.add(plannet2);
        plannet.add(plannet3);
        plannet.add(plannet4);
        plannet.add(plannet5);
        plannet.add(plannet6);
        plannet.add(plannet7);
        plannet.add(plannet8);
        plannet.add(plannet9);
        return plannet;

    }

}
