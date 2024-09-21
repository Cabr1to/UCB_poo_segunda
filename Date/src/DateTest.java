public class DateTest{
    public static void main(String[] args) {
        
        Date date = new Date(22, 8, 1998);

        System.out.println(date.getDate());

        date.setDay(21);
        date.setAno(2004);
        date.setMes(11);

        System.out.println(date.getDate());
    }
}
