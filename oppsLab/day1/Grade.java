class Grade {
    public static void main(String[] args) {
        int mark = 85;
        char grade;

        if (mark >= 90 && mark <= 100) {
            grade = 'O'; // Outstanding
        } else if (mark >= 80 && mark < 90) {
            grade = 'E'; // Excellent
        } else if (mark >= 70 && mark < 80) {
            grade = 'A'; // Very Good
        } else if (mark >= 60 && mark < 70) {
            grade = 'B'; // Good
        } else if (mark >= 50 && mark < 60) {
            grade = 'C'; // Average
        } else {
            grade = 'F'; // Fail
        }

        System.out.println("The grade for the mark " + mark + " is: " + grade);
    }
}