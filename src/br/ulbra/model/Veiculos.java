
package br.ulbra.model;

/**
 * @author JPGR
 */
public class Veiculos {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private String motor;
    private int km;
    private double valorFipe;
    
    public Veiculos(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca.toUpperCase();
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo.toLowerCase();
    }

    public int getano() {
        return ano;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor.toUpperCase();
    }
    
        public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa.toUpperCase();
    }
    
        public String getmotor() {
        return motor;
    }

    public void setmotor(String motor) {
        this.motor = motor.toUpperCase();
    }
    
        public int getkm() {
        return km;
    }

    public void setkm(int km) {
        this.km = km;
    }
    
        public double getvalorFipe() {
        return valorFipe;
    }

    public void setvalorFipe(double valorFipe) {
        this.valorFipe = valorFipe;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", Marca=" + marca + ", Modelo=" + modelo + ", Ano=" + ano + ", Cor=" + cor + ", Placa=" +
        placa + ", Motor=" + motor + ", Km=" + km + ", Tabela Fipe=" + valorFipe +'}';
    }

    void add(Veiculos veiculos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
