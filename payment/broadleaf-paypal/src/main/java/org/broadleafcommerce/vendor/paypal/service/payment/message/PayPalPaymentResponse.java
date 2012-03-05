/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.vendor.paypal.service.payment.message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.broadleafcommerce.common.vendor.service.message.PaymentResponse;
import org.broadleafcommerce.vendor.paypal.service.payment.type.PayPalMethodType;
import org.broadleafcommerce.vendor.paypal.service.payment.type.PayPalTransactionType;

/**
 * 
 * @author jfischer
 *
 */
public class PayPalPaymentResponse implements PaymentResponse {
		
	private static final long serialVersionUID = 1L;
	
    private boolean isErrorDetected = false;
    private boolean isSuccessful = true;
    private String errorText;
    private PayPalTransactionType transactionType;
    private PayPalMethodType methodType;
    private List<PayPalErrorResponse> errorResponses = new ArrayList<PayPalErrorResponse>();
    private Map<String, String> passThroughErrors = new HashMap<String, String>();
    private String responseToken;
    private String userRedirectUrl;
    private String correlationId;
    private String ack;

    public PayPalTransactionType getTransactionType() {
		return transactionType;
	}
	
	public void setTransactionType(PayPalTransactionType transactionType) {
		this.transactionType = transactionType;
	}
	
	public String getErrorCode() {
		throw new RuntimeException("ErrorCode not supported");
	}

	public String getErrorText() {
		return errorText;
	}

	public boolean isErrorDetected() {
		return isErrorDetected;
	}

	public void setErrorCode(String errorCode) {
		throw new RuntimeException("ErrorCode not supported");
	}

	public void setErrorDetected(boolean isErrorDetected) {
		this.isErrorDetected = isErrorDetected;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

    public List<PayPalErrorResponse> getErrorResponses() {
        return errorResponses;
    }

    public void setErrorResponses(List<PayPalErrorResponse> errorResponses) {
        this.errorResponses = errorResponses;
    }

    public Map<String, String> getPassThroughErrors() {
        return passThroughErrors;
    }

    public void setPassThroughErrors(Map<String, String> passThroughErrors) {
        this.passThroughErrors = passThroughErrors;
    }

    public PayPalMethodType getMethodType() {
        return methodType;
    }

    public void setMethodType(PayPalMethodType methodType) {
        this.methodType = methodType;
    }

    public boolean isSuccessful() {

        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public String getResponseToken() {
        return responseToken;
    }

    public void setResponseToken(String responseToken) {
        this.responseToken = responseToken;
    }

    public String getUserRedirectUrl() {
        return userRedirectUrl;
    }

    public void setUserRedirectUrl(String userRedirectUrl) {
        this.userRedirectUrl = userRedirectUrl;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PayPalPaymentResponse that = (PayPalPaymentResponse) o;

        if (isErrorDetected != that.isErrorDetected) return false;
        if (isSuccessful != that.isSuccessful) return false;
        if (ack != null ? !ack.equals(that.ack) : that.ack != null) return false;
        if (correlationId != null ? !correlationId.equals(that.correlationId) : that.correlationId != null)
            return false;
        if (errorResponses != null ? !errorResponses.equals(that.errorResponses) : that.errorResponses != null)
            return false;
        if (errorText != null ? !errorText.equals(that.errorText) : that.errorText != null) return false;
        if (methodType != null ? !methodType.equals(that.methodType) : that.methodType != null) return false;
        if (passThroughErrors != null ? !passThroughErrors.equals(that.passThroughErrors) : that.passThroughErrors != null)
            return false;
        if (responseToken != null ? !responseToken.equals(that.responseToken) : that.responseToken != null)
            return false;
        if (transactionType != null ? !transactionType.equals(that.transactionType) : that.transactionType != null)
            return false;
        if (userRedirectUrl != null ? !userRedirectUrl.equals(that.userRedirectUrl) : that.userRedirectUrl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (isErrorDetected ? 1 : 0);
        result = 31 * result + (isSuccessful ? 1 : 0);
        result = 31 * result + (errorText != null ? errorText.hashCode() : 0);
        result = 31 * result + (transactionType != null ? transactionType.hashCode() : 0);
        result = 31 * result + (methodType != null ? methodType.hashCode() : 0);
        result = 31 * result + (errorResponses != null ? errorResponses.hashCode() : 0);
        result = 31 * result + (passThroughErrors != null ? passThroughErrors.hashCode() : 0);
        result = 31 * result + (responseToken != null ? responseToken.hashCode() : 0);
        result = 31 * result + (userRedirectUrl != null ? userRedirectUrl.hashCode() : 0);
        result = 31 * result + (correlationId != null ? correlationId.hashCode() : 0);
        result = 31 * result + (ack != null ? ack.hashCode() : 0);
        return result;
    }
}
