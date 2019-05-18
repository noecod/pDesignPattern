package structural.composite;

public class Demo {

    public static StringBuffer compositeBuilder = new StringBuffer();

    public static void main(String[] args) {
        CompositeComponent music = new CompositeComponent("MUSIC");
        CompositeComponent scorpions = new CompositeComponent("SCORPIONS");
        CompositeComponent dio = new CompositeComponent("DIO");
        LeafComponent track1 = new LeafComponent("Don't wary, be happy.mp3");
        LeafComponent track2 = new LeafComponent("track2.m3u");
        LeafComponent track3 = new LeafComponent("Wind of change.mp3");
        LeafComponent track4 = new LeafComponent("Big city night.mp3");
        LeafComponent track5 = new LeafComponent("Rainbow in the dark.mp3");
        music.add(track1);
        music.add(scorpions);
        music.add(track2);
        scorpions.add(track3);
        scorpions.add(track4);
        scorpions.add(dio);
        dio.add(track5);
        music.print();
    }
}
