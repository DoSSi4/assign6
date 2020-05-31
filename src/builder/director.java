package builder;

public class director {
    public void constructPool(Builder builder){
        builder.setType(Type.WITH_POOL);
        builder.windows(4);
        builder.doors(2);
        builder.rooms(4);
        builder.isHasGarage(false);
        builder.isHasGarden(false);
        builder.isHasSwimPool(true);
    }
    public void constructGarage(Builder builder){
        builder.setType(Type.WITH_GARAGE);
        builder.windows(3);
        builder.doors(1);
        builder.rooms(3);
        builder.isHasGarage(true);
        builder.isHasGarden(false);
        builder.isHasSwimPool(false);
    }
    public void constructGarden(Builder builder){
        builder.setType(Type.WITH_GARDEN);
        builder.windows(5);
        builder.doors(3);
        builder.rooms(6);
        builder.isHasGarage(false);
        builder.isHasGarden(true);
        builder.isHasSwimPool(false);
    }
}
