package compute;

public class Task {

    public interface Task<T> {
        T execute();
    }
}
