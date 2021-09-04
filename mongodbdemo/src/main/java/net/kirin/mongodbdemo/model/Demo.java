package net.kirin.mongodbdemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@Document(collection = "demo")
public class Demo {
    @Id
    private long id;
    @Indexed(unique = true)
    private String name;
    private boolean eable;
    private Map var;
}