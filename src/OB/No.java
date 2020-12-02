package OB;

public class No {
    private No dir,esq;
    private String info;
    
    public No() {
    	
    }
    public void setDir(No dir) {
    	this.dir=dir;
    }
    public void setEsq(No esq) {
    	this.esq=esq;
    }
    public void setInfo(String info) {
    	this.info=info;
    }
    public String getInfo() {
    	return this.info;
    }
    public No getDir() {
    	return this.dir;
    }
    public No getEsq() {
    	return this.esq;
    }
    
}
