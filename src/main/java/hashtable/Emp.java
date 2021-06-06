package hashtable;

/**
 * @Author: panyusheng
 * @Date: 2021/6/6
 * @Version 1.0
 * <p>
 * 雇员类
 */
public class Emp {
    public int id;
    public String name;
    public Emp next;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}
