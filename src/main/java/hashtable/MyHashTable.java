package hashtable;

/**
 * @Author: panyusheng
 * @Date: 2021/6/6
 * @Version 1.0
 *
 * 哈希表
 */
public class MyHashTable {

    public static void main(String[] args) {
        Emp e1 = new Emp(1, "小明");
        Emp e2 = new Emp(2, "小弟弟");
        EmpList list = new EmpList();
        list.add(e1);
        list.add(e2);
        list.list();
        Emp e = list.findEmpById(1);
        System.out.println(e);

    }

}
