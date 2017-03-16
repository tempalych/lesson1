/**
 * Created by artem on 16.03.17.
 */
public class Doctor {
    private int id;
    private String Name;
    private boolean Sex; // true=male; false=female;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isSex() {
        return Sex;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }

    public Doctor(int id, String name, boolean sex) {
        this.id = id;
        Name = name;
        Sex = sex;
    }

    public String ToString() {
        return "I am doctor " + this.Name + ". My id is "+this.id;
    }
}
