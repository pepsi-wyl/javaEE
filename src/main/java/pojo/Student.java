package pojo;

import lombok.*;
import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author by pepsi-wyl
 * @date 2022-06-16 11:10
 */

@Alias("student")

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Component
@Scope("singleton")

public class Student {
    private int id;
    private String name;
    private String sex;
}
