package hellojpa.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member2 {

	@Id
	private Long id;
    
	@Column(name = "name")
	private String username;
    
	private Integer age;
    
	@Enumerated(EnumType.STRING)
	private RoleType roleType;
    
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date createdDate;
	private LocalDateTime createdDate;  // 최신 하이버네이트는 이렇게 가능
    
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;
    
	@Lob
	private String description;

	@Transient  // 필드 매핑 X, 주로 메모리상에서만 임시로 어떤 값을 보관하고 싶을 때 사용
	private Integer temp;
    
	//Getter, Setter…
}