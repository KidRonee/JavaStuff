public class TableTennisRacket extends Equipment {
    private boolean needNewPad;

    public TableTennisRacket(){}

    public TableTennisRacket(int id, String locker, boolean needReplacement, boolean needNewPad) {
        super(id, locker, needReplacement);
        this.needNewPad = needNewPad;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nLocker: %s\nNeed replacement: %s\nNeed new pad: %s", getId(), getLocker(),isNeedReplacement(), isNeedNewPad());
    }

    public boolean isNeedNewPad() {
        return needNewPad;
    }

    public void setNeedNewPad(boolean needNewPad) {
        this.needNewPad = needNewPad;
    }
}
