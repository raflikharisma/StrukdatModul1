public class Konsumsi<M, I> {
    private M makan;
    private I inum;

    public M getMakan(){
        return makan;
    }

    public I getInum() {
        return inum;
    }

    public void setKonsumsi(M food, I beverage) {
        this.makan = food;
        this.inum = beverage;

    }

}

