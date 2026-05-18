

class Day{
    public static void main(String[] args) {
        int dayNo = 5; // Example day number
        String weekDay;

        switch (dayNo) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "Invalid day number";
        }

        System.out.println("The week day for day number " + dayNo + " is: " + weekDay);
    }
}