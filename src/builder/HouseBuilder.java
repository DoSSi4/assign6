package builder;

public class HouseBuilder implements Builder{
    private Type type;
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasGarden;

    @Override
    public void setType(Type type) {
        this.type=type;
    }

    @Override
    public void windows(int windows) {
        this.windows=windows;
    }

    @Override
    public void rooms(int rooms) {
        this.rooms=rooms;
    }

    @Override
    public void doors(int doors) {
        this.doors=doors;
    }

    @Override
    public void isHasGarage(boolean hasGarage) {
        this.hasGarage=hasGarage;
    }

    @Override
    public void isHasGarden(boolean hasGarden) {
        this.hasGarden=hasGarden;
    }

    @Override
    public void isHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool=hasSwimPool;
    }
    public House getResult(){
        return new House(type,windows,doors,rooms,hasGarage,hasGarden,hasSwimPool);
    }
}
