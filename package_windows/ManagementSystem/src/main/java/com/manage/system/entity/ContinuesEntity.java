package com.manage.system.entity;

import java.time.LocalDateTime;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @개요: DB에서 가져온 데이터를 자바 변수로 넣는 Entity 클래스
 * @처리내용: DB 컬럼과 같은 이름으로(캐멀타입) 데이터 타입, 명 정의된 변수에 DB결과값을 넣음
 * @Method Name : 
 */
public class ContinuesEntity {
	
	private final Long id;
	private final String memberId;
	private final String paymentWay;
	private final Long amount;
	private final Integer refund;
	private final Integer licenceAgreementSmtj;
	private final LocalDateTime createdAt;
	private final LocalDateTime updatedAt;
	
	public ContinuesEntity(Long id, String memberId, String paymentWay, Long amount, Integer refund,
			Integer licenceAgreementSmtj, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.paymentWay = paymentWay;
		this.amount = amount;
		this.refund = refund;
		this.licenceAgreementSmtj = licenceAgreementSmtj;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getPaymentWay() {
		return paymentWay;
	}

	public Long getAmount() {
		return amount;
	}

	public Integer getRefund() {
		return refund;
	}

	public Integer getLicenceAgreementSmtj() {
		return licenceAgreementSmtj;
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
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((licenceAgreementSmtj == null) ? 0 : licenceAgreementSmtj.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((paymentWay == null) ? 0 : paymentWay.hashCode());
		result = prime * result + ((refund == null) ? 0 : refund.hashCode());
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
		ContinuesEntity other = (ContinuesEntity) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (licenceAgreementSmtj == null) {
			if (other.licenceAgreementSmtj != null)
				return false;
		} else if (!licenceAgreementSmtj.equals(other.licenceAgreementSmtj))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (paymentWay == null) {
			if (other.paymentWay != null)
				return false;
		} else if (!paymentWay.equals(other.paymentWay))
			return false;
		if (refund == null) {
			if (other.refund != null)
				return false;
		} else if (!refund.equals(other.refund))
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
                .append("paymentWay",paymentWay)
                .append("amount",amount)
                .append("refund",refund)
                .append("licenceAgreementSmtj",licenceAgreementSmtj)
                .append("createdAt",createdAt)
                .append("updatedAt",updatedAt)
                .toString();
	}
	
}
