

public class Date {
    private  int day;
    private  int month;
    private  int year;

    // constructor
    public  Date (int d, int m , int yr){
        day = d;
        month = m;
        year = yr;
    }

    //setter methods
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public  void  DisplayDate(){

        System.out.println(  getDay() + "/" + getMonth() + "/" + getYear());

    }

    // that takes a Date object, compares it with this Date,
    //and returns a Boolean value.
    boolean equals(Date x){
        if(x.day== day && x.month == month && x.year == year ) return  true;
        else  return  false;

    }

     Date differenceDates(Date y){

        y.day =- day;
        y.month =- month;
        y.year =- year;

        return y;
    }


}
