package in.co.nmsworks.training.week2.day2;

public class SwitchCaseExample {
    public static void main(String[] args) {
        SwitchCaseExample swe = new SwitchCaseExample();
        swe.showEnumExample(DaysOfWeek.FRIDAY);
        swe.showEnumExample2(DaysOfWeek.FRIDAY);
        swe.showStringExample("");
    }

    private void showStringExample(String gender) {
        switch (gender) {
            case "Male":
                System.out.println("XY");
                break;

            case "Female":
                System.out.println("XX");
                break;

            default:
                System.err.println("Invalid Gender. Possible values are MALE/FEMALE");
        }
    }

    private void showEnumExample(DaysOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("First Day");
                break;

            case TUESDAY:
                System.out.println("Second Day");
                break;

            case WEDNESDAY:
                System.out.println("3");
                break;

            case THURSDAY:
                System.out.println("4");
                break;

            case FRIDAY:
                System.out.println("5");
                break;

            case SATURDAY:
                System.out.println("6");
                break;

            case SUNDAY:
                System.out.println("7");
                break;

            default:

        }
    }

    private void showEnumExample2(DaysOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("Week ENd !!");
                break;

            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Week Day !!");
                break;
        }


    }
}
