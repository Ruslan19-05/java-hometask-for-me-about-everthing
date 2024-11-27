package az.edu.turing.OOP;

public class Game {

    private String name;
    private String about;
    private int size;
    private int FPS;
    private int ageLimit;
    private String FOR;

    public Game(String name, String about, int size, int FPS, int ageLimit, String FOR) {
        this.setName(name);
        this.setAbout(about);
        this.size = size;
        this.FPS = FPS;
        this.ageLimit = ageLimit;
        this.FOR = FOR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;

    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size=size;
    }

    public int getFps(){
        return FPS;
    }

    public void setFps(int FPS){
        this.FPS=FPS;
    }

    public int getAgeLimit(){
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit){
        this.ageLimit=ageLimit;
    }

   public String getFor(){
        return FOR;
   }

   public void setFor(String FOR){
        this.FOR=FOR;
   }
}

