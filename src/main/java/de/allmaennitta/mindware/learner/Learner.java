package de.allmaennitta.mindware.learner;

import javax.persistence.*;
import java.lang.Long;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Learner {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String name = "";

    private String profession = "";
    private Integer birthyear;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @OneToOne(optional=false)
//    @JoinColumn(name = "ORDER_ID")
//    private MarketingRecord mrecord;

}
//    insert into learner(id, name, profession, birthyear) values (1, 'Hugo', 'Mathematician', '1963');
//        insert into learner(id, name, profession, birthyear) values (2, 'Ulla', 'Carpenter', '1969');
//        insert into learner(id, name, profession, birthyear) values (3, 'Jennifer', 'Lawyer', '1977');
//        insert into learner(id, name, profession, birthyear) values (4, 'Kevin', 'German Literature', '1989');
//        insert into learn_statistics(id, learner, action) values (1, 1, 1);
//        insert into learn_statistics(id, learner, action) values (2, 2, 2);
//        insert into learn_statistics(id, learner, action) values (3, 2, 1);
//        insert into learn_statistics(id, learner, action) values (4, 3, 1);
//        insert into actions(id, name) values (1, 'addItem');
//        insert into actions(id, name) values (2, 'removeItem');