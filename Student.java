public class Student {
    public static void main(String[] args) {
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";
        String[] studentPairs = studentData.split(", ");
        int numStudents = studentPairs.length;
        String[] studentNames = new String[numStudents];
        int[] studentScores = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            String[] parts = studentPairs[i].split(":");
            studentNames[i] = parts[0];
            studentScores[i] = Integer.parseInt(parts[1]);
        }
        System.out.println("Original Student Data:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentNames[i] + ": " + studentScores[i]);
        }
        System.out.println("\nStudents with scores above 90:");
        for (int i = 0; i < numStudents; i++) {
            if (studentScores[i] > 90) {
                System.out.println(studentNames[i]);
            }
        }

        System.out.println("\nLetter Grades:");
        for (int i = 0; i < numStudents; i++) {
            char grade;
            int score = studentScores[i];
            switch (score / 10) {
                case 9:
                case 10:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
                    break;
            }

            System.out.println(studentNames[i] + ": " + grade);
        }
    }
}