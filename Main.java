public class Main {
    public static void main(String[] args) {
        // Create an instance of HealthRecord with sample data
        HealthRecord record = new HealthRecord(175, 70);
        
        // Use getter methods
        System.out.println("Weight: " + record.getWeight());
        System.out.println("Height: " + record.getHeight());

        // Use setter methods
        record.setWeight(75);
        record.setHeight(180);
        System.out.println("Updated Weight: " + record.getWeight());
        System.out.println("Updated Height: " + record.getHeight());
        
        // Static methods to get and set max/min weight and height
        System.out.println("Max Weight: " + HealthRecord.getMAX_WEIGHT());
        System.out.println("Min Weight: " + HealthRecord.getMIN_WEIGHT());
        System.out.println("Max Height: " + HealthRecord.getMAX_HEIGHT());
        System.out.println("Min Height: " + HealthRecord.getMIN_HEIGHT());

        // Changing the static variables
        HealthRecord.setMAX_WEIGHT(250);
        HealthRecord.setMIN_WEIGHT(35);
        HealthRecord.setMAX_HEIGHT(260);
        HealthRecord.setMIN_HEIGHT(10);
        System.out.println("Updated Max Weight: " + HealthRecord.getMAX_WEIGHT());
        System.out.println("Updated Min Weight: " + HealthRecord.getMIN_WEIGHT());
        System.out.println("Updated Max Height: " + HealthRecord.getMAX_HEIGHT());
        System.out.println("Updated Min Height: " + HealthRecord.getMIN_HEIGHT());
    }
}
