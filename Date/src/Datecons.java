public class Datecons {
    private int day;
    private int mes;
    private int ano;
 
    public Datecons(int var1, int var2, int var3) {
       this.day = var1;
       this.mes = var2;
       this.ano = var3;
    }
 
    public void setAno(int var1) {
       this.ano = var1;
    }
 
    public void setDay(int var1) {
       this.day = var1;
    }
 
    public void setMes(int var1) {
       this.mes = var1;
    }
 
    public int getAno() {
       return this.ano;
    }
 
    public int getMes() {
       return this.mes;
    }
 
    public int getDay() {
       return this.day;
    }
 
    public String getDate() {
       return String.format("%d / %d / %d", this.mes, this.day, this.ano);
    }
 }
