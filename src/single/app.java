package single;

public class app {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM public.account");
        Database bar = Database.getInstance();
        bar.query("SELECT * FROM public.account");

    }
}
