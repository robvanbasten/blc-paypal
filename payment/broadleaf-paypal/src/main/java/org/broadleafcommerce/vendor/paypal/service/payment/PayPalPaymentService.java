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

package org.broadleafcommerce.vendor.paypal.service.payment;

import java.util.Map;

import org.broadleafcommerce.common.vendor.service.exception.PaymentException;
import org.broadleafcommerce.common.vendor.service.monitor.ServiceStatusDetectable;
import org.broadleafcommerce.common.vendor.service.type.ServiceStatusType;
import org.broadleafcommerce.vendor.paypal.service.payment.message.PayPalPaymentRequest;
import org.broadleafcommerce.vendor.paypal.service.payment.message.PayPalPaymentResponse;

/**
 * @author Jeff Fischer
 */
public interface PayPalPaymentService extends ServiceStatusDetectable {

    public PayPalPaymentResponse process(PayPalPaymentRequest paymentRequest) throws PaymentException;

    public ServiceStatusType getServiceStatus();

    public Integer getFailureReportingThreshold();

    public void setFailureReportingThreshold(Integer failureReportingThreshold);

    public String getUser();

    public void setUser(String merchantId);

    public String getServerUrl();

    public void setServerUrl(String serverUrl);

    public String getLibVersion();

    public void setLibVersion(String libVersion);

    public String getSignature();

    public void setSignature(String signature);

    public String getPassword();

    public void setPassword(String password);

    public String getUserRedirectUrl();

    public void setUserRedirectUrl(String userRedirectUrl);

    public Map<String, String> getAdditionalConfig();

    public void setAdditionalConfig(Map<String, String> additionalConfig);

    public String getCancelUrl();

    public void setCancelUrl(String cancelUrl);

    public String getReturnUrl();

    public void setReturnUrl(String returnUrl);

}
