package cc.insistor.model.domain.po;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @program: cc-talent
 * @description: 基础类
 * @packagename: cc.insistor.model.domain
 * @author: cc
 * @date: 2020-12-09 15:29
 **/

@MappedSuperclass
public class BaseEntity {
    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    protected Date createTimestamp;

    /**
     * 更新时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    protected Date lastChangeTimestamp;

    public Date getCreateTimestamp() {
        return createTimestamp != null ? (Date) createTimestamp.clone() : null;
    }

    public void setCreateTimestamp(Date createTime) {
        this.createTimestamp = createTime != null ? (Date) createTime.clone() : null;
    }

    public Date getLastChangeTimestamp() {
        return lastChangeTimestamp != null ? (Date) lastChangeTimestamp.clone() : null;
    }

    public void setLastChangeTimestamp(Date modifiedTime) {
        this.lastChangeTimestamp = modifiedTime != null ? (Date) modifiedTime.clone() : null;
    }

}
