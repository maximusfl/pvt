package by.pvt.pojo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "glucosaparam")
public class GlucosaParam {
    @Id
    @GeneratedValue
    private Long id;

    private Date analyseTime;

    private int glucosaValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAnalyseTime() {
        return analyseTime;
    }

    public void setAnalyseTime(Date analyseTime) {
        this.analyseTime = analyseTime;
    }

    public int getGlucosaValue() {
        return glucosaValue;
    }

    public void setGlucosaValue(int glucosaValue) {
        this.glucosaValue = glucosaValue;
    }
}
