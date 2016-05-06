package evino.test.com.br.testevino.models;

import java.util.List;

/**
 * Created by techresult on 05/05/2016.
 */
public class Wine {

    private int id;
    private String name;
    private String thumb;
    private List<String> basicInfo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public List<String> getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(List<String> basicInfo) {
        this.basicInfo = basicInfo;
    }
}
