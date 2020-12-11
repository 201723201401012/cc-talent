package cc.insistor.dao.repository.test;

import cc.insistor.model.domain.po.test.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: cc-talent
 * @description: 测试
 * @packagename: cc.insistor.dao.repository.test
 * @author: cc
 * @date: 2020-12-09 15:34
 **/
public interface TestRepository extends JpaRepository<Test,String>, JpaSpecificationExecutor<Test> {
}
