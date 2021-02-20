
package ListaMaquinaKaraoke;

import java.util.Vector;

public class MaquinaKaraoke extends Thread {
    private String fabricante;
    private String modelo;
    private Vector<Musica> musicasDisponiveis = new Vector<>();
    private Vector<Musica> playList;
    

    public MaquinaKaraoke() {
        this.playList = new Vector<>(); 
        this.musicasDisponiveis = new Vector<>(); 
        carregaMusica();
    }

    public MaquinaKaraoke(String fabricante, String modelo) {
        this.playList = new Vector<>();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.musicasDisponiveis = new Vector<>(); 
        carregaMusica();

    }

    public MaquinaKaraoke(String fabricante, String modelo, Vector<Musica> musicasDisponiveis) {
        this.playList = new Vector<>();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.musicasDisponiveis = musicasDisponiveis;
        carregaMusica();
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }
    
    @Override
    public void run(){
        
    }
    public void carregaMusica(){
        this.musicasDisponiveis.add(new Musica("maroon 5", "what lovers do", 30, 2018, "pop"));
        this.musicasDisponiveis.add(new Musica("estudantes", "ferias", 15, 2018, "saudades"));
        this.musicasDisponiveis.add(new Musica("melanie martinez", "cake", 10, 2015, "pop"));
        this.musicasDisponiveis.add(new Musica("U2", "one", 10, 2000, "rock"));
        this.musicasDisponiveis.add(new Musica("ane marie", "friends", 15, 1996, "pop"));
        this.musicasDisponiveis.add(new Musica("dua lipa", "new rules", 15, 1996, "pop"));
        
    }
    public void addMusica(int numMusica){
        if (numMusica > this.musicasDisponiveis.size() || numMusica < 1) {
            System.err.println("Essa musica não existe");
        } else {
            numMusica--;
            Musica novaMusica = this.musicasDisponiveis.get(numMusica);
            double duracaoTotal = 0;
            for (int i = 0; i < this.playList.size(); i++) {
                duracaoTotal += this.playList.get(i).getDuracao();
            }
            System.out.println("Tempo para tocar: " + duracaoTotal);

            this.playList.add(novaMusica);
        }
    }

    public void listarPlayList() {
        for (int i = 0; i < this.playList.size(); i++) {
            System.out.println(this.playList.get(i));
        }
    }
    public void listarMusicasDisponiveis(){
        for(int i = 0;i<this.musicasDisponiveis.size();i++){
            System.out.println((i+1)+" - " + this.musicasDisponiveis.get(i));
        }
    }
                                     
    public void play(){
        while(!this.playList.isEmpty()){
            Musica atual = this.playList.remove(0);
            
            double duracaoMiliSeg = atual.getDuracao()*1000;
            System.out.println("reproduz. "+atual.getNomeMusica());
            
            try {
                Thread.sleep((long)duracaoMiliSeg);
            } catch (InterruptedException ex) {
                
            }
        }
        System.out.println("PlayList Vazia");
    }
    
    public void remover(String nomeMusica, boolean removeTodas){
        for (int i = 0; i<playList.size();i++){
            if(this.playList.get(i).getNomeMusica().equalsIgnoreCase(nomeMusica)){
                this.playList.remove(i);
                if(!removeTodas){
                  break;  
                }
            }
        }
    }
    public void adia(String nomeMusica){
        for (int i = 0; i<playList.size()-1;i++){
            if(this.playList.get(i).getNomeMusica().equalsIgnoreCase(nomeMusica)){
               Musica temp = this.playList.remove(i);
               this.playList.add(i+1, temp);
               break;
            }
        }
    }
    public void adiantar(String nomeMusica){
        for (int i = 1; i<playList.size();i++){
            Musica temp = this.playList.remove(i);
            this.playList.add(i-1, temp);
            break;
        }
    }
}
