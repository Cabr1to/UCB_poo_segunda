package Gato;

import javax.swing.JOptionPane;
public class Cat{
    private String name;
    private String birth;
    private Double peso;

    public Cat(String name, String birth, Double peso){
        this.name = name;
        this.birth = birth;
        this.peso = peso;
    }

    public String setName(String name){
        return this.name = name;
    }

    public void miar(){
        JOptionPane.showMessageDialog(null, name + "Miou");
    }
}