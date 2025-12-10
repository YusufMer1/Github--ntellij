import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework {
    protected String courseName;
    protected String description;
    protected Date dueDate;

    public Homework(String courseName,String description,Date dueDate){
        this.courseName = courseName;
        this.description = description;
        this.dueDate = dueDate;
    }
    public String getFormattedDueDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        return sdf.format(dueDate);
    }
    public void prininfo(){
        System.out.println("courseName: " + courseName);
        System.out.println("description: " + description);
        System.out.println("dueDate: " + dueDate);

    }

}
