public class Date{
    private int day, mes, ano;

    public Date(int day, int mes, int ano){
        this.day = day;
        this.mes = mes;
        this.ano = ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }
    public int getMes(){
        return mes;
    }
    public int getDay(){
        return day;
    }

    public String getDate(){
        return String.format("%d / %d / %d", mes, day, ano);
    }
}