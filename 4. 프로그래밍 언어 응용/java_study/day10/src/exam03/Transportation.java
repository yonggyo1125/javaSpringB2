package exam03;

public enum Transportation {
    BUS("버스", 1450) {
        @Override
        public int getTotal(int no) {
            return getBasicFare() * no;
        }
    },
    SUBWAY("지하철", 1450) {
        @Override
        public int getTotal(int no) {
            return getBasicFare() * no;
        }
    },
    TAXI("택시", 4500) {
        @Override
        public int getTotal(int no) {
            return getBasicFare() * no;
        }
    };

    private String title;
    private int basicFare; // 기본 요금

    Transportation(String title, int basicFare) {
        this.title = title;
        this.basicFare = basicFare;
    }

    public String getTitle() {
        return title;
    }

    public abstract int getTotal(int no);

    public int getBasicFare() {
        return basicFare;
    }
}
