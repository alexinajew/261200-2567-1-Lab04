public class HealthRecord {   
    
    private int height;
    private static final int MAX_HEIGHT = 200; 
    private static final int MIN_HEIGHT = 20; 
    private static final int DEFAULT_HEGHT = 150; 
    static int maxHeight = MIN_HEIGHT;
    static int minHeight = MAX_HEIGHT;


    public HealthRecord(int height, int weight) {
        setHeight(height);
        setWeight(weight);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > MIN_HEIGHT || height < MAX_HEIGHT) {
            this.height = DEFAULT_HEGHT;
        } else {
            this.height = height;
        }
        UpdateMaxHeight();
    }

    void UpdateMaxHeight(){
        if(this.height > maxHeight){
            maxHeight = this.height;
        }
        if(this.height < minHeight){
            minHeight = this.height;
        }
    }

    public static int getMAX_HEIGHT() {
        return MAX_HEIGHT;
    }

    public static void setMAX_HEIGHT(int MAX_HEIGHT) {
        HealthRecord.maxHeight = MAX_HEIGHT;
    }

    public static int getMIN_HEIGHT() {
        return MIN_HEIGHT;
    }

    public static void setMIN_HEIGHT(int MIN_HEIGHT) {
        HealthRecord.minHeight = MIN_HEIGHT;
    }

    private int weight;
    private static final int MAX_WEIGHT = 200; 
    private static final int MIN_WEIGHT = 30;  
    private static final int DEFAULT_WEIGHT = 50; 
    static int maxWeight = MIN_HEIGHT;
    static int minWeight = MAX_HEIGHT;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > MIN_WEIGHT || weight < MAX_WEIGHT) {
            this.weight = DEFAULT_WEIGHT;
        } else {
            this.weight = weight;
        }
        UpdateMaxWeight();
    }

    void UpdateMaxWeight(){
        if(this.height > maxHeight){
            maxHeight = this.height;
        }
        if(this.height < minHeight){
            minHeight = this.height;
        }
    }

    public static int getMAX_WEIGHT() {
        return MAX_WEIGHT;
    }

    public static void setMAX_WEIGHT(int MAX_WEIGHT) {
        HealthRecord.maxWeight = MAX_WEIGHT;
    }

    public static int getMIN_WEIGHT() {
        return MIN_WEIGHT;
    }

    public static void setMIN_WEIGHT(int MIN_WEIGHT) {
        HealthRecord.minWeight = MIN_WEIGHT;
    }

    
}
