package builder;

public interface Builder {
    void setType(Type type);
    void windows(int windows);
    void rooms(int rooms);
    void doors(int doors);
    void isHasGarage(boolean hasGarage);
    void isHasGarden(boolean hasGarden);
    void isHasSwimPool(boolean hasSwimPool);
}
