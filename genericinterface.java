interface Repository<T> {
    void save(T entity);
    T findById(T id);
}
class GenericRepository<T> implements Repository<T> {

    public void save(T entity) {
        System.out.println("Saving: " + entity);
    }

    public T findById( T id) {
        return id;
    }
}
public class genericinterface {
    public static void main(String[] args) {
        GenericRepository<Integer> gen = new GenericRepository<>();
        GenericRepository<String> gen2 = new GenericRepository<>();

        System.out.println(gen.findById(23));
        System.out.println(gen2.findById("Hello"));
        gen.save(200);
        gen2.save("Two Hundred");
    }
}
