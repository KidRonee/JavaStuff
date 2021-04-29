public abstract class Equipment {
    private int id;
    private String locker;
    private boolean needReplacement;

    public Equipment(){}
    public Equipment(int id, String locker, boolean needReplacement) {
        this.id = id;
        this.locker = locker;
        this.needReplacement = needReplacement;
    }

    public abstract String toString();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocker() {
        return locker;
    }

    public void setLocker(String locker) {
        this.locker = locker;
    }

    public boolean isNeedReplacement() {
        return needReplacement;
    }

    public void setNeedReplacement(boolean needReplacement) {
        this.needReplacement = needReplacement;
    }
}
