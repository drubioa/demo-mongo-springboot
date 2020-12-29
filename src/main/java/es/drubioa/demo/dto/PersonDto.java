package es.drubioa.demo.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonDto {

    private String name;
    private String surname;
    private Integer age;
    private String nif;

}
