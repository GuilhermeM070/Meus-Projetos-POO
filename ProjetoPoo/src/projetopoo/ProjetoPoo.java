package projetopoo;
public class ProjetoPoo {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        var gaf = new Gafanhoto[2];
        gaf [0] = new Gafanhoto("Guilherme", 22, "M", "Gui");
        gaf [1] = new Gafanhoto("Facebookson", 32, "F", "FCBK");
           
        Visualizacao visualizacao [] = new Visualizacao [5]; 
        visualizacao [0] = new Visualizacao(gaf[0], v[2]);
        visualizacao[0].avaliar();
        System.out.println(visualizacao[0].toString());
        
        visualizacao[1] = new Visualizacao(gaf[0], v[1]);
        visualizacao[1].avaliar(75.0f);
        System.out.println(visualizacao[1].toString());
        
        
        
        
        //System.out.println("VÍDEOS\n-------------------");
        //System.out.println(v[0].toString());
        //System.out.println(v[1].toString());
        //System.out.println(v[2].toString());
        //System.out.println("\nGAFANHOTO\n--------------");
        //System.out.println(gaf[0].toString());
        //System.out.println(gaf[1].toString());
    }
}
