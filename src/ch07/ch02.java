package ch07;

public class ch02 {

    public static void main(String[] args) {




    }

    public static int getX(int number){
        if(number == 0 ) return 1;

        return (number -1) % 3;
    }

    public static int getY(int number){
        if(number == 0 ) return 3;

        return (number -1) % 3;
    }


    private static class Hand{
        private final int baseX;
        public final String hand;
        private int x;
        private int y;
        public final float preference;

        public Hand(String hand, int x, boolean isPreferred) {
            this.y=3;
            this.preference = isPreferred ? 0.5f : 1f;
            this.hand = hand;
            this.x = x;
            this.baseX = x;
        }
    }
}


