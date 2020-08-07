package hacc.jsfgui;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


@Named
@SessionScoped
public class Accounting implements Serializable {
    private static final long serialVersionUID =
            -1110733631123456L;
    private String name;
    private LocalDate date;
    private ArrayList<String> list;

    public Accounting(String name, LocalDate date)
    {
        this.name = name;
        this.date = date;
        String[] a = {"one", "two", "three"};
        list = (ArrayList<String>) Arrays.asList(a);
    }

    public String register() {
        return null;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
