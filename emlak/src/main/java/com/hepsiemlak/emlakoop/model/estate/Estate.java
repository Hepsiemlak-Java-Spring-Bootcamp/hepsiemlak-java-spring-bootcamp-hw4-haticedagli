package com.hepsiemlak.emlakoop.model.estate;

import com.hepsiemlak.emlakoop.enums.EstateType;
import com.hepsiemlak.emlakoop.enums.ReleaseType;
import com.hepsiemlak.emlakoop.model.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class Estate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    protected Integer id;
    @Enumerated(EnumType.STRING)
    protected EstateType estateType;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected Category category;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected Address address;
    @Column(name = "navigableByVideoCall")
    protected boolean navigableByVideoCall;
    @Column(name = "availableForLoan")
    protected boolean availableForLoan;
    @Column(name = "swap")
    protected boolean swap;
    //@Column(name = "id")
    //protected Price rentalIncome;
    @Enumerated(EnumType.STRING)
    protected ReleaseType releaseType;
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "estate_images", joinColumns = @JoinColumn(name = "estate_id"))
    protected List<Image> images = new ArrayList<>();
    @Column(name = "video")
    protected String video;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected List<Attribute> attributes = new ArrayList<>();

    protected Estate(
            EstateType estateType,
            Category category,
            Address address,
            boolean navigableByVideoCall,
            boolean availableForLoan,
            boolean swap,
            Price rentalIncome,
            ReleaseType releaseType,
            List<Image> images
    ) {
        this.id = Objects.hash(UUID.randomUUID().toString());
        this.estateType = estateType;
        this.category = category;
        this.address = address;
        this.navigableByVideoCall = navigableByVideoCall;
        this.availableForLoan = availableForLoan;
        this.swap = swap;
        //this.rentalIncome = rentalIncome;
        this.releaseType = releaseType;
        this.images = images;
    }
}
