package com.example.duarte.canoefortwo;

/**
 * Created by Duarte on 02/06/2015.
 */

public class Singleton {
    public enum State {CONNECTED , NOT_CONNECTED};

    private static Singleton instance = null;

    //TODO retirar o state daqui, n�o faz sentido estar aqui. � preciso criar uma classe que est� encarregue da connection com o servidor
    State state;


    private Singleton(){
        this.state = State.NOT_CONNECTED;
    }


    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
