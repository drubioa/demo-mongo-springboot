package es.drubioa.demo.model;

import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonId;

@Data
public class Person {
    @BsonId
    private String id;
    private String name;
    private String surnames;
    private String nif;
    private Integer age;
}
