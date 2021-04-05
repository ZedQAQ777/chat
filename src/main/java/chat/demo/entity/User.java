package chat.demo.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {
    @Id
    @KeySql(useGeneratedKeys = true)
    private String id;
    @Column(name = "name")
    private String name;
}

