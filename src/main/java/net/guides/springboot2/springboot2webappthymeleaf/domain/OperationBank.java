package net.guides.springboot2.springboot2webappthymeleaf.domain;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Getter
@Setter
@ToString
public class OperationBank {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Integer price;
}
