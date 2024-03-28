package Zajecia2.ChainOfResposibility;

public abstract class ProcessingObject<T> {
    protected  ProcessingObject<T> successor;

    public void setSeccessor(ProcessingObject<T> succesor) {
        this.successor = succesor;
    }
    public T handle(T input) {
        T r = handleWork(input);
        if(successor != null) {
            return  successor.handle(r);
        }
        return r;
    }
    abstract protected  T handleWork(T input);
}
