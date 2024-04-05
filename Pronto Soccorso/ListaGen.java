public class NodoGen <T> {
    private T valore;
    private NodoGen<T> successivo;

    public NodoGen(T valore){
        this.valore = valore;
        successivo = null;
    }

    public void setValore(T valore){
        this.valore = valore;
    }

    public T getValore(){
        return valore;
    }

    public String toString(){
        return " " + valore;
    }

    public Nodo<T> getSuccessivo(){
        return successivo;
    }
}