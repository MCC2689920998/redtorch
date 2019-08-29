/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcInstrumentField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcInstrumentField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentName(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_InstrumentName_set(swigCPtr, this, value);
  }

  public String getInstrumentName() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_InstrumentName_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ProductID_get(swigCPtr, this);
  }

  public void setProductClass(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ProductClass_set(swigCPtr, this, value);
  }

  public char getProductClass() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ProductClass_get(swigCPtr, this);
  }

  public void setDeliveryYear(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_DeliveryYear_set(swigCPtr, this, value);
  }

  public int getDeliveryYear() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_DeliveryYear_get(swigCPtr, this);
  }

  public void setDeliveryMonth(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_DeliveryMonth_set(swigCPtr, this, value);
  }

  public int getDeliveryMonth() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_DeliveryMonth_get(swigCPtr, this);
  }

  public void setMaxMarketOrderVolume(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MaxMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxMarketOrderVolume() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MaxMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMinMarketOrderVolume(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MinMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinMarketOrderVolume() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MinMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMaxLimitOrderVolume(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MaxLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxLimitOrderVolume() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MaxLimitOrderVolume_get(swigCPtr, this);
  }

  public void setMinLimitOrderVolume(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MinLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinLimitOrderVolume() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MinLimitOrderVolume_get(swigCPtr, this);
  }

  public void setVolumeMultiple(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_VolumeMultiple_set(swigCPtr, this, value);
  }

  public int getVolumeMultiple() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_VolumeMultiple_get(swigCPtr, this);
  }

  public void setPriceTick(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_PriceTick_set(swigCPtr, this, value);
  }

  public double getPriceTick() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_PriceTick_get(swigCPtr, this);
  }

  public void setCreateDate(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_CreateDate_set(swigCPtr, this, value);
  }

  public String getCreateDate() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_CreateDate_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_OpenDate_get(swigCPtr, this);
  }

  public void setExpireDate(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ExpireDate_set(swigCPtr, this, value);
  }

  public String getExpireDate() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ExpireDate_get(swigCPtr, this);
  }

  public void setStartDelivDate(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_StartDelivDate_set(swigCPtr, this, value);
  }

  public String getStartDelivDate() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_StartDelivDate_get(swigCPtr, this);
  }

  public void setEndDelivDate(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_EndDelivDate_set(swigCPtr, this, value);
  }

  public String getEndDelivDate() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_EndDelivDate_get(swigCPtr, this);
  }

  public void setInstLifePhase(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_InstLifePhase_set(swigCPtr, this, value);
  }

  public char getInstLifePhase() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_InstLifePhase_get(swigCPtr, this);
  }

  public void setIsTrading(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_IsTrading_set(swigCPtr, this, value);
  }

  public int getIsTrading() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_IsTrading_get(swigCPtr, this);
  }

  public void setPositionType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_PositionType_set(swigCPtr, this, value);
  }

  public char getPositionType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_PositionType_get(swigCPtr, this);
  }

  public void setPositionDateType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_PositionDateType_set(swigCPtr, this, value);
  }

  public char getPositionDateType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_PositionDateType_get(swigCPtr, this);
  }

  public void setLongMarginRatio(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_LongMarginRatio_set(swigCPtr, this, value);
  }

  public double getLongMarginRatio() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_LongMarginRatio_get(swigCPtr, this);
  }

  public void setShortMarginRatio(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ShortMarginRatio_set(swigCPtr, this, value);
  }

  public double getShortMarginRatio() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_ShortMarginRatio_get(swigCPtr, this);
  }

  public void setMaxMarginSideAlgorithm(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MaxMarginSideAlgorithm_set(swigCPtr, this, value);
  }

  public char getMaxMarginSideAlgorithm() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_MaxMarginSideAlgorithm_get(swigCPtr, this);
  }

  public void setUnderlyingInstrID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_UnderlyingInstrID_set(swigCPtr, this, value);
  }

  public String getUnderlyingInstrID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_UnderlyingInstrID_get(swigCPtr, this);
  }

  public void setStrikePrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_StrikePrice_set(swigCPtr, this, value);
  }

  public double getStrikePrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_StrikePrice_get(swigCPtr, this);
  }

  public void setOptionsType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_OptionsType_set(swigCPtr, this, value);
  }

  public char getOptionsType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_OptionsType_get(swigCPtr, this);
  }

  public void setUnderlyingMultiple(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_UnderlyingMultiple_set(swigCPtr, this, value);
  }

  public double getUnderlyingMultiple() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_UnderlyingMultiple_get(swigCPtr, this);
  }

  public void setCombinationType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_CombinationType_set(swigCPtr, this, value);
  }

  public char getCombinationType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcInstrumentField_CombinationType_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcInstrumentField(), true);
  }

}
