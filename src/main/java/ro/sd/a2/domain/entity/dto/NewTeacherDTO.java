package ro.sd.a2.domain.entity.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NewTeacherDTO {

    private String teacherId;

    private String entitling;

    private String name;

    private String email;

    private String password;

    private String npc;

    private String street;

    private String city;

    private String country;

    private String postalCode;
}
