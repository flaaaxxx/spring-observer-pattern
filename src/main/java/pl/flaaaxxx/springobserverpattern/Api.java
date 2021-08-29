package pl.flaaaxxx.springobserverpattern;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

public class Api {

    public Api(MyObservable myObservable) throws InterruptedException {
        doSomething(myObservable);
    }

    public void doSomething(MyObservable myObservable) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("Loop " + i);
            Thread.sleep(1000);
            myObservable.getInfo(i);
        }
    }

}
