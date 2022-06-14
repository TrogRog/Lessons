package MyLessons.Lesson20.Task4;

public enum SizeClothes {
    XXS(32){
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),S(36),M(38),L(40);

    private int euroSize;

    SizeClothes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }

}
