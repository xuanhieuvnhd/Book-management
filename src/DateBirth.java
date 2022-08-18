public class DateBirth {
    private int date,month,year;
    public DateBirth() {
    }

    public DateBirth(int ngay, int thang, int nam) {
        this.date = ngay;
        this.month = thang;
        this.year = nam;
    }

    public int getNgay() {
        return date;
    }

    public void setNgay(int ngay) {
        this.date = ngay;
    }

    public int getThang() {
        return month;
    }

    public void setThang(int thang) {
        this.month= thang;
    }

    public int getNam() {
        return year;
    }

    public void setNam(int nam) {
        this.year = nam;
    }

    @Override
    public String toString() {
        return "NgaySinh: [" +
                "ngay: " + date +
                ", thang: " + month +
                ", nam: " + year +
                ']';
    }
}
