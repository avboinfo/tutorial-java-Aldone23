package Esercizi;

import java.util.ArrayList;

public class Pila<T> {
  ArrayList<T> lista;  

  public Pila(){
    lista = new ArrayList<T>();
  }

  public void push(T newElement){
    list.add(newElement);

  }

  public int size(){
    return lista.size();
  } 

  public T pop(){
    int size = lista.size();
    if (size==0) return null;
    T = lista.get(size-1);
    lista.remove(size -1);
    return x;

  }

  public String toString() {
    String s = ":\n";
    for (int i=0; i<lista.size(); i++) {
        s += lista.get(i) + "\n";
    }
    return s;
  }    
}