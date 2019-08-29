/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcTransferQryDetailRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferQryDetailRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryDetailRspField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcTransferQryDetailRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeDate(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_TradeCode_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_FutureSerial_get(swigCPtr, this);
  }

  public void setFutureID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_FutureID_set(swigCPtr, this, value);
  }

  public String getFutureID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_FutureID_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setBankSerial(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_BankSerial_set(swigCPtr, this, value);
  }

  public int getBankSerial() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_BankSerial_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_BankAccount_get(swigCPtr, this);
  }

  public void setCertCode(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_CertCode_set(swigCPtr, this, value);
  }

  public String getCertCode() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_CertCode_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_CurrencyCode_get(swigCPtr, this);
  }

  public void setTxAmount(double value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_TxAmount_set(swigCPtr, this, value);
  }

  public double getTxAmount() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_TxAmount_get(swigCPtr, this);
  }

  public void setFlag(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_Flag_set(swigCPtr, this, value);
  }

  public char getFlag() {
    return jctpv6v3v16x64apiJNI.CThostFtdcTransferQryDetailRspField_Flag_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryDetailRspField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcTransferQryDetailRspField(), true);
  }

}
