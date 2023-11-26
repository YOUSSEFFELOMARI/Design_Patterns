package BehavioralPatterns.ChainOfResponsibility;

public class CoFTest {
    public static void main(String[] args) {
        JobApplication jobApplication=new JobApplication();
        jobApplication.jobTitle="Software Engineer";
        jobApplication.jobCode="1234a";
        jobApplication.applicanName="Youssef";
        jobApplication.comments=new StringBuilder();
        BaseHandler HRHandler=new HREvalHandler();
        BaseHandler TechHandler=new TechnicalHandler();

        HRHandler._nextHandler=TechHandler;
        HRHandler.handleRequest(jobApplication);

    }
}
