package pl.flaaaxxx.springobserverpattern;

@org.springframework.stereotype.Service
public class Service implements MyObservable {

    public Service() throws InterruptedException {
        Api api = new Api(this);
    }

    @Override
    public void getInfo(int i) {
        System.out.println("Wątek " + i + " zakończył działanie");
        System.out.println("-----------------------------------");
    }

}
