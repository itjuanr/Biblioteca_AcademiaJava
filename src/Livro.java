public class Livro implements Imprimivel
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn)
    {
        // inicializa variáveis de instância
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }
    
    public Livro(String titulo, String autor)
    {
        // inicializa variáveis de instância
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = "";
        this.emprestado = false;
    }    
    
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public String getISBN(){
        return this.isbn;
    }
    
    public boolean isEmprestado(){
        return this.emprestado;
    }
    
    private void setEmprestado(boolean isEmprestado){
        this.emprestado = isEmprestado;
    }
    
    public boolean reservar(){
        if(this.isEmprestado()){
            return false; //Se está reservado/emprestado não pode ser reservado.
        } else {
            this.setEmprestado(true);//Define como emprestado
            return true; //Retorna sucesso
        }
    }
    
    public boolean devolver(){
        boolean livroEstaEmprestado = this.emprestado;
        if(this.isEmprestado()){ //verifica se está emprestado
            this.setEmprestado(false); //caso esteja, devolve
            return true;
        } else {
            return false; //não está emprestado
        }
    }
    
    public String exibir_info(){
        String informacoes = 
            "T�tulo: " + this.getTitulo() + 
            ", Autor: " + this.getAutor();
            
        String ISBN = this.getISBN();
        
        if (ISBN != ""){
            informacoes = informacoes + ", ISBN: " + ISBN;
        }
        
        boolean livroEmprestado = this.isEmprestado();
        if(livroEmprestado){
            informacoes = informacoes + " (Emprestado)";
        } else {
            informacoes = informacoes + " (Dispon�vel)";
        }
        
        return informacoes;
    }
    
    @Override
    public boolean imprimir(){
        if(isEmprestado()) {
        System.out.println("Livro est� emprestada, n�o � poss�vel imprimir."); 
        return false;
    } else {
        System.out.println("Livro impressa com sucesso."); 
        return true;
    }
    }
}
