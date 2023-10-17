 

import java.util.ArrayList;

public class Biblioteca
{
    private ArrayList<Livro> catalogo;
    
    public Biblioteca()
    {
        this.catalogo = new ArrayList<Livro>();
    }

    public boolean adicionarLivro(String titulo, String autor, String isbn){
        Livro novoLivro = new Livro(titulo, autor, isbn);
        
        this.catalogo.add(novoLivro);
        
        return true;
    }
    
    public boolean removerLivro(String isbn){
        int tamanhoDoCatalogo = this.catalogo.size();
        int i;
        
        int indiceDoLivroSelecionado = -1;
        
        for(i = 0; i < tamanhoDoCatalogo; i++){
            Livro livroAtual = this.catalogo.get(i);
            
            String ISBNLivroAtual = livroAtual.getISBN();
            
            if(ISBNLivroAtual.equals(isbn)){
                indiceDoLivroSelecionado = i;
                i = tamanhoDoCatalogo;
            }
        }
        
        if (indiceDoLivroSelecionado >= 0){
            this.catalogo.remove(indiceDoLivroSelecionado);  
            return true;
        } else {
            return false;
        }
        
    } 
    
    public ArrayList<Livro> buscarPorTitulo(String titulo) {
    ArrayList<Livro> livrosEncontrados = new ArrayList<>();
    
    for (Livro livro : catalogo) {
        if (livro.getTitulo().contains(titulo)) {
            livrosEncontrados.add(livro);
        }
    }
    
    return livrosEncontrados;
    }
    
    
    public boolean emprestarLivro(String isbn) {
    for (Livro livro : catalogo) {
        if (livro.getISBN().equals(isbn)) {
            return livro.reservar();
        }
    }
    return false; 
    }

    public boolean devolverLivro(String isbn) {
    for (Livro livro : catalogo) {
        if (livro.getISBN().equals(isbn)) {
            return livro.devolver();
        }
    }
    return false; 
    }
    
    public ArrayList<Livro> listarLivros() {
    return new ArrayList<>(catalogo);
    }

}

