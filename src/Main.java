public class Main {
            public static void main(String[] args) {
                Printable camry = createObject("Camry");
                Printable corolla = createObject("Corolla");
                Printable lc200 = createObject("LC200");

                System.out.println("Information about Camry:");
                camry.printInfo();

                System.out.println("\nInformation about Corolla:");
                corolla.printInfo();

                System.out.println("\nInformation about LC200:");
                lc200.printInfo();
            }

            public static Printable createObject(String className) {
                switch (className) {
                    case "Camry":
                        return new Camry("Camry", 2022, "Red", 30000);
                    case "Corolla":
                        return new Corolla("Corolla", 2022, "Gasoline", false);
                    case "LC200":
                        return new LC200("LC200", 2022, 8000, true);
                    default:
                        throw new IllegalArgumentException("Invalid class name: " + className);
                }
            }
        }
