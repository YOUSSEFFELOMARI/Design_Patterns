package BehavioralPatterns.ChainOfResponsibility;

public class JobApplication {

    public String applicanName;
    public String jobTitle;
    public String jobCode;
    public StringBuilder comments;

    public void showComments(){
        System.out.println(comments.toString());
    }
}
