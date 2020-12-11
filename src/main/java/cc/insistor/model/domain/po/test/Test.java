package cc.insistor.model.domain.po.test;

import cc.insistor.model.domain.po.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @program: cc-talent
 * @description: 测试
 * @packagename: cc.insistor.model.domain.po.test
 * @author: cc
 * @date: 2020-12-09 15:02
 **/
@Entity
@Table(name = "t_test")
public class Test extends BaseEntity implements Serializable {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid.hex")
    @GeneratedValue(generator = "uuid")
    private String id;

    private String name;


    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
