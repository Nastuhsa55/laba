package labaone;

import java.util.ArrayList;
import java.util.Scanner;

public class LengthCalculation {

    public String[] inputStrings() {
        String[] lines = null;

        System.out.println("Введите число строк: ");

        try (Scanner scanner = new Scanner(System.in)) {
            int linesCount = scanner.nextInt();
            scanner.nextLine();

            lines = new String[linesCount];

            for (int i = 0; i < linesCount; i++) {
                System.out.println("Введите строку №" + (i + 1) + ": ");
                lines[i] = scanner.nextLine();
            }
        }

        return lines;
    }

    public float averageStringLength(String[] lines) {
        float averageLength = 0;

        for (String a : lines) {
            averageLength += (float) a.length();
        }

        averageLength /= lines.length;
        return averageLength;
    }

    public ArrayList<String> derivation(String[] lines) {
        float averageLength = averageStringLength(lines);
        ArrayList<String> result = new ArrayList<>();
        for (String line : lines) {
            if (line.length() < averageLength) {
                result.add(line);
            }
        }
        
        return result;
    }

    public void outputStrings(String[] lines) {
        for (String line : lines) {
            System.out.println("'" + line + "' с длиной " + line.length());
        }
    }
}
