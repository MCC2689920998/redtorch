/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcQryMDTraderOfferField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryMDTraderOfferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryMDTraderOfferField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v11x64apiJNI.delete_CThostFtdcQryMDTraderOfferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryMDTraderOfferField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryMDTraderOfferField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryMDTraderOfferField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryMDTraderOfferField_ParticipantID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryMDTraderOfferField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryMDTraderOfferField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryMDTraderOfferField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcQryMDTraderOfferField(), true);
  }

}
