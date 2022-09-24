package creationalDesigns.builder.lazy;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String cnp;
    private String name;
    private String email;
    private String phoneNumber;
}
