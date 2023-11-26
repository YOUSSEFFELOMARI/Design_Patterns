package BehavioralPatterns.ChainOfResponsibility;

public class TechnicalHandler extends BaseHandler{

    void toNext(JobApplication request){
        if (_nextHandler!=null)
            _nextHandler.handleRequest(request);
        else {
            request.comments.append("End By Technical.\n");
            request.showComments();
        }
    }
    @Override
    public void handleRequest(JobApplication request) {
        if (request.jobCode.equals("5678")){
            request.comments.append("Technical handler comment.\n");
            toNext(request);
        }else{
            toNext(request);
        }
    }
}
