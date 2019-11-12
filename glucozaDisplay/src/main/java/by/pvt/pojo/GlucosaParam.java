package by.pvt.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class GlucosaParam {
    @Id
    private Long id;
    @Column(name = "analyse_time")
    private Date analyseTime;
    @Column(name = "glucosa_value")
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
