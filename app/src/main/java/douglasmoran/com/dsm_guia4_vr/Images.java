package douglasmoran.com.dsm_guia4_vr;

import java.io.Serializable;

public class Images implements Serializable{

    private int id;
    private int img;

    public Images(int id, int img){
        this.id = id;
        this.img = img;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}
