
package Model;

import javax.swing.JOptionPane;

public class Usuario {
    private String usuario;
    private int senha;
    private String setor;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public boolean Cadastrar(){
        if (usuario.equals("Jorge")&&(setor.equals("Produção") && senha == 1234)){
            return true;
        }
        else if (usuario.equals("Matheus")&&(setor.equals("Gerencia") && senha== 4321)){
            return true;
        }
        else if (usuario.equals("João")&&(setor.equals("Diretoria") && senha == 5678)){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"Algo esta errado ;-;");
            return false;
        }
        
    }
}
