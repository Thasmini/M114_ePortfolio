public class Main {

        public static void main(String[] args) {
            int numFields = 64;
            long grainsOnLastField = calculateGrainsOnLastFieldLong(numFields);
            System.out.println("Anzahl der Reiskörner auf dem letzten Feld: " + grainsOnLastField);

            double grainsOnLastFieldTwo = calculateGrainsOnLastFieldDouble(numFields);
            System.out.println("Anzahl der Reiskörner auf dem letzten Feld: " + grainsOnLastFieldTwo);
        }

        public static long calculateGrainsOnLastFieldLong(int numFields) {
            long grains = 1;

            for (int i = 1; i < numFields; i++) {
                grains *= 2;
            }

            return grains;
        }

    public static double calculateGrainsOnLastFieldDouble(int numFields) {
        double grains = 1;

        for (int i = 1; i < numFields; i++) {
            grains *= 2;
        }

        return grains;
    }


}