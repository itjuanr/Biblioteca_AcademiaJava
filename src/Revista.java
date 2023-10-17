

public class Revista implements Imprimivel
{
    private String titulo;
    private String empresa;
    private String edicao;
    private boolean emprestado;
    private int nroCopias;

    public Revista(String titulo, String empresa, String edicao)
    {
        this.titulo = titulo;
        this.empresa = empresa;
        this.edicao = edicao;
        this.emprestado = false;
        this.nroCopias = 1;
    }
    
    public String getTituloRevista(){
        return this.titulo;
    }
    
    public String getEmpresaRevista(){
        return this.empresa;
    }
    
    public String getEdicaoRevista(){
        return this.edicao;
    }
    
    public boolean isEmprestadoRevista(){
        return this.emprestado;
    }
    
    private void setEmprestadoRevista(boolean isEmprestado){
        this.emprestado = isEmprestado;
    }
    
    public boolean reservar(){
        if(this.isEmprestadoRevista()){
            return false; //Se est√° reservado/emprestado n√£o pode ser reservado.
        } else {
            this.setEmprestadoRevista(true);//Define como emprestado
            return true; //Retorna sucesso
        }
    }
    
    public boolean devolver(){
        boolean revistaEstaEmprestado = this.emprestado;
        if(this.isEmprestadoRevista()){ //verifica se est√° emprestado
            this.setEmprestadoRevista(false); //caso esteja, devolve
            return true;
        } else {
            return false; //n√£o est√° emprestado
        }
    }
    
    
    @Override
    public boolean imprimir() {
    if (isEmprestadoRevista()) {
        System.out.println("Revista est· emprestada, n„o È possÌvel imprimir."); 
        return false;
    } else {
        System.out.println("Revista impressa com sucesso."); 
        this.nroCopias += 1;
        return true;
    }
    }


    public String exibir_info(){
    String informacoes = 
            "TÌtulo: " + this.getTituloRevista() + 
            ", Empresa: " + this.getEmpresaRevista() +
            ", EdiÁ„o: " + this.getEdicaoRevista();
            
        boolean revistaEmprestado = this.isEmprestadoRevista();
    if(revistaEmprestado){
            informacoes = informacoes + " (Emprestado)";
        } else {
            informacoes = informacoes + " (DisponÌvel)";
        }
        
        return informacoes;
    }

}