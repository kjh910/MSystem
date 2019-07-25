package com.manage.system.entity;

import java.time.LocalDateTime;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @개요: DB에서 가져온 데이터를 자바 변수로 넣는 Entity 클래스
 * @처리내용: DB 컬럼과 같은 이름으로(캐멀타입) 데이터 타입, 명 정의된 변수에 DB결과값을 넣음
 * @Method Name : 
 */
public class ContinueGoodsEntity {

	private final Long id;
	private final String memberId;
	private final Long goodId;
	private final Long goodCount;
	private final String deviceId;
	private final LocalDateTime createdAt;
	private final LocalDateTime updatedAt;

	public ContinueGoodsEntity(Long id, String memberId, Long goodId, Long goodCount, String deviceId,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.goodId = goodId;
		this.goodCount = goodCount;
		this.deviceId = deviceId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public String getMemberId() {
		return memberId;
	}

	public Long getGoodId() {
		return goodId;
	}

	public Long getGoodCount() {
		return goodCount;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
		result = prime * result + ((goodCount == null) ? 0 : goodCount.hashCode());
		result = prime * result + ((goodId == null) ? 0 : goodId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
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
		ContinueGoodsEntity other = (ContinueGoodsEntity) obj;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (deviceId == null) {
			if (other.deviceId != null)
				return false;
		} else if (!deviceId.equals(other.deviceId))
			return false;
		if (goodCount == null) {
			if (other.goodCount != null)
				return false;
		} else if (!goodCount.equals(other.goodCount))
			return false;
		if (goodId == null) {
			if (other.goodId != null)
				return false;
		} else if (!goodId.equals(other.goodId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (updatedAt == null) {
			if (other.updatedAt != null)
				return false;
		} else if (!updatedAt.equals(other.updatedAt))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("id",id)
                .append("memberId",memberId)
                .append("goodId",goodId)
                .append("goodCount",goodCount)
                .append("deviceId",deviceId)
                .append("createdAt",createdAt)
                .append("updatedAt",updatedAt)
                .toString();
	}

}
