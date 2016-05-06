package evino.test.com.br.testevino.models;

/**
 * Created by techresult on 06/05/2016.
 */
public class Purchase {

    private Integer id;
    private Wine wine;
    private Integer quantity;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Wine getWine(){
        return wine;
    }

    public void setWine(Wine wine){
        this.wine = wine;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
