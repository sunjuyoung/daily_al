package oop.observer.weather;

public interface Subject {
        public void registerObserver(Observer o);
        public void remove(Observer o);
        public void notify(Observer o);
}
