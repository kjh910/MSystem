package com.manage.result;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @개요: DB에서 가져온 수치연산 결과값을 자바 변수로 넣는 Entity 클래스
 * @처리내용: 각 Repository에서 처리한 쿼리 결과값을 ViewResult변수에 넣음
 * @Method Name : 
 */
public class ViewResult {

	private final String createdAtConvertToString;
	private final Long countByCreatedAt;

	public ViewResult(String createdAtConvertToString, Long countByCreatedAt) {
		super();
		this.createdAtConvertToString = createdAtConvertToString;
		this.countByCreatedAt = countByCreatedAt;
	}

	public String getCreatedAtConvertToString() {
		return createdAtConvertToString;
	}

	public Long getCountByCreatedAt() {
		return countByCreatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countByCreatedAt == null) ? 0 : countByCreatedAt.hashCode());
		result = prime * result + ((createdAtConvertToString == null) ? 0 : createdAtConvertToString.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ViewResult other = (ViewResult) obj;
		if (countByCreatedAt == null) {
			if (other.countByCreatedAt != null)
				return false;
		} else if (!countByCreatedAt.equals(other.countByCreatedAt))
			return false;
		if (createdAtConvertToString == null) {
			if (other.createdAtConvertToString != null)
				return false;
		} else if (!createdAtConvertToString.equals(other.createdAtConvertToString))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("createdAtConvertToString")
				.append("countByCreatedAt")
				.toString();
	}
}
