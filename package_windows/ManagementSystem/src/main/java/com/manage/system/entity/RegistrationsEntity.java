package com.manage.system.entity;

import java.time.LocalDateTime;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @개요: DB에서 가져온 데이터를 자바 변수로 넣는 Entity 클래스
 * @처리내용: DB 컬럼과 같은 이름으로(캐멀타입) 데이터 타입, 명 정의된 변수에 DB결과값을 넣음
 * @Method Name : 
 */
public class RegistrationsEntity {

	private final Long id;
	private final String receiptNumber;
	private final String phoneMobile;
	private final String paymentWay;
	private final Long amount;
	private final Integer refund;
	private final String deviceId;
	private final Integer specialGoodFlag;
	private final LocalDateTime createdAt;
	private final LocalDateTime updatedAt;

	public RegistrationsEntity(Long id, String receiptNumber, String phoneMobile, String paymentWay, Long amount,
			Integer refund, String deviceId, Integer specialGoodFlag, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.receiptNumber = receiptNumber;
		this.phoneMobile = phoneMobile;
		this.paymentWay = paymentWay;
		this.amount = amount;
		this.refund = refund;
		this.deviceId = deviceId;
		this.specialGoodFlag = specialGoodFlag;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public String getReceiptNumber() {
		return receiptNumber;
	}

	public String getPhoneMobile() {
		return phoneMobile;
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

	public String getDeviceId() {
		return deviceId;
	}

	public Integer getSpecialGoodFlag() {
		return specialGoodFlag;
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
		result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((paymentWay == null) ? 0 : paymentWay.hashCode());
		result = prime * result + ((phoneMobile == null) ? 0 : phoneMobile.hashCode());
		result = prime * result + ((receiptNumber == null) ? 0 : receiptNumber.hashCode());
		result = prime * result + ((refund == null) ? 0 : refund.hashCode());
		result = prime * result + ((specialGoodFlag == null) ? 0 : specialGoodFlag.hashCode());
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
		RegistrationsEntity other = (RegistrationsEntity) obj;
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
		if (deviceId == null) {
			if (other.deviceId != null)
				return false;
		} else if (!deviceId.equals(other.deviceId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (paymentWay == null) {
			if (other.paymentWay != null)
				return false;
		} else if (!paymentWay.equals(other.paymentWay))
			return false;
		if (phoneMobile == null) {
			if (other.phoneMobile != null)
				return false;
		} else if (!phoneMobile.equals(other.phoneMobile))
			return false;
		if (receiptNumber == null) {
			if (other.receiptNumber != null)
				return false;
		} else if (!receiptNumber.equals(other.receiptNumber))
			return false;
		if (refund == null) {
			if (other.refund != null)
				return false;
		} else if (!refund.equals(other.refund))
			return false;
		if (specialGoodFlag == null) {
			if (other.specialGoodFlag != null)
				return false;
		} else if (!specialGoodFlag.equals(other.specialGoodFlag))
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
				.append("id", id)
				.append("receiptNumber", receiptNumber)
				.append("phoneMobile", phoneMobile)
				.append("paymentWay", paymentWay)
				.append("amount", amount)
				.append("refund", refund)
				.append("deviceId", deviceId)
				.append("specialGoodFlag", specialGoodFlag)
				.append("createdAt", createdAt)
				.append("updatedAt", updatedAt)
				.toString();
	}

}
