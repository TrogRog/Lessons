package MyLessons.Lesson20.Task2;

public class InstrumentMain {
    public static void main(String[] args) {
        Drum drum1 = new Drum(10);
        Guitar guitar1 = new Guitar(7);
        Guitar guitar2 = new Guitar(8);
        Trumplet trumplet1 = new Trumplet(15);
        Instrument[] instruments = {drum1, guitar1, guitar2, trumplet1};
        for (Instrument instrument:instruments){
            instrument.play();
        }
        System.out.println(Instrument.KEY);


    }
}
