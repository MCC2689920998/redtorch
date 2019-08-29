/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcExchangeOptionSelfCloseField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeOptionSelfCloseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOptionSelfCloseField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcExchangeOptionSelfCloseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVolume(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_BusinessUnit_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_HedgeFlag_get(swigCPtr, this);
  }

  public void setOptSelfCloseFlag(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_OptSelfCloseFlag_set(swigCPtr, this, value);
  }

  public char getOptSelfCloseFlag() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_OptSelfCloseFlag_get(swigCPtr, this);
  }

  public void setOptionSelfCloseLocalID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseLocalID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_SettlementID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcExchangeOptionSelfCloseField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOptionSelfCloseField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcExchangeOptionSelfCloseField(), true);
  }

}