import javax.swing.JOptionPane;

public class Carro extends Auto {

    public Carro(String marca, String ncarro, int ano) {
        super(marca, ncarro, ano);
     
    }

    public void venda(){
        this.setMarca("porshe");
        this.setNcarro("911");
        this.setAno(2014);

        JOptionPane.showMessageDialog(null,
               "a marca do carro é : " + this.getMarca() +
                "/n O nome do carro é: " + this.getNcarro() +      
                "/n O ano é: " + this.getAno()  
        );
    }
    
}
