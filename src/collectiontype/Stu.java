package collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Stu {
    private String[] arrays;
    private Map<String,String> maps;
    private List<Course> courses;

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String[] getArrays() {
        return arrays;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "arrays=" + Arrays.toString(arrays) +
                ", maps=" + maps +
                ", courses=" + courses +
                '}';
    }
}
