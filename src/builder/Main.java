package builder;


public class Main {
    public static void main(String[] args) {
		HouseBuilder builder = new HouseBuilder();
		House house = builder.getResult();
		Manual manual = new Manual(4,2,4,false,true, false);
		System.out.println("House builded!");
		System.out.println("House manual: \n"+ manual.print());

    }
}
