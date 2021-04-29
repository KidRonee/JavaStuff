public class Ball extends Equipment {
    private boolean needAir;
    private String ballType;

    public Ball(){}

    public Ball(int id, String locker, boolean needReplacement, boolean needAir) {
        super(id, locker, needReplacement);
        this.needAir = needAir;
    }

    public Ball(int id, String locker, boolean needReplacement,String ballType, boolean needAir) {
        super(id, locker, needReplacement);
        this.needAir = needAir;
        this.ballType = ballType;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nLocker: %s\nNeed replacement: %s\nNeed air: %s\nBall type: %s", getId(), getLocker(),isNeedReplacement(), isNeedAir(), getBallType());

    }

    public boolean isNeedAir() {
        return needAir;
    }

    public void setNeedAir(boolean needAir) {
        this.needAir = needAir;
    }

    public String getBallType() {
        return ballType;
    }

    public void setBallType(String ballType) {
        this.ballType = ballType;
    }
}
