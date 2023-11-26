package BehavioralPatterns.ChainOfResponsibility;

public class HREvalHandler extends BaseHandler{

    void toNext(JobApplication request){
        if (_nextHandler!=null)
            _nextHandler.handleRequest(request);
        else {
            request.comments.append("End By Hr.\n");
            request.showComments();
        }
    }
    @Override
    public void handleRequest(JobApplication request) {
        if (request.jobCode.equals("1234")) {
            request.comments.append("HR handler comment.\n");
            toNext(request);
        }else{
            toNext(request);
        }
    }
}
