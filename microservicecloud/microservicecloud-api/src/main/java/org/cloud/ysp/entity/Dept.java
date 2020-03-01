package org.cloud.ysp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author pai
 * @date 2020/2/5
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String dbSource;

    public Dept(String dname) {
        this.dname = dname;
    }
}
