package MyLessons.Lesson20.Task3;

public enum Season {
    WINTER(-10), SUMMER(20) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10), SPRING(8);

    private int avrTmperature;

    Season(int avrTmperature) {
        this.avrTmperature = avrTmperature;
    }

    public int getAvrTmperature() {
        return avrTmperature;
    }

    public void setAvrTmperature(int avrTmperature) {
        this.avrTmperature = avrTmperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }

}
