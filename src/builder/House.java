package builder;

public class House {
    private Type type;
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasGarden;

    public House(Type type, int windows, int doors, int rooms, boolean hasGarage, boolean hasGarden, boolean hasSwimPool){
        this.type=type;
        this.doors=doors;
        this.rooms=rooms;
        this.windows=windows;
        this.hasGarage=hasGarage;
        this.hasGarden=hasGarden;
        this.hasSwimPool=hasSwimPool;
    }
    public Type getType(){
        return type;
    }
    public int windows(){
        return windows;
    }
    public int doors(){
        return doors;
    }
    public int rooms(){
        return rooms;
    }
    public boolean isHasGarage(){
        return hasGarage;
    }
    public boolean isHasSwimPool(){
        return hasSwimPool;
    }
    public boolean isHasGarden(){
        return hasGarden;
    }
}
