public class Main {

        public static void main(String[] args) {
            int numFields = 64;
            long grainsOnLastField = calculateGrainsOnLastField(numFields);

            System.out.println("Anzahl der Reiskörner auf dem letzten Feld: " + grainsOnLastField);
        }

        public static long calculateGrainsOnLastField(int numFields) {
            long grains = 1;

            for (int i = 1; i < numFields; i++) {
                grains *= 2;
            }

            return grains;
        }
}