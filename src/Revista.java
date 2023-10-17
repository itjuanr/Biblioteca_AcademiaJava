

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
            return false; //Se está reservado/emprestado não pode ser reservado.
        } else {
            this.setEmprestadoRevista(true);//Define como emprestado
            return true; //Retorna sucesso
        }
    }
    
    public boolean devolver(){
        boolean revistaEstaEmprestado = this.emprestado;
        if(this.isEmprestadoRevista()){ //verifica se está emprestado
            this.setEmprestadoRevista(false); //caso esteja, devolve
            return true;
        } else {
            return false; //não está emprestado
        }
    }
    
    
    @Override
    public boolean imprimir() {
    if (isEmprestadoRevista()) {
        System.out.println("Revista est� emprestada, n�o � poss�vel imprimir."); 
        return false;
    } else {
        System.out.println("Revista impressa com sucesso."); 
        this.nroCopias += 1;
        return true;
    }
    }


    public String exibir_info(){
    String informacoes = 
            "T�tulo: " + this.getTituloRevista() + 
            ", Empresa: " + this.getEmpresaRevista() +
            ", Edi��o: " + this.getEdicaoRevista();
            
        boolean revistaEmprestado = this.isEmprestadoRevista();
    if(revistaEmprestado){
            informacoes = informacoes + " (Emprestado)";
        } else {
            informacoes = informacoes + " (Dispon�vel)";
        }
        
        return informacoes;
    }

}