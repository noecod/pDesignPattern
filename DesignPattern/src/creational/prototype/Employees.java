package creational.prototype;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        empList = list;
    }

    public void loadData() {
        // read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    /**
     * Deep copy ...
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        List<String> temp = new ArrayList<>(getEmpList());
        return new Employees(temp);
    }
}
