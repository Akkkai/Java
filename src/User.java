import java.io.Serializable;


public class User implements Serializable {
    private final static long serialVersionUID = 123456L;
    private transient int age;
    private String name;
}
