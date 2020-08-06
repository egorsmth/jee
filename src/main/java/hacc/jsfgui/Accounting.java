package hacc.jsfgui;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Named
@SessionScoped
public class Accounting implements Serializable {
    private static final long serialVersionUID =
            -1110733631123456L;
    private String name;
    private LocalDate date;

    public Accounting(String name, LocalDate date)
    {
        this.name = name;
        this.date = date;
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

}
