
package Controller;

import Model.Usuario;
import View.DiretoriaView;
import View.GerenciaView;
import View.ProducaoView;

public class UsuarioController {
    Usuario usuario = new Usuario();
    
    public void Logar(){
        boolean verifica = usuario.Cadastrar();
        if (verifica == true && usuario.getSetor().equals("Produção")){
            new ProducaoView().setVisible(true);
        }
        else if ( verifica == true && usuario.getSetor().equals("Gerencia")){
            new GerenciaView().setVisible(true);
        }
        else if (verifica == true && usuario.getSetor().equals("Direção")){
            new DiretoriaView().setVisible(true);
        }
    }
    public void Cadastrar(String usu, int sen, String set){
        usuario.setUsuario(usu);
        usuario.setSenha(sen);
        usuario.setSetor(set);
    }
}


