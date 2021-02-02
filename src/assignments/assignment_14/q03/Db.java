package assignments.assignment_14.q03;

public class Db {
    private String data;
    private int yint;

    public void insertData(String data, int yint){
        this.data=data;
        this.yint=yint;
        setData(data);
        setYint(yint);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
