package builder;

public class Manual {
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasGarden;

    public Manual(int windows, int doors, int rooms, boolean hasSwimPool, boolean hasGarden, boolean hasGarage){
        this.doors=doors;
        this.rooms=rooms;
        this.windows=windows;
        this.hasGarage=hasGarage;
        this.hasGarden=hasGarden;
        this.hasSwimPool=hasSwimPool;
    }
    public String print(){
        String info = "";
        info+= "Windows amount: "+windows+"\n";
        info+= "Doors amount: "+doors+"\n";
        info+= "Rooms amount: "+rooms +"\n";
        info+= "Garage available: "+hasGarage+"\n";
        info+= "Garden available: "+hasGarden+"\n";
        info+= "SwimPool available: "+hasSwimPool+"\n";
        return info;
    }
}
