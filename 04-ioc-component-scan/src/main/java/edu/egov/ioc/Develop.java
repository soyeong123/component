package edu.egov.ioc;

import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* TODO 04-01. Bean 자동 등록을 위한 애노테이션 등록 */
@Service
public class Develop {
	@Autowired
	@Qualifier("programmer")
	/* TODO 04-02. Autowired 애노테이션 등록 */
	/* TODO 04-03. Qualifier를 사용하여 등록된 Bean 중에서 programmer 의존성 주입 */
	private Emp emp;

	public void coding() {
		emp.gotoOffice();
		System.out.println("회사에서 일하는 중");
		emp.getOffWork();
	}
}
