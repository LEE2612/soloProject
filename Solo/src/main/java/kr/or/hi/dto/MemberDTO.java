package kr.or.hi.dto;

import java.time.LocalDate;

import org.apache.commons.lang3.builder.ToStringExclude;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Domin Layer
 */

@Data
@EqualsAndHashCode(of="memId")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class MemberDTO {
	
	private String memId;
	private String memPass;
	private String memName;
	@ToStringExclude
	private String memRegno1;
	@ToStringExclude
	private String memRegno2;
	private LocalDate memBir;
	private String memZip;
	private String memAdd1;
	private String memAdd2;
	private String memHometel;
	private String memComtel;
	private String memHp;
	private String memMail;
	private String memJob;
	private String memLike;
	private String memMemorial;
	private LocalDate memMemorialday;
	private Integer memMileage;
	private String memDelete;
	private String memRole;
}
