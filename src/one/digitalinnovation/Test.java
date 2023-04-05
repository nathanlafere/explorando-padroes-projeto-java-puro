package one.digitalinnovation;

import one.digitalinnovation.facade.Facade;
import one.digitalinnovation.singleton.SingletonEager;
import one.digitalinnovation.singleton.SingletonLazy;
import one.digitalinnovation.singleton.SingletonLazyHolder;
import one.digitalinnovation.strategy.Comportamento;
import one.digitalinnovation.strategy.ComportamentoAlerta;
import one.digitalinnovation.strategy.ComportamentoDormir;
import one.digitalinnovation.strategy.ComportamentoPadrao;
import one.digitalinnovation.strategy.ComportamentoSaudacao;
import one.digitalinnovation.strategy.Robo;

public class Test {
    public static void main(String[] args) {

        // Singleton
        System.out.println("=-".repeat(9)+"==SingletonLazy=="+"-=".repeat(9));
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("=-".repeat(9)+"==SingletonEager=="+"-=".repeat(9));
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("=-".repeat(9)+"==SingletonLazyHolder=="+"-=".repeat(9));
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy
        System.out.println("-=".repeat(30));
        Comportamento padrao = new ComportamentoPadrao();
        Comportamento dormir = new ComportamentoDormir();
        Comportamento alerta = new ComportamentoAlerta();
        Comportamento saudacao = new ComportamentoSaudacao();

        Robo robo = new Robo();
        robo.setComportamento(dormir);
        robo.mover();
        robo.setComportamento(alerta);
        robo.mover();
        robo.setComportamento(saudacao);
        robo.mover();
        robo.setComportamento(padrao);
        robo.mover();
        //Tentei criar uma sequência que faça sentido para aqueles robôs de entrada de restaurantes
    
        //Facade
        System.out.println("-=".repeat(30));
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "48134-250");
        System.out.println("-=".repeat(30));
        facade.migrarCliente("Claudia", "26824-130");
    

    }
    
}
