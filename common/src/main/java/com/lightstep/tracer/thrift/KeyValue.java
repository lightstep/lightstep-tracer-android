/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.lightstep.tracer.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-12-21")
public class KeyValue implements org.apache.thrift.TBase<KeyValue, KeyValue._Fields>, java.io.Serializable, Cloneable, Comparable<KeyValue> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("KeyValue");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("Key", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("Value", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new KeyValueStandardSchemeFactory());
    schemes.put(TupleScheme.class, new KeyValueTupleSchemeFactory());
  }

  public String Key; // required
  public String Value; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY((short)1, "Key"),
    VALUE((short)2, "Value");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEY
          return KEY;
        case 2: // VALUE
          return VALUE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("Key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("Value", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(KeyValue.class, metaDataMap);
  }

  public KeyValue() {
  }

  public KeyValue(
    String Key,
    String Value)
  {
    this();
    this.Key = Key;
    this.Value = Value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeyValue(KeyValue other) {
    if (other.isSetKey()) {
      this.Key = other.Key;
    }
    if (other.isSetValue()) {
      this.Value = other.Value;
    }
  }

  public KeyValue deepCopy() {
    return new KeyValue(this);
  }

  @Override
  public void clear() {
    this.Key = null;
    this.Value = null;
  }

  public String getKey() {
    return this.Key;
  }

  public KeyValue setKey(String Key) {
    this.Key = Key;
    return this;
  }

  public void unsetKey() {
    this.Key = null;
  }

  /** Returns true if field Key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.Key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.Key = null;
    }
  }

  public String getValue() {
    return this.Value;
  }

  public KeyValue setValue(String Value) {
    this.Value = Value;
    return this;
  }

  public void unsetValue() {
    this.Value = null;
  }

  /** Returns true if field Value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.Value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.Value = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return getKey();

    case VALUE:
      return getValue();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return isSetKey();
    case VALUE:
      return isSetValue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof KeyValue)
      return this.equals((KeyValue)that);
    return false;
  }

  public boolean equals(KeyValue that) {
    if (that == null)
      return false;

    boolean this_present_Key = true && this.isSetKey();
    boolean that_present_Key = true && that.isSetKey();
    if (this_present_Key || that_present_Key) {
      if (!(this_present_Key && that_present_Key))
        return false;
      if (!this.Key.equals(that.Key))
        return false;
    }

    boolean this_present_Value = true && this.isSetValue();
    boolean that_present_Value = true && that.isSetValue();
    if (this_present_Value || that_present_Value) {
      if (!(this_present_Value && that_present_Value))
        return false;
      if (!this.Value.equals(that.Value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Key = true && (isSetKey());
    list.add(present_Key);
    if (present_Key)
      list.add(Key);

    boolean present_Value = true && (isSetValue());
    list.add(present_Value);
    if (present_Value)
      list.add(Value);

    return list.hashCode();
  }

  @Override
  public int compareTo(KeyValue other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Key, other.Key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Value, other.Value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("KeyValue(");
    boolean first = true;

    sb.append("Key:");
    if (this.Key == null) {
      sb.append("null");
    } else {
      sb.append(this.Key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Value:");
    if (this.Value == null) {
      sb.append("null");
    } else {
      sb.append(this.Value);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (Key == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Key' was not present! Struct: " + toString());
    }
    if (Value == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Value' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class KeyValueStandardSchemeFactory implements SchemeFactory {
    public KeyValueStandardScheme getScheme() {
      return new KeyValueStandardScheme();
    }
  }

  private static class KeyValueStandardScheme extends StandardScheme<KeyValue> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, KeyValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Key = iprot.readString();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Value = iprot.readString();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, KeyValue struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeString(struct.Key);
        oprot.writeFieldEnd();
      }
      if (struct.Value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeString(struct.Value);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeyValueTupleSchemeFactory implements SchemeFactory {
    public KeyValueTupleScheme getScheme() {
      return new KeyValueTupleScheme();
    }
  }

  private static class KeyValueTupleScheme extends TupleScheme<KeyValue> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, KeyValue struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.Key);
      oprot.writeString(struct.Value);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, KeyValue struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.Key = iprot.readString();
      struct.setKeyIsSet(true);
      struct.Value = iprot.readString();
      struct.setValueIsSet(true);
    }
  }

}

