package BehavioralPatterns.ChainOfResponsibility;

public abstract class BaseHandler {

    protected BaseHandler _nextHandler;

    public void set_nextHandler(BaseHandler _nextHandler) {
        this._nextHandler = _nextHandler;
    }

    public abstract void handleRequest(JobApplication request);
}
