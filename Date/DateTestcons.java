public class DateTestcons {

    public static void main(String[] var0) {
       Date var1 = new Date(22, 8, 1998);
       System.out.println(var1.getDate());
       var1.setDay(21);
       var1.setAno(2004);
       var1.setMes(11);
       System.out.println(var1.getDate());
    }
 }
